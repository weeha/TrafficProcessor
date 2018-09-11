import handlers.HereFlowHandler;
import handlers.ReferenceSchemaHandler;
import model.*;
import model.ReportSegment;
import mongoDB.EventDriver;
import mongoDB.ProviderDriver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InrixProcessor extends AbstractProcessor {

    private String referenceSchemaPath = null;
    private List<ReportSegment> segments = new ArrayList<ReportSegment>();
    private final Provider provider;

    public InrixProcessor(String path, String address, int port){
        super(path, address, port);
        providerId = getProviderId(INRIX);
        provider = new Provider(INRIX);
        provider.setId(providerId);
    }

    public void setReferenceSchemaPath(String referenceSchemaPath) {
        this.referenceSchemaPath = referenceSchemaPath;
    }

    public void getReferenceSchema(){
        if(referenceSchemaPath != null)
            try{
                XMLReader xmlReader = XMLReaderFactory.createXMLReader();
                File schema = new File(referenceSchemaPath);
                FileReader reader = new FileReader(schema);
                InputSource inputSource = new InputSource(reader);
                ReferenceSchemaHandler handler = new ReferenceSchemaHandler();
                xmlReader.setContentHandler(handler);
                xmlReader.parse(inputSource);
                segments = handler.getSegments();
            }catch(SAXException se){
                System.out.println(se);
            }catch(IOException ie){
                System.out.println(ie);
            }
    }

    public void process(){
        try {
            XMLReader xmlReader = XMLReaderFactory.createXMLReader();
            eventDriver = new EventDriver(address, port);
            eventDriver.connectToDatabase();
            for(File f : getFilesFromFolder(new File(path))){
                if(!f.getName().contains(INRIX))
                    continue;
                System.out.println(f.getName());
                try {
                    FileReader reader = new FileReader(f);
                    InputSource inputSource = new InputSource(reader);

                    InrixFlowHandler inrixHandler = new InrixFlowHandler();
                    inrixHandler.setProviderId(providerId);
                    xmlReader.setContentHandler(inrixHandler);
                    xmlReader.parse(inputSource);
                    for(TrafficEvent e : inrixHandler.getEvents()){
                        for(ReportSegment segment : segments){
                            int segmentId;
                            try{
                                segmentId =  Integer.parseInt(e.getId());
                            }catch(NumberFormatException ne){
                                continue;
                            }
                            if(segment.getSegmentId() == segmentId){
                                TrafficRoute tRoute = new TrafficRoute();
                                tRoute.setLocation(segment.getLocation());
                                tRoute.setLength(segment.getSegmentLength());
                                tRoute.setOpenLr(segment.getOpenLR());
                                tRoute.setId("" + segment.getSegmentId());
                                tRoute.setProvider(provider);
                                Route route = new Route();
                                route.setLocation(segment.getLocation());
                                tRoute.setRoute(route);
                                e.setTrafficRoute(tRoute);
                                break;
                            }
                        }
                        if(e.getTrafficRoute() != null)
                            eventDriver.insert(e);
                        else
                            System.err.println("Event without traffic route information");
                    }
                }catch(IOException ie){
                    System.err.println("Could not open File " + f.getName());
                }
            }
        }catch(SAXException se){
            System.err.println("Could not create XML Reader!");
            System.err.println(se);
        }finally {
            eventDriver.disconnect();
        }
    }


    public static void main (String [] args){
        InrixProcessor processor = new InrixProcessor("C:\\Users\\flori\\Documents\\MA_Messung_3\\Traffic", "127.0.0.1", 27017);
        processor.setReferenceSchemaPath("C:\\Users\\flori\\Documents\\Traffic\\Traffic\\2017_11_24_00_35_38_INRIX_XD_INFO.xml");
        processor.getReferenceSchema();
        processor.process();
    }
}

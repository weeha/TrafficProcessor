import handlers.HereFlowHandler;
import model.TrafficEvent;
import mongoDB.EventDriver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HereProcessor extends AbstractProcessor{

    public HereProcessor(String path, String address, int port){
        super(path, address, port);
        providerId = getProviderId(HERE);
    }

    public void process(){
        try {
            XMLReader xmlReader = XMLReaderFactory.createXMLReader();
            eventDriver = new EventDriver(address, port);
            eventDriver.connectToDatabase();
            for(File f : getFilesFromFolder(new File(path))){
                if(!f.getName().contains(HERE))
                    continue;
                System.out.println(f.getName());
                try {
                    FileReader reader = new FileReader(f);
                    InputSource inputSource = new InputSource(reader);

                    HereFlowHandler hereHandler = new HereFlowHandler();
                    hereHandler.setProviderId(providerId);
                    xmlReader.setContentHandler(hereHandler);
                    xmlReader.parse(inputSource);
                    for(TrafficEvent e : hereHandler.getEvents()){
                        eventDriver.insert(e);
                    }
                }catch(IOException ie){
                    System.err.println("Could not open File " + f.getName());
                }
            }
        }catch(SAXException se){
            System.err.println("Could not create XML Reader!");
            System.err.println(se);
        }finally{
            eventDriver.disconnect();
        }
    }

    public static void main (String [] args){
        HereProcessor processor = new HereProcessor("C:\\Users\\flori\\Documents\\Verona", "127.0.0.1", 27017);
        processor.process();
    }

}

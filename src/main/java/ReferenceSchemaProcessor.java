import handlers.HereFlowHandler;
import model.Provider;
import model.Route;
import model.TrafficEvent;
import model.TrafficRoute;
import mongoDB.EventDriver;
import mongoDB.ProviderDriver;
import mongoDB.RouteDriver;
import mongoDB.TrafficRouteDriver;
import org.bson.types.ObjectId;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class ReferenceSchemaProcessor {

    /*

    public static List<File> getFilesFromFolder(final File folder) {
        List<File> files = new ArrayList<File>();
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                for(File f : getFilesFromFolder(fileEntry)){
                    files.add(f);
                }
            } else {
                files.add(fileEntry);
            }
        }
        return files;
    }

    public static void insertProviders(){
        ProviderDriver pDriver = new ProviderDriver("127.0.0.1", 27017);
        pDriver.connectToDatabase();
        String [] providers = {"HERE", "INRIX", "TomTom"};
        for(String provider : providers)
            pDriver.insert(new Provider(provider));
        pDriver.disconnect();
    }

    public static ObjectId getProviderId(String providerName){
        ProviderDriver pDriver = new ProviderDriver("127.0.0.1", 27017);
        pDriver.connectToDatabase();
        ObjectId id = pDriver.findProviderID(new Provider(providerName));
        pDriver.disconnect();
        return id;
    }

    */

    public static void main(String [] args){

        java.util.logging.Logger.getLogger("org.mongodb.driver").setLevel(Level.SEVERE);
        /*
        try {
            insertProviders();
            // XMLReader erzeugen
            XMLReader xmlReader = XMLReaderFactory.createXMLReader();

            String folder = "C:\\Users\\flori\\Documents\\Traffic\\Integration_Test\\HERE";

            EventDriver eventDriver = new EventDriver("127.0.0.1", 27017);
            eventDriver.connectToDatabase();

            ObjectId hereId = getProviderId("HERE");

            for(File f : getFilesFromFolder(new File(folder))){
                System.out.println(f.getAbsolutePath());
                // Pfad zur XML Datei
                FileReader reader = new FileReader(f);
                InputSource inputSource = new InputSource(reader);

                // PersonenContentHandler wird übergeben
                //xmlReader.setContentHandler(new InrixFlowHandler());


                //InrixFlowHandler inrixHandler = new InrixFlowHandler();
                //xmlReader.setContentHandler(inrixHandler);
                // Parsen wird gestartet
                HereFlowHandler hereHandler = new HereFlowHandler();
                hereHandler.setProviderId(hereId);
                xmlReader.setContentHandler(hereHandler);
                xmlReader.parse(inputSource);

                RouteDriver jsonRouteDriver = new RouteDriver("127.0.0.1", 27017);
                jsonRouteDriver.connectToDatabase();
                TrafficRouteDriver jsonTrafficRouteDriver = new TrafficRouteDriver("127.0.0.1", 27017);
                jsonTrafficRouteDriver.connectToDatabase();





                for(TrafficEvent e : inrixHandler.getEvents()){

                    if(e.getId().equals("776460277"))
                        eventDriver.insert(e);
                    if(e.getId().equals("776430157"))
                        eventDriver.insert(e);
                    if(e.getId().equals("776255346"))
                        eventDriver.insert(e);
                    if(e.getId().equals("776274796"))
                        eventDriver.insert(e);
                    if(e.getId().equals("776343545"))
                        eventDriver.insert(e);
                    if(e.getId().equals("776297975"))
                        eventDriver.insert(e);
                    if(e.getId().equals("776242406"))
                        eventDriver.insert(e);
                    if(e.getId().equals("776357653"))
                        eventDriver.insert(e);
                }




                //Here Traffic Events
                int i = 0;
                for(TrafficEvent e : hereHandler.getEvents()){
                    //System.out.println(e.getTrafficRoute());
                    eventDriver.insert(e);
                    //System.out.println(e);
                    i++;
                }
                if(i == 5)
                    break;


                //Here Traffic Routes

                for(TrafficRoute r : hereHandler.getTrafficRoutes()){
                    if(r.getTmc().getDe().equals("SS12 - Quinzano")){
                        if(r.getTmc().getQd()== '+'){
                            //System.out.println(r);
                            jsonTrafficRouteDriver.insert(r);
                        }
                    }else if(r.getTmc().getDe().equals("SR11-SP35-Verona Corso Venezia")){
                        if(r.getTmc().getQd()== '+') {
                            //System.out.println(r);
                            jsonTrafficRouteDriver.insert(r);
                        }
                    }
                }



            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        }
        */
    }
}

import model.ProtobufTrafficFlowV5;
import model.TrafficEvent;
import mongoDB.EventDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class TomTomProcessor extends AbstractProcessor{

    public TomTomProcessor(String path, String address, int port){
        super(path, address, port);
        providerId = getProviderId(TomTom);
    }

    public void process(){

        InputStream input = null;
        ProtobufTrafficFlowV5.TrafficFlowGroup tGroup = null;
        EventDriver driver = new EventDriver(address, port);
        driver.connectToDatabase();
        for(File f : getFilesFromFolder(new File(path))){
            if(!f.getName().contains("proto"))
                continue;
            System.out.println(f.getName());
            try {
                input = new FileInputStream(f);
                tGroup = ProtobufTrafficFlowV5.TrafficFlowGroup.parseFrom(input);
                TomTomFlowHandler handler = new TomTomFlowHandler();
                handler.setProviderId(providerId);
                handler.addTRafficFlowGroup(tGroup);
                for(TrafficEvent e : handler.getEvents()){
                    driver.insert(e);
                }
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                try {
                    if(input != null)
                        input.close();
                }catch(IOException oe){
                    oe.printStackTrace();
                }
            }

        }
        driver.disconnect();
    }

    public static void main(String [] args){
        String path = "C:\\Users\\flori\\Documents\\Traffic\\Flows\\single";
        TomTomProcessor processor = new TomTomProcessor(path, "localhost", 27017);
        processor.process();
    }
}

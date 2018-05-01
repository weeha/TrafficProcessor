import model.Provider;
import mongoDB.EventDriver;
import mongoDB.ProviderDriver;
import org.bson.types.ObjectId;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractProcessor {

    protected final String path;
    protected final String address;
    protected final int port;
    EventDriver eventDriver = null;
    public static final String HERE = "HERE";
    public static final String INRIX = "INRIX";
    public static final String TomTom = "TomTom";
    ObjectId providerId;

    public AbstractProcessor(String path, String address, int port){
        this.path = path;
        this.address = address;
        this.port = port;
    }

    abstract void process();

    protected ObjectId getProviderId(String providerName){
        ObjectId id = null;
        try {
            ProviderDriver pDriver = new ProviderDriver(address, port);
            pDriver.connectToDatabase();
            id = pDriver.findProviderID(new Provider(providerName));
            pDriver.disconnect();
        }catch(Exception e){}
        return id;
    }

    protected List<File> getFilesFromFolder(final File folder) {
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


}

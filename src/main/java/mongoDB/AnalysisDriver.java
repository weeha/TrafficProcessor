package mongoDB;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public abstract class AnalysisDriver {

    private final String address;
    private final int port;
    private MongoClient mongo = null;
    protected MongoDatabase database = null;
    protected MongoCollection<Document> collection = null;
    public static final String DB_NAME = "Evaluation";

    public AnalysisDriver(String address, int port){

        this.address = address;
        this.port = port;
        mongo = new MongoClient(this.address, this.port);
    }

    public String getAddress() {
        return address;
    }

    public int getPort() {
        return port;
    }

    public void connectToDatabase(){
        database = mongo.getDatabase(DB_NAME);
    }

    public void disconnect(){
        if(mongo != null)
            mongo.close();
    }

    public abstract void insert(Object o);

    protected abstract boolean exists(Object o);

}

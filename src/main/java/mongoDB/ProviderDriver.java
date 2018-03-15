package mongoDB;

import com.mongodb.client.FindIterable;
import com.mongodb.client.model.Filters;
import model.Provider;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.Iterator;

public class ProviderDriver extends AnalysisDriver {

    public static final String COLLECTION_NAME = "providers";

    public ProviderDriver(String address, int port){
        super(address, port);
    }

    public void insert(Object o){
        if (!(o instanceof Provider))
            throw new IllegalArgumentException("No TrafficRoute object for inserting selected");
        if(database != null){
            Provider provider = (Provider) o;
            if(collection == null)
                collection = database.getCollection(COLLECTION_NAME);
            if(! exists(provider)){
                Document document = new Document("name", provider.getName());
                collection.insertOne(document);
            }else{
                System.out.println("Provider already exists");
            }
        }


    }

    protected boolean exists(Object o) {
        if (o instanceof Provider) {
            if (collection == null)
                collection = database.getCollection(ProviderDriver.COLLECTION_NAME);
            Provider provider = (Provider) o;
            FindIterable iterDoc = collection.find().filter(Filters.eq("name", provider.getName()));
            Iterator it = iterDoc.iterator();
            return it.hasNext();
        } else {
            throw new IllegalArgumentException("No Provider object");
        }
    }

    public Object findProvider(Provider p){
        if(collection == null)
            collection = database.getCollection(COLLECTION_NAME);
        FindIterable iterDoc = collection.find().filter(Filters.eq("name", p.getName()));
        Iterator it = iterDoc.iterator();
        return it.hasNext() ? it.next() : null;
    }

    public ObjectId findProviderID(Provider p){
        Document d = (Document) findProvider(p);
        return d != null ? d.getObjectId("_id") : null;
    }
}

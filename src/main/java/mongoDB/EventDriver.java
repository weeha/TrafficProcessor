package mongoDB;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import model.TrafficEvent;
import model.TrafficRoute;
import org.bson.Document;
import org.bson.types.ObjectId;
import java.util.Iterator;

public class EventDriver  extends AnalysisDriver {

    public static final String COLLECTION_NAME = "trafficevents";
    protected MongoCollection<Document> trafficRouteCollection = null;
    private final TrafficRouteDriver tRouteDriver;

    public EventDriver(String address, int port){
        super(address, port);
        tRouteDriver = new TrafficRouteDriver(address, port);
        tRouteDriver.connectToDatabase();
    }

    public void insert(Object o)throws IllegalArgumentException{
        if(!(o instanceof TrafficEvent))
            throw new IllegalArgumentException("No TrafficEvent object for inserting selected");
        if(database != null){
            TrafficEvent event = (TrafficEvent) o;
            if(collection == null){
                collection = database.getCollection(COLLECTION_NAME);
            }
            ObjectId trafficRoute = null;
            trafficRoute = findTrafficRouteId(event);
            if(trafficRoute == null){
                System.out.println("No traffic route found... Try creating one");
                tRouteDriver.insert(event.getTrafficRoute());
                trafficRoute = findTrafficRouteId(event);
                //return;
            }
            event.setTrafficRouteId(trafficRoute);
            if(!exists(event)){
                if(trafficRoute != null) {
                    Document doc = new Document("timeStamp", event.getTimeStamp())
                            .append("speed", event.getSpeed())
                            .append("freeFlow", event.getFreeFlowSpeed())
                            .append("confidence", event.getConfidence())
                            .append("travelTime", event.getTravelTime())
                            .append("trafficRoute", event.getTrafficRouteId());

                    // db.trafficroute.updateOne({"_id": ObjectId("5a6e5b87482013596cfb71c8")}, {$addToSet: {"trafficEvents": "Test"}})

                    collection.insertOne(doc);
                    ObjectId id = (ObjectId)doc.get( "_id" );
                    tRouteDriver.addTrafficEvent(id, trafficRoute);
                }else{
                    System.err.println("Couldn't insert event. Missing traffic route..");
                }
            }else{
                System.out.println("Event already exists");
            }
        }
    }

    public boolean exists(Object o)throws IllegalArgumentException{
        if(o instanceof TrafficEvent){
            if(collection == null)
                collection = database.getCollection(COLLECTION_NAME);
            TrafficEvent event = (TrafficEvent) o;
            /*
            {'location.coordinates': [[10.94703, 45.47676], [10.94708, 45.47674], [10.94739, 45.47663]]}
             */
            FindIterable iterDoc = collection.find().filter(Filters.and(
                    Filters.eq("timeStamp", event.getTimeStamp())
                    , Filters.eq("trafficRoute", event.getTrafficRouteId())));
            Iterator it = iterDoc.iterator();
            return it.hasNext();
        }
        else{
            throw new IllegalArgumentException("No TrafficEvent object");
        }
    }

    public ObjectId findTrafficRouteId(TrafficEvent event) {
        if (event.getId() != null)
            return findTrafficRouteWithId(event);
        else
            return findTrafficRouteWithCoordinates(event);
    }

    public Object findTrafficRoute(TrafficEvent event){
        if(trafficRouteCollection == null)
            trafficRouteCollection = database.getCollection(TrafficRouteDriver.COLLECTION_NAME);
        FindIterable iterDoc = trafficRouteCollection.find().filter(Filters.eq("location.coordinates", event.getLocation().getCoordinates()));
        Iterator it = iterDoc.iterator();
        return it.hasNext() ? it.next() : null;
    }

    public Object findTrafficRoute(String id){
        if(trafficRouteCollection == null)
            trafficRouteCollection = database.getCollection(TrafficRouteDriver.COLLECTION_NAME);
        FindIterable iterDoc = trafficRouteCollection.find().filter(Filters.eq("providerId", id));
        Iterator it = iterDoc.iterator();
        return it.hasNext() ? it.next() : null;
    }

    public ObjectId findTrafficRouteWithCoordinates(TrafficEvent e){
        Document d = (Document) findTrafficRoute(e);
        return d != null ? d.getObjectId("_id") : null;
    }

    public ObjectId findTrafficRouteWithId(TrafficEvent e){
        Document d = (Document) findTrafficRoute(e.getId());
        return d != null ? d.getObjectId("_id") : null;
    }

    public static void main(String [] args){
        EventDriver eDriver = new EventDriver("127.0.0.1", 27017);
        eDriver.connectToDatabase();

        TrafficRouteDriver rDriver = new TrafficRouteDriver("127.0.0.1", 27017);
        rDriver.connectToDatabase();

    }
}

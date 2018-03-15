package mongoDB;

import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import model.Coordinate;
import model.Location;
import model.Route;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.Iterator;
import java.util.List;

public class RouteDriver extends AnalysisDriver {


    public static final String COLLECTION_NAME = "routes";

    public RouteDriver(String address, int port){
        super(address, port);
    }

    public void insert(Object route)throws IllegalArgumentException{
        if(!(route instanceof Route))
            throw new IllegalArgumentException("No Route object for inserting selected");
        if (database != null) {
            Route newRoute = (Route) route;
            if(collection == null)
                collection = database.getCollection(COLLECTION_NAME);
            if(!exists(newRoute)) {
                //check if new route is a negative one and make linking
                ObjectId reverseObjectId = findReverseId(newRoute.getId());
                /*
                if(newRoute.isNegativeRoute()) {
                    positiveRoute = findReverseId(newRoute.getId());
                    if (positiveRoute == null) {
                        positiveRoute = insertAndGetId(newRoute.createPositiveRoute());
                    }
                }
                */
                Document document = new Document("name", newRoute.getName())
                        .append("linkid", newRoute.getId())
                        .append("location", newRoute.getLocation())
                        .append("length", newRoute.getLength())
                        .append("negative", newRoute.isNegativeRoute())
                        .append("hasreverse", newRoute.hasReverse())
                        .append("linkedroute" , null);
                collection.insertOne(document);
                if(reverseObjectId != null){
                    System.out.println("Linking reverse route");
                    linkRoutes((ObjectId)document.get("_id"), reverseObjectId);
                }
            }else
                System.out.println("Route already exists!");
        }
    }

    public void linkRoutes(ObjectId negative, ObjectId positive){
        if(collection == null)
            collection = database.getCollection(COLLECTION_NAME);
        BasicDBObject setFirst = new BasicDBObject("$set", new BasicDBObject("linkedroute", positive));
        BasicDBObject setSecond = new BasicDBObject("$set", new BasicDBObject("linkedroute", negative));
        BasicDBObject setHasNegative = new BasicDBObject("$set", new BasicDBObject("hasreverse", true));
        collection.findOneAndUpdate(Filters.eq("_id", negative), setFirst);
        collection.findOneAndUpdate(Filters.eq("_id", negative), setHasNegative);
        collection.findOneAndUpdate(Filters.eq("_id", positive), setSecond);
        collection.findOneAndUpdate(Filters.eq("_id", positive), setHasNegative);
    }

    public ObjectId insertAndGetId(Object route)throws IllegalArgumentException{
        if(!(route instanceof Route))
            throw new IllegalArgumentException("No Route object for inserting selected");
        if (database != null) {
            Route newRoute = (Route) route;
            if(collection == null)
                collection = database.getCollection(COLLECTION_NAME);
            if(!exists(newRoute)) {
                //check if new route is a negative one and make linking
                ObjectId reverseObjectId = findReverseId(newRoute.getId());
                /*
                if(newRoute.isNegativeRoute()) {
                    positiveRoute = findReverseId(newRoute.getId());
                    if (positiveRoute == null) {
                        positiveRoute = insertAndGetId(newRoute.createPositiveRoute());
                    }
                }
                */
                Document document = new Document("name", newRoute.getName())
                        .append("linkid", newRoute.getId())
                        .append("location", newRoute.getLocation())
                        .append("length", newRoute.getLength())
                        .append("negative", newRoute.isNegativeRoute())
                        .append("hasreverse", newRoute.hasReverse())
                        .append("linkedroute" , null);
                collection.insertOne(document);
                if(reverseObjectId != null){
                    System.out.println("Linking reverse route");
                    linkRoutes((ObjectId)document.get("_id"), reverseObjectId);
                }
                return (ObjectId) document.get("_id");
            }else {
                System.out.println("Route already exists!");
                return findRouteID(newRoute.getLocation());
            }
        }
        return null;
    }

    public boolean exists(Object o)throws IllegalArgumentException{
        if(o instanceof Route ){
            if(collection == null)
                collection = database.getCollection(COLLECTION_NAME);
            Route newRoute = (Route) o;
            /*
            {'location.coordinates': [[10.94703, 45.47676], [10.94708, 45.47674], [10.94739, 45.47663]]}
             */
            FindIterable iterDoc = collection.find().filter(Filters.eq("linkid", newRoute.getId()));
            Iterator it = iterDoc.iterator();
            return it.hasNext();
        }
        else{
            throw new IllegalArgumentException("No Route object");
        }
    }

    public boolean isReverse(Object o)throws IllegalArgumentException{
        if(o instanceof Route ){
            if(collection == null)
                collection = database.getCollection(COLLECTION_NAME);
            Route newRoute = (Route) o;
            /*
            {'location.coordinates': [[10.94703, 45.47676], [10.94708, 45.47674], [10.94739, 45.47663]]}
             */
            FindIterable iterDoc = collection.find().filter(Filters.eq("location.coordinates", newRoute.getLocation().getReverseCoordinates()));
            Iterator it = iterDoc.iterator();
            return it.hasNext();
        }
        else{
            throw new IllegalArgumentException("No Route object");
        }
    }


    public Object findRoute(String id){
        if(collection == null)
            collection = database.getCollection(COLLECTION_NAME);
        FindIterable iterDoc = collection.find().filter(Filters.eq("_id", new ObjectId(id)));
        Iterator it = iterDoc.iterator();
        return it.next();
    }

    public Object findRoute(Location loc){
        if(collection == null)
            collection = database.getCollection(COLLECTION_NAME);
        if(loc == null)
            return null;
        FindIterable iterDoc = collection.find().filter(Filters.eq("location.coordinates", loc.getCoordinates()));
        Iterator it = iterDoc.iterator();
        return it.hasNext() ? it.next() : null;
    }

    public ObjectId findReverseId(int linkId){
        if(collection == null)
            collection = database.getCollection(COLLECTION_NAME);
        FindIterable iterDoc = collection.find().filter(Filters.eq("linkid", (linkId * -1)));
        Iterator it = iterDoc.iterator();
        if(it.hasNext()){
            Document d = (Document) it.next();
            return d.getObjectId("_id");
        }
        return null;
    }

    public ObjectId findRouteID(Location loc){
        Document d = (Document) findRoute(loc);
        return d != null ? d.getObjectId("_id") : null;
    }

    public static void main(String [] args){

        RouteDriver driver = new RouteDriver("127.0.0.1", 27017);
        driver.connectToDatabase();
        //Location l = new Location();
        //Coordinate start = new Coordinate(10.1003, 45.47322);
        //Coordinate end = new Coordinate(10.9503, 45.47309);
        //l.addCoordinates(start);
        //l.addCoordinates(end);
        //System.out.println(l.getCoordinates());
        //System.out.println(l.getReverseCoordinates());

        Route r = new Route("Test");
        r.setId(123);
        Location l = new Location();
        Coordinate start = new Coordinate(10.9681, 45.46229);
        Coordinate end = new Coordinate(10.96757, 45.46256);
        l.addCoordinates((start));
        l.addCoordinates(end);
        r.setLocation(l);
        System.out.println(driver.exists(r));
        System.out.println(driver.findRouteID(l));
        //driver.insert(r);
        //driver.insert(r);
        driver.disconnect();
    }
}

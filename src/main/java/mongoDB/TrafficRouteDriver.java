package mongoDB;

import com.mongodb.BasicDBObject;
import com.mongodb.WriteResult;
import com.mongodb.client.FindIterable;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.UpdateResult;
import model.*;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TrafficRouteDriver extends AnalysisDriver{

    public static final String COLLECTION_NAME = "trafficroutes";
    private final RouteDriver rDriver;

    public TrafficRouteDriver(String address, int port){
        super(address, port);
        rDriver = new RouteDriver(address, port);
        rDriver.connectToDatabase();
    }

    public void insert(Object o){
        if(!(o instanceof TrafficRoute))
            throw new IllegalArgumentException("No TrafficRoute object for inserting selected");
        if(database != null){
            TrafficRoute trafficRoute = (TrafficRoute)o;
            if(collection == null)
                collection = database.getCollection(COLLECTION_NAME);
            //ObjectId id  = rDriver.findRouteID(trafficRoute.getRoute().getLocation());
            ObjectId id  = rDriver.findRouteID(trafficRoute.getRoute().getLocation());
            List<ObjectId> matchedRoutes = new ArrayList<ObjectId>();
            if(id == null){
                System.out.println("No route found. Try matching one...");
                RouteMatcher matcher = new RouteMatcher(trafficRoute);
                String matchingString = matcher.callRouteMatchApi();
                List<Route> routes = matcher.match(matchingString);
                if(routes.size() == 0){
                    System.out.println("Could not match any routes!");
                }else{
                    for(Route r : routes){
                        ObjectId routeId = rDriver.insertAndGetId(r);
                        System.out.println(routeId);
                        if(routeId != null) {
                            matchedRoutes.add(routeId);
                            //System.out.println(routeId);
                        }
                        else
                            System.err.println("Something went wrong...;");
                }
                }
            }else{
                System.out.println("Route found for matching...");
                System.out.println(trafficRoute);
                matchedRoutes.add(id);
                System.out.println(matchedRoutes);
            }
            if(!exists(trafficRoute)){
                System.out.println("Inserting new Traffic Route");
                Document document = new Document("providerId", trafficRoute.getId())
                        .append("provider", trafficRoute.getProvider().getId())
                        .append("location", trafficRoute.getLocation())
                        .append("length", trafficRoute.getLength())
                        .append("tmc", trafficRoute.getTmc())
                        .append("openLR", trafficRoute.getOpenLr())
                        .append("trafficEvents", new ArrayList<ObjectId>())
                        .append("routes", matchedRoutes);
                collection.insertOne(document);
            }else
                System.out.println("Traffic route already exists!");
        }
    }

    public ObjectId updateRouteId(Object o){
        if(!(o instanceof TrafficRoute))
            throw new IllegalArgumentException("No TrafficRoute object for inserting selected");
        if(database != null){
            TrafficRoute route = (TrafficRoute)o;
            if(collection == null)
                collection = database.getCollection(COLLECTION_NAME);
            ObjectId id  = rDriver.findRouteID(route.getRoute().getLocation());
            if(id != null){
                List<ObjectId> idList= new ArrayList<ObjectId>();
                idList.add(id);
                BasicDBObject set = new BasicDBObject("$set", new BasicDBObject("routes", idList));
                ObjectId traffficRouteId = findTrafficRouteID(route.getLocation());
                collection.findOneAndUpdate(Filters.eq("_id", traffficRouteId), set);
                return id;
            }
        }
        return null;
    }

    private ObjectId findTrafficRouteID(Location loc){
        Document d = (Document) findTrafficRoute(loc);
        return d != null ? d.getObjectId("_id") : null;
    }

    private Object findTrafficRoute(Location loc){
        if(collection == null)
            collection = database.getCollection(COLLECTION_NAME);
        FindIterable iterDoc = collection.find().filter(Filters.eq("location.coordinates", loc.getCoordinates()));
        Iterator it = iterDoc.iterator();
        return it.hasNext() ? it.next() : null;
    }

    public boolean exists(Object o){
        if(o instanceof TrafficRoute){
            if(collection == null)
                collection = database.getCollection(TrafficRouteDriver.COLLECTION_NAME);
            TrafficRoute route = (TrafficRoute) o;
            /*
            {'location.coordinates': [[10.94703, 45.47676], [10.94708, 45.47674], [10.94739, 45.47663]]}
             */
            FindIterable iterDoc = collection.find().filter(Filters.eq("location.coordinates", route.getLocation().getCoordinates()));
            Iterator it = iterDoc.iterator();
            return it.hasNext();
        }
        else{
            throw new IllegalArgumentException("No TrafficRoute object");
        }
    }

    public UpdateResult addTrafficEvent(ObjectId eventId, ObjectId trafficRouteId){
        if(database == null)
            connectToDatabase();
        if(collection == null)
            collection = database.getCollection(TrafficRouteDriver.COLLECTION_NAME);
        // db.trafficroute.updateOne({"_id": ObjectId("5a6e5b87482013596cfb71c8")}, {$addToSet: {"trafficEvents": "Test"}})
        return collection.updateOne(Filters.eq("_id", trafficRouteId), new BasicDBObject("$addToSet", new BasicDBObject("trafficEvents", eventId)));
    }


}

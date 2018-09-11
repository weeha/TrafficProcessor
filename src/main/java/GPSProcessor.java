import handlers.GPXHandler;
import model.*;
import model.location.TracePoint;
import mongoDB.EventDriver;
import mongoDB.ProviderDriver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.lang.Math.toIntExact;

public class GPSProcessor extends AbstractProcessor{

    public GPSProcessor(String path,String address, int port){
        super(path, address, port);
    }

    private List<GPX> getGpxData(File s){
        try {
            FileReader reader = new FileReader(s);
            InputSource inputSource = new InputSource(reader);
            XMLReader xmlReader = XMLReaderFactory.createXMLReader();
            GPXHandler handler = new GPXHandler();
            xmlReader.setContentHandler(handler);
            xmlReader.parse(inputSource);
            reader.close();
            return handler.getGpxData();
        }catch(SAXException se){

        }catch(IOException ie){

        }
        return null;
    }

    public void process(){
        RouteMatcher m = new RouteMatcher(null);
        List<TrafficEvent> anprEvents = new ArrayList<TrafficEvent>();
        TrafficEvent anprEvent = null;
        boolean endReached = false;
        boolean startReached = false;
        Date startTime = null;
        for(File f : getFilesFromFolder(new File(path))){
            if(!f.getName().contains("gpx"))
                continue;
            System.out.println(f.getName());
            List<GPX> gpx = getGpxData(f);
            try {
                FileReader reader = new FileReader(f);
                BufferedReader br = new BufferedReader(reader);
                String line = null;
                String result = "";
                while((line = br.readLine()) != null){
                    result += line;
                }
                String answer = m.callRouteMatchFromString(result);
                System.out.println(answer);
                List<Route> routes = m.matchGpx(answer);
                List<TracePoint> points = m.getPoints();

                List<TrafficEvent> events = createEvents(routes, points, gpx);

                for(TrafficEvent e : events){
                    int locationId = isAnprLocation(e.getLocation());
                    if(locationId > 0){
                        //start
                        if(locationId == 1){
                            if(anprEvent != null && endReached){
                                anprEvents.add(anprEvent);
                                endReached = false;
                            }
                            if(!startReached) {
                                startTime = e.getTimeStamp();
                                anprEvent = e;
                                Location start = new Location();
                                Coordinate startCoordinate = new Coordinate(
                                        e.getLocation().getCoordinates().get(0).get(0),
                                        e.getLocation().getCoordinates().get(0).get(1));
                                start.addCoordinates(startCoordinate);
                                anprEvent.setLocation(start);
                            }
                            startReached = true;
                        }
                        if(locationId == 2){
                            endReached = false;
                            startReached = false;
                        }
                        //end
                        if(locationId == 3){

                            if(anprEvent != null) {
                                if(!endReached) {
                                    int lastCoords = e.getLocation().getCoordinates().size() - 1;
                                    Coordinate endCoordinate = new Coordinate(
                                            e.getLocation().getCoordinates().get(lastCoords).get(0),
                                            e.getLocation().getCoordinates().get(lastCoords).get(1));
                                    anprEvent.getLocation().addCoordinates(endCoordinate);
                                    if (anprEvent.getRoute() != null)
                                        anprEvent.getRoute().setLocation(anprEvent.getLocation());
                                    if (anprEvent.getTrafficRoute() != null)
                                        anprEvent.getTrafficRoute().setLocation(anprEvent.getLocation());
                                }
                                anprEvent.setTravelTime(toIntExact((e.getTimeStamp().getTime() - startTime.getTime()) / 1000));
                                anprEvent.setSpeed(Math.round(((300 / 1000.0) / (anprEvent.getTravelTime() / 3600.0)) * 100.0) / 100.0);
                                anprEvent.setTimeStamp(e.getTimeStamp());
                            }
                            endReached = true;
                            startReached = false;
                        }

                    }
                }

            }catch(IOException ie){

            }
        }
        EventDriver driver = new EventDriver("127.0.0.1", 27017);
        driver.connectToDatabase();
        for(TrafficEvent e : anprEvents){
            if(e.getLocation().getCoordinates().size() > 2){
                e.getLocation().getCoordinates().remove(2);
            }
            driver.insert(e);
            System.out.println("_________________________");
            System.out.println(e);
        }
        driver.disconnect();
    }

    private int isAnprLocation(Location l){
        // 11.55813,48.15027
        // 11.55822,48.14999
        // 11.55835,48.14957
        // 11.55853,48.14893
        Coordinate c_1_1 = new Coordinate(11.55813,48.15027);
        Coordinate c_1_2 = new Coordinate(11.55822,48.14999);
        Coordinate c_1_3 = new Coordinate(11.55835,48.14957);
        Coordinate c_1_4 = new Coordinate(11.55853,48.14893);
        Location r1 = new Location();
        r1.addCoordinates(c_1_1);
        r1.addCoordinates(c_1_2);
        r1.addCoordinates(c_1_3);
        r1.addCoordinates(c_1_4);
        // 11.55853,48.14893
        // 11.55858,48.14874
        // 11.55867,48.14838
        // 11.55874,48.14813
        Coordinate c_2_1 = new Coordinate(11.55853,48.14893);
        Coordinate c_2_2 = new Coordinate(11.55858,48.14874);
        Coordinate c_2_3 = new Coordinate(11.55867,48.14838);
        Coordinate c_2_4 = new Coordinate(11.55874,48.14813);
        Location r2 = new Location();
        r2.addCoordinates(c_2_1);
        r2.addCoordinates(c_2_2);
        r2.addCoordinates(c_2_3);
        r2.addCoordinates(c_2_4);
        // 11.55874,48.14813
        // 11.55876,48.148
        // 11.55878,48.14787
        // 11.55878,48.14779
        // 11.55877,48.14771
        // 11.55874,48.14758
        Coordinate c_3_1 = new Coordinate(11.55874,48.14813);
        Coordinate c_3_2 = new Coordinate(11.55876,48.148);
        Coordinate c_3_3 = new Coordinate(11.55878,48.14787);
        Coordinate c_3_4 = new Coordinate(11.55878,48.14779);
        Coordinate c_3_5 = new Coordinate(11.55877,48.14771);
        Coordinate c_3_6 = new Coordinate(11.55874,48.14758);
        Location r3 = new Location();
        r3.addCoordinates(c_3_1);
        r3.addCoordinates(c_3_2);
        r3.addCoordinates(c_3_3);
        r3.addCoordinates(c_3_4);
        r3.addCoordinates(c_3_5);
        r3.addCoordinates(c_3_6);
        if(l.equals(r1))
            return 1;
        if(l.equals(r2))
            return 2;
        if(l.equals(r3))
            return 3;
        return 0;
    }

    private List<TrafficEvent> createEvents(List<Route> routes, List<TracePoint> points, List<GPX> gpx){
        List<TrafficEvent> events = new ArrayList<TrafficEvent>();
        for(Route route : routes) {
            List<GPX> matchedGpx = new ArrayList<GPX>();
            List<TracePoint> matchedTracePoints = new ArrayList<TracePoint>();
            for (TracePoint p : points) {
                if(route.getId().equals(p.getLinkId())){
                    matchedTracePoints.add(p);
                    for (GPX g : gpx) {
                        if (g.getLocation().equals(p.getLocation())) {
                            matchedGpx.add(g);
                        }
                    }
                }

            }
            if(matchedGpx.size()<1)
                continue;
            TrafficEvent event = new TrafficEvent();
            TrafficRoute tRoute = new TrafficRoute();
            tRoute.setRoute(route);
            tRoute.setLocation(route.getLocation());
            tRoute.setProvider(getProvider());
            event.setRoute(route);
            event.setTrafficRoute(tRoute);
            event.setTimeStamp(matchedGpx.get(matchedGpx.size()-1).getDate());
            event.setSpeed(calcAverageSpeed(matchedGpx));
            event.setTravelTime(calcTravelTime(matchedGpx));
            event.setLocation(route.getLocation());
            events.add(event);
        }
        return events;
    }

    private Provider getProvider(){
        Provider p = new Provider("GPS");
        ProviderDriver pDriver = new ProviderDriver("127.0.0.1", 27017);
        pDriver.connectToDatabase();
        p.setId(pDriver.findProviderID(p));
        pDriver.disconnect();
        return p;
    }

    private Location getLocationFromPoints(List<TracePoint> points){
        Location loc = new Location();
        Coordinate start = new Coordinate(points.get(0).getLon(), points.get(0).getLat());
        Coordinate end = new Coordinate(points.get(points.size()-1).getLon(), points.get(points.size()-1).getLat());
        loc.addCoordinates(start);
        loc.addCoordinates(end);
        return loc;
    }

    private int calcTravelTime(List<GPX> gpx){
        // 1 second samples
        return gpx.size();
    }

    private double calcAverageSpeed(List<GPX> gpx){
        double aSpeed = 0;
        for(GPX g : gpx){
            aSpeed += g.getSpeed();
        }
        return aSpeed/gpx.size();
    }

    public static void main(String[]args){
        String path = "C:\\Users\\flori\\Documents\\Traffic\\files\\gpx";
        GPSProcessor processor = new GPSProcessor(path, "127.0.0.1", 27017);
        processor.process();
    }
}

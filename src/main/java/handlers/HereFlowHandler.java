package handlers;

import model.*;
import org.bson.types.ObjectId;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HereFlowHandler extends DefaultHandler {

    private String currentValue;
    private String routeName;
    private String direction;
    private Double routeLength;
    private Route route;
    private TrafficEvent event;
    private TrafficRoute trafficRoute;
    private TMC tmc;
    private String id;
    private boolean shp = false;
    private List<Route> routes = new ArrayList<Route>();
    private List<TrafficEvent> hereTrafficEvents = new ArrayList<TrafficEvent>();
    private List<TrafficRoute> hereRoutes = new ArrayList<TrafficRoute>();
    Pattern pattern = Pattern.compile("([0-9]+.[0-9]+,[0-9]+.[0-9]+)");
    private int flowRunner = -1;
    private int oldFlowrunner = 0;
    private boolean initial = true;
    private Date timeStamp = null;
    private Provider here = new Provider("HERE");

    public void setProviderId(ObjectId id){
        here.setId(id);
    }

    public void characters(char[] ch, int start, int length)
            throws SAXException {
        currentValue = new String(ch, start, length);
        if(shp){
            Location l = new Location();
            try {
                Matcher matcher = pattern.matcher(currentValue);
                Coordinate coord;
                while(matcher.find()){
                    String coordinateString = matcher.group();
                    double lon = Double.parseDouble(coordinateString.split(",")[1]);
                    double lat = Double.parseDouble(coordinateString.split(",")[0]);
                    coord = new Coordinate(lon, lat);
                    l.addCoordinates(coord);
                }
            }catch(Exception e){
                System.err.println("Couldn't process location data");
                System.err.println(e);
                System.err.println(currentValue);
            }finally {
                route.setLocation(l);
                event.setLocation(l);
                hereTrafficEvents.add(event);
                trafficRoute.setLocation(l);
            }
            shp = false;
        }
    }


    public void startElement(String uri, String localName, String qName,
                             Attributes atts) throws SAXException {
        if(localName.equals("FI")){
            if(initial){
                initial = false;
            }else
                oldFlowrunner = flowRunner + 1;
        }
        if(localName.equals("TMC")){
            int pc = Integer.parseInt(atts.getValue("PC"));
            routeName = atts.getValue("DE");
            direction = atts.getValue("QD");
            routeLength = Double.parseDouble(atts.getValue("LE"));
            tmc = new TMC(pc, routeName, direction.charAt(0), routeLength);
        }
        if(localName.equals("SHP")){
            flowRunner++;
            shp = true;
            route = new Route();
            route.setName(routeName);
            route.setDirection(direction);

            event = new TrafficEvent();
            event.setRoute(route);

            trafficRoute = new TrafficRoute();
            trafficRoute.setProvider(here);
            trafficRoute.addEvent(event);
            trafficRoute.setId(id);
            trafficRoute.setTmc(tmc);
            trafficRoute.setRoute(route);
            hereRoutes.add(trafficRoute);
            event.setTrafficRoute(trafficRoute);
        }
        if(localName.equals("RW")){
            Instant instant = Instant.parse(atts.getValue("PBT"));
            timeStamp = Date.from(instant);
            id = atts.getValue("mid");
        }
        if(localName.equals("CF")){
            for(int i = oldFlowrunner; i <= flowRunner; i++){
                TrafficEvent e = hereTrafficEvents.get(i);
                e.setSpeed(Double.parseDouble(atts.getValue("SP")));
                e.setConfidence(Double.parseDouble(atts.getValue("CN")));
                e.setFreeFlowSpeed(Double.parseDouble(atts.getValue("FF")));
                e.setTimeStamp(timeStamp);
            }
        }
    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        if(localName.equals("SHP")) {
            routes.add(route);
        }
        if(localName.equals("FIS")){
            routeName = null;
            direction = null;
        }
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public List<TrafficEvent> getEvents() {
        return hereTrafficEvents;
    }
    public List<TrafficRoute> getTrafficRoutes() {
        return hereRoutes;
    }
}

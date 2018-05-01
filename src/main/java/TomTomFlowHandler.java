import model.*;
import model.location.FirstLocationReferencePoint;
import model.location.ILocationReferencePoint;
import model.location.LastLocationReferencePoint;
import model.location.LocationReferencePointImpl;
import openlr.PhysicalFormatException;
import openlr.binary.ByteArray;
import openlr.binary.OpenLRBinaryDecoder;
import openlr.binary.data.AbstractLRP;
import openlr.binary.data.RawBinaryData;
import org.apache.commons.codec.binary.Base64;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TomTomFlowHandler {

    private List<TrafficEvent> events = new ArrayList<TrafficEvent>();
    private final OpenLRBinaryDecoder bDecoder;
    private Provider tomtom = new Provider("TomTom");

    public TomTomFlowHandler(){
        bDecoder = new OpenLRBinaryDecoder();
    }

    public void setProviderId(ObjectId id){
        tomtom.setId(id);
    }

    public List<TrafficEvent> getEvents() {
        return events;
    }

    public void addTRafficFlowGroup(ProtobufTrafficFlowV5.TrafficFlowGroup tGroup){
        Date d = new Date((long)tGroup.getMetaInformation().getCreateTimeUTCSeconds()*1000);
        for (ProtobufTrafficFlowV5.TrafficFlow flow : tGroup.getTrafficFlowList()) {
            try {
                ByteArray bytes = new ByteArray(flow.getLocation().getOpenlr().toByteArray());
                RawBinaryData raw = bDecoder.resolveBinaryData("", bytes);
                TrafficEvent event = new TrafficEvent();
                event.setSpeed(flow.getSpeed().getAverageSpeedKmph());
                event.setTravelTime(flow.getSpeed().getTravelTimeSeconds());
                event.setConfidence(flow.getSpeed().getConfidence()/100.0);
                event.setTimeStamp(d);
                Location l = decodeLocation(raw);
                event.setLocation(l);
                // TrafficRoute + provider
                String openlr = getBase64OpenLr(flow.getLocation().getOpenlr().toByteArray());
                TrafficRoute tRoute = new TrafficRoute();
                tRoute.setOpenLr(openlr);
                tRoute.setLocation(l);
                tRoute.setProvider(this.tomtom);
                event.setTrafficRoute(tRoute);
                // Route
                Route route = new Route();
                route.setLocation(l);
                tRoute.setRoute(route);
                event.setRoute(route);
                events.add(event);
            } catch (PhysicalFormatException pe) {
                System.err.println("OpenLR decoding error");
                System.out.println(pe);
            }
        }
    }

    private String getBase64OpenLr(byte[] bytes){
        byte[] bytesEncoded = Base64.encodeBase64(bytes);
        return new String(bytesEncoded);
    }

    private Location decodeLocation(RawBinaryData raw){
        Location loc = new Location();
        FirstLocationReferencePoint firstLRP = null;
        LastLocationReferencePoint lastLRP = null;
        List<LocationReferencePointImpl> intermediatePoints;
        List<LocationReferencePointImpl> lrps = new ArrayList<LocationReferencePointImpl>();;
        try {
            intermediatePoints = new ArrayList<LocationReferencePointImpl>();

            firstLRP = new FirstLocationReferencePoint(raw.getBinaryFirstLRP());
            lrps.add(firstLRP);
            ILocationReferencePoint prevLRP = firstLRP;
            if (raw.getBinaryIntermediates() != null) {
                for (AbstractLRP lrp : raw.getBinaryIntermediates()) {
                    LocationReferencePointImpl point = new LocationReferencePointImpl(lrp, prevLRP);
                    intermediatePoints.add(point);
                    lrps.add(point);
                    prevLRP = point;
                }
            }
            lastLRP = new LastLocationReferencePoint(raw.getBinaryLastLRP(), prevLRP);
            lrps.add(lastLRP);
        }catch(Exception e){
            System.err.println("Could not process OpenLR binary data");
        }
        for(LocationReferencePointImpl locRef : lrps){
            Coordinate c = new Coordinate(locRef.getLongitude(), locRef.getLatitude());loc.addCoordinates(c);
        }
        return loc.getCoordinates().size() > 0 ? loc : null;
    }
}

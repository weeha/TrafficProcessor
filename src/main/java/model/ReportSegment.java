package model;

import model.location.FirstLocationReferencePoint;
import model.location.ILocationReferencePoint;
import model.location.LastLocationReferencePoint;
import model.location.LocationReferencePointImpl;
import openlr.binary.ByteArray;
import openlr.binary.OpenLRBinaryDecoder;
import openlr.binary.data.AbstractLRP;
import openlr.binary.data.RawBinaryData;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class ReportSegment {

    private int segmentId;
    private String openLR;
    private int segmentLength;
    private FirstLocationReferencePoint firstLRP = null;
    private LastLocationReferencePoint lastLRP = null;
    private List<LocationReferencePointImpl> intermediatePoints;
    private List<LocationReferencePointImpl> lrps;

    public ReportSegment(){

    }

    public ReportSegment(int segmentId){
        this.segmentId = segmentId;
    }

    public void setOpenLR(String openLR) {
        this.openLR = openLR;
    }

    public String getOpenLR() {
        return openLR;
    }

    public int getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(int segmentId) {
        this.segmentId = segmentId;
    }

    public int getSegmentLength() {
        return segmentLength;
    }

    public void setSegmentLength(int segmentLength) {
        this.segmentLength = segmentLength;
    }

    public Location getLocation(){
        Location loc = new Location();
        ByteArray bytes = new ByteArray(openLR);
        final OpenLRBinaryDecoder bDecoder = new OpenLRBinaryDecoder();
        try {
            intermediatePoints = new ArrayList<LocationReferencePointImpl>();
            lrps = new ArrayList<LocationReferencePointImpl>();
            RawBinaryData raw = bDecoder.resolveBinaryData("", bytes);
            FirstLocationReferencePoint firstLRP = new FirstLocationReferencePoint(raw.getBinaryFirstLRP());
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

    public String toString(){
        String result = "";
        result += "SegmentID: " + segmentId + "\n";
        result += "OpenLR: " + openLR + "\n";
        result += "Segment Length: " + segmentLength + "m\n";
        return result;
    }

    public static void main(String []args){
        java.util.logging.Logger.getLogger("org.mongodb.driver").setLevel(Level.SEVERE);
        String openLR = "Cwb0pSHYcRt0A/8S/8YbRds=";
        ReportSegment segment = new ReportSegment();
        segment.setOpenLR(openLR);
        //segment.getLocation();
        System.out.println(segment.getLocation());
        double time = 1.25;
        int t = (int)(time * 60);
        System.out.println(t);
    }
}

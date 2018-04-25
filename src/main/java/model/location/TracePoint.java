package model.location;

import model.Coordinate;
import model.Location;

public class TracePoint {

    private int linkId;
    private double lat;
    private double lon;

    public TracePoint(int linkId, double lat, double lon){
        this.linkId = linkId;
        this.lat = lat;
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public int getLinkId() {
        return linkId;
    }

    public double getLon() {
        return lon;
    }

    public String toString(){
        return "" + linkId;
    }

    public Location getLocation(){
        Location l = new Location();
        Coordinate coord = new Coordinate(lon, lat);
        l.addCoordinates(coord);
        return l;
    }
}

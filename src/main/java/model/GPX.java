package model;

import java.util.Date;

public class GPX {


    private Date date;
    private double speed;
    private Location location;

    public GPX(Date d, double speed){
        this.date = d;
        this.speed = speed;
        location = null;
    }

    public void setCoordinates(double lon, double lat){
        Coordinate coordniate = new Coordinate(lon, lat);
        location = new Location();
        location.addCoordinates(coordniate);
    }

    public Date getDate() {
        return date;
    }

    public double getSpeed() {
        return speed;
    }

    public Location getLocation() {
        return location;
    }

    public String getTrkpt(){
        String result = "";
        result += "<trkpt lat=\"" + location.getCoordinates().get(0).get(1) + "\"";
        result += " lon=\"" + location.getCoordinates().get(0).get(0) + "\"";

        return result;
    }


}

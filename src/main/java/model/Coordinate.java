package model;

import com.mongodb.BasicDBObject;

import java.util.ArrayList;
import java.util.List;

public class Coordinate extends BasicDBObject {

    public static final String TYPE = "";

    private double lon;
    private double lat;

    public Coordinate(double lon, double lat){
        this.lon = lon;
        this.lat = lat;
    }

    public double getLon(){
        return lon;
    }

    public double getLat() {
        return lat;
    }

    public List<Double> getCoordinateTuple(){
        List<Double> tuple = new ArrayList<Double>();
        tuple.add(lon);
        tuple.add(lat);
        return tuple;
    }
}

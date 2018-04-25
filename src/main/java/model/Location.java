package model;

import com.mongodb.BasicDBObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Location extends BasicDBObject{

    public static final String TYPE = "type";
    private int functionalClass;

    private List<List<Double>> coordinates;

    public Location(){
        coordinates = new ArrayList<List<Double>>();
        put(TYPE, "LineString");
    }

    public Location getReverse(){
        Location reverse = new Location();
        for(List<Double> c : coordinates){
            Coordinate coord = new Coordinate(c.get(0), c.get(1));
            reverse.addReverseCoordinates(coord);
        }

        return reverse;
    }

    public List<List<Double>> getCoordinates() {
        return coordinates;
    }

    public List<List<Double>> getReverseCoordinates() {
        List<List<Double>> reverseCoordinates = coordinates;
        Collections.reverse(reverseCoordinates);
        return reverseCoordinates;
    }

    public void addCoordinates(Coordinate c){
        coordinates.add(c.getCoordinateTuple());
        put("coordinates", coordinates);
    }

    public void addReverseCoordinates(Coordinate c){
        coordinates.add(0,c.getCoordinateTuple());
        put("coordinates", coordinates);
    }

    public boolean equals(Object o){
        if(o instanceof Location){
            Location loc = (Location) o;
            if(loc.coordinates.size() != this.coordinates.size())
                return false;
            for(int i = 0; i < loc.coordinates.size(); i++){
                List<Double> coord1 = loc.coordinates.get(i);
                List<Double> coord2 = this.coordinates.get(i);
                if(!coord1.get(0).equals(coord2.get(0)))
                    if(!coord1.get(1).equals(coord2.get(1)))
                        return false;
            }
            return true;
        }
        return false;
    }

    public void setFunctionalClass(int functionalClass) {
        this.functionalClass = functionalClass;
    }

    public int getFunctionalClass() {
        return functionalClass;
    }

    public String toString(){
        String result = "Coordinates:";
        for(List<Double> c : coordinates){
            result += "\n\tLon: " + c.get(0) + ", Lat: " + c.get(1);
        }
        return result;
    }
}

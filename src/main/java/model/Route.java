package model;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Route {

    private Location location = null;
    private String name = null;
    private Double length;
    private String direction = null;
    private Integer id;
    private boolean hasReverse = false;

    public Route(String name){
        this.name = name;
    }

    public Route(){

    }

    public boolean hasReverse(){
        return hasReverse;
    }

    public boolean isNegativeRoute(){
        if(id == null)
            System.out.println("NULL ID");
        return id != null ? id < 1 : false;
    }

    public Route createPositiveRoute(){
        if(this.isNegativeRoute()) {
            Route positive = new Route(this.getName());
            positive.hasReverse = true;
            positive.id = this.id*(-1);
            positive.length = length;
            Location reverseLocation = this.location.getReverse();
            positive.setLocation(reverseLocation);
            return positive;
        }else{
            return null;
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setLengthInKilometers(double km) {
        throw new NotImplementedException();
    }

    public Double getLength() {
        return length;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public String toString(){
        String result = "Name: ";
        result += name;
        result = "Link-Id: ";
        result += id;
        result += "\nLength: ";
        result += length;
        result += "\n";
        result += location;
        return result;
    }
}

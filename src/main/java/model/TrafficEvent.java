package model;

import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrafficEvent {

    private Route route;
    private Date timeStamp;
    private double speed;
    private double freeFlowSpeed;
    private double confidence;
    private int travelTime;
    private List<Route> routes;
    private TrafficRoute tRoute;
    private Location location;
    private String id;
    private ObjectId tRouteId;

    public TrafficEvent(){
        routes = new ArrayList<Route>();
    }

    public ObjectId getTrafficRouteId() {
        return tRouteId;
    }

    public void setTrafficRouteId(ObjectId tRouteId) {
        this.tRouteId = tRouteId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public TrafficRoute getTrafficRoute() {
        return tRoute;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setTrafficRoute(TrafficRoute tRoute) {
        this.tRoute = tRoute;
    }

    public void addRoute(Route r){
        routes.add(r);
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }

    public double getConfidence() {
        return confidence;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public double getFreeFlowSpeed() {
        return freeFlowSpeed;
    }

    public void setFreeFlowSpeed(double freeFlowSpeed) {
        this.freeFlowSpeed = freeFlowSpeed;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public void setTravelTimeMinutes(double time) {
        this.travelTime = (int)(time * 60);
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public String toString(){
        String result = "";
        result += "TimeStamp: " + timeStamp;
        result += "\nSpeed: " + speed;
        result += "\nFree Flow Speed: " + freeFlowSpeed;
        result += "\nConfidence: " + confidence;
        result += "\nRoute: " + route;
        return result;
    }

}

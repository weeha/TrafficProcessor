package model;

import java.util.ArrayList;
import java.util.List;

public class TrafficRoute {

    private Location location;
    private String id;
    private Integer length;
    private TMC tmc;
    private String openLr;
    private List<TrafficEvent> events;
    private Route route;
    private Provider provider;

    public TrafficRoute(){
        events = new ArrayList<TrafficEvent>();
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Route getRoute() {
        return route;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOpenLr() {
        return openLr;
    }

    public void setOpenLr(String openLr) {
        this.openLr = openLr;
    }

    public TMC getTmc() {
        return tmc;
    }

    public void setTmc(TMC tmc) {
        this.tmc = tmc;
    }

    public List<TrafficEvent> getEvents() {
        return events;
    }

    public void addEvent(TrafficEvent e){
        events.add(e);
    }

    public String toString(){
        String result = "";
        result += "ID: " + id;
        if(getTmc() != null)
            result += "\nTMC: " + tmc;
        result += "\nLocation: " + location;
        return result;
    }

}

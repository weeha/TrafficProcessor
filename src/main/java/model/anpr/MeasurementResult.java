package model.anpr;

import java.util.Date;

public class MeasurementResult {

    private int speed;
    private int travelTime;
    private int length;
    private Date date;

    public MeasurementResult(){

    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public double getSpeedInKmH() {
        return Math.round(((length/1000.0)/(travelTime/3600.0))*100.0)/100.0;
    }

    public double getSppedInMs(){
        return Math.round((length*1.0)/(travelTime+1.0)*100.0)/100.0;
    }
}

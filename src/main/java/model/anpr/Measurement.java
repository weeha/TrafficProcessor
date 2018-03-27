package model.anpr;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Measurement {

    private String id;
    private Date date;
    private int confidence;

    private final DateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    public Measurement(String id, String date, String time){
        this.id = id;
        this.date = createDate(date, time);
    }

    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }

    public int getConfidence() {
        return confidence;
    }

    public String getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    private Date createDate(String d, String t){
        try{
            Date date = format.parse(d + " " + t);
            return date;
        }catch(ParseException pe) {
            return null;
        }
    }

    public boolean before(Measurement m){
        return this.getDate().before(m.getDate());
    }

    public boolean after(Measurement m){
        return this.getDate().after(m.getDate());
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Measurement)
            return this.id.equals(((Measurement)o).id);
        return false;
    }
}

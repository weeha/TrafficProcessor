package handlers;

import model.GPX;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GPXHandler extends DefaultHandler {

    private String currentValue;
    private double lat;
    private double lon;
    private double speedValue;
    private Date timeStamp;

    private boolean speed = false;
    private boolean time = false;
    private List<GPX> gpxData = new ArrayList<GPX>();

    public void characters(char[] ch, int start, int length)
            throws SAXException {
        currentValue = new String(ch, start, length);
        if(speed){
            speedValue = Double.parseDouble(currentValue);
            speed = false;
        }
        if(time){
            Instant instant = Instant.parse(currentValue);
            timeStamp = Date.from(instant);
            time = false;
        }
    }

    public void startElement(String uri, String localName, String qName,
                             Attributes atts) throws SAXException {
        if(localName.equals("trkpt")){
            lat = Double.parseDouble(atts.getValue("lat"));
            lon = Double.parseDouble(atts.getValue("lon"));
        }
        if(localName.equals("speed")){
            speed = true;
        }
        if(localName.equals("time")){
            time = true;
        }
    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        if(localName.equals("trkpt")){
            GPX gpx = new GPX(timeStamp, speedValue);
            gpx.setCoordinates(lon, lat);
            gpxData.add(gpx);
        }
    }

    public List<GPX> getGpxData() {
        return gpxData;
    }
}

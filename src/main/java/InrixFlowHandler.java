import model.Provider;
import model.TrafficEvent;
import org.bson.types.ObjectId;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.swing.text.Segment;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InrixFlowHandler extends DefaultHandler{

    private String currentValue;
    private FlowSegment segment;
    private TrafficEvent event;
    Date timeStamp;
    private List<TrafficEvent> events = new ArrayList<TrafficEvent>();
    private Provider inrix = new Provider("INRIX");
    private String type = "";

    public void characters(char[] ch, int start, int length)
            throws SAXException {
        currentValue = new String(ch, start, length);
    }

    public void setProviderId(ObjectId id){
        inrix.setId(id);
    }

    public void startElement(String uri, String localName, String qName,
                             Attributes atts) throws SAXException {
        if(localName.equals("Segment")){
            if(atts.getValue("segmentClosed") == null) {
                type = atts.getValue("type");
                event = new TrafficEvent();
                event.setSpeed(Double.parseDouble(atts.getValue("speed")));
                event.setFreeFlowSpeed(Double.parseDouble(atts.getValue("reference")));
                event.setId(atts.getValue("code"));
                event.setTimeStamp(timeStamp);
                event.setTravelTimeMinutes(Double.parseDouble(atts.getValue("travelTimeMinutes")));
                if(type.equals("XDS"))
                    events.add(event);
                if (atts.getValue("code").equals("776430157")) {
                    segment = new FlowSegment(Integer.parseInt(atts.getValue("code")));
                    segment.setAverageSpeed(Integer.parseInt(atts.getValue("average")));
                    segment.setSpeed(Integer.parseInt(atts.getValue("speed")));
                    segment.setReference(Integer.parseInt(atts.getValue("reference")));
                    segment.setSpeedBucket(Integer.parseInt(atts.getValue("speedBucket")));
                    segment.setTravelTimeMinutes(Double.parseDouble(atts.getValue("travelTimeMinutes")));
                }
            }
        }else if(localName.equals("SegmentSpeedResults")){
            Instant instant = Instant.parse(atts.getValue("timestamp"));
            timeStamp = Date.from(instant);
        }
    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {

    }

    public void endDocument() throws SAXException {
        if(segment != null)
            System.out.println(segment.toString() + ',' + timeStamp.getHours() + ':' + timeStamp.getMinutes() + ':' + timeStamp.getSeconds());
    }

    public List<TrafficEvent> getEvents(){
        return events;
    }

    public void endPrefixMapping(String prefix) throws SAXException {}
    public void ignorableWhitespace(char[] ch, int start, int length)
            throws SAXException {}
    public void processingInstruction(String target, String data)
            throws SAXException {}
    public void setDocumentLocator(Locator locator) {  }
    public void skippedEntity(String name) throws SAXException {}
    public void startDocument() throws SAXException {}
    public void startPrefixMapping(String prefix, String uri)
            throws SAXException {}

}

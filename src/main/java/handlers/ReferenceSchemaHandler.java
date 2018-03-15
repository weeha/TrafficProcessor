package handlers;

import model.ReportSegment;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class ReferenceSchemaHandler extends DefaultHandler{

    private String currentValue;
    private ReportSegment currentSegment = null;
    private List<ReportSegment> segments = new ArrayList<ReportSegment>();
    private boolean reportSegmentID = false;
    private boolean openlr = false;
    private boolean negLink = false;
    private boolean posLink = false;

    public List<ReportSegment> getSegments() {
        return segments;
    }

    public void characters(char[] ch, int start, int length)
            throws SAXException {
        currentValue = new String(ch, start, length);
        if(reportSegmentID && !posLink && !negLink){
            currentSegment.setSegmentId(Integer.parseInt(currentValue));
            reportSegmentID = false;
        }if(openlr){
            currentSegment.setOpenLR(currentValue);
            openlr = false;
        }
    }

    public void startElement(String uri, String localName, String qName,
                             Attributes atts) throws SAXException {
        if(localName.equals("reportSegments")){
            currentSegment = new ReportSegment();
        }if(localName.equals("ReportSegmentID")){
            reportSegmentID = true;
        }if(localName.equals("openLR")){
            openlr = true;
        }
        if(localName.equals("negLink")){
            negLink = true;
        }
        if(localName.equals("posLink")){
            posLink = true;
        }
    }
    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        if(localName.equals("reportSegments")) {
            segments.add(currentSegment);
        }if(localName.equals("negLink")){
            negLink = false;
        }
        if(localName.equals("posLink")){
            posLink = false;
        }if(localName.equals("ReportSegmentID")) {
            reportSegmentID = false;
        }
    }


}

import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class ReferenceSchemaHandler extends DefaultHandler{

    private String currentValue;
    private ReportSegment segment;
    private List<ReportSegment> segmentList = new ArrayList<ReportSegment>();

    public List<ReportSegment> getSegmentList() {
        return segmentList;
    }

    public void characters(char[] ch, int start, int length)
            throws SAXException {
        currentValue = new String(ch, start, length);
    }

    public void startElement(String uri, String localName, String qName,
                             Attributes atts) throws SAXException {
        if(localName.equals("reportSegments")){
            segment = new ReportSegment();
        }
    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        if(localName.equals("ReportSegmentID")){
            if(segment.getReportSegmentId() == null)
            segment.setReportSegmentId(currentValue);
        }
        if(localName.equals("Name")){
            segment.setSegmentName(currentValue);
        }
        if(localName.equals("openLR")){
            segment.setOpenLR(currentValue);
        }
        if(localName.equals("reportSegments")){
            segmentList.add(segment);
        }
    }


    public void endDocument() throws SAXException {
        System.out.println("Processed " +segmentList.size() + " segments");
        for(ReportSegment s : segmentList)
            System.out.println(s);
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

public class ReportSegment {

    private String reportSegmentId = null;
    private ReportSegment negLink;
    private ReportSegment posLink;
    private int length;
    private int refSpeed;
    private String segmentName;
    private ReportSegmentLRC lrc;
    private String openLR;


    public ReportSegment() {

    }

    public void setOpenLR(String olr){
        openLR = olr;
    }

    public String getOpenLR(){
        return openLR;
    }

    public void setReportSegmentId(String id) {
        reportSegmentId = id;
    }

    public String getReportSegmentId() {
        return reportSegmentId;
    }

    public void setNegLink(ReportSegment negLink) {
        this.negLink = negLink;
    }

    public ReportSegment getNegLink() {
        return negLink;
    }

    public void setPosLink(ReportSegment posLink) {
        this.posLink = posLink;
    }

    public ReportSegment getPosgLink() {
        return posLink;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setRefSpeed(int speed) {
        this.refSpeed = speed;
    }

    public int getrefSpeed() {
        return refSpeed;
    }

    public void setSegmentName(String name) {
        this.segmentName = name;
    }

    public String getSegmentName() {
        return segmentName;
    }

    public void setLRC(ReportSegmentLRC lrc) {
        this.lrc = lrc;
    }

    @Override
    public String toString(){
        return "RefernceSegment " + reportSegmentId + " with openLR code: " + openLR;
    }

}

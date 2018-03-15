import java.util.ArrayList;
import java.util.List;

public class ReportSegmentLRC {

    private String version;
    List<OLR>  locatonReferenceList;
    private int negativeOffset;
    private int positiveOffset;

    ReportSegmentLRC(){
        locatonReferenceList = new ArrayList<OLR>();
    }

    public void setVersion(String v){
        version = v;
    }

    public String getVersion(){
        return version;
    }

    public void addOpenLR(OLR openLr){
        this.locatonReferenceList.add(openLr);
    }

    public List<OLR> getLocatonReferenceList(){
        return locatonReferenceList;
    }

    public void setNegativeOffset(int neg){
        negativeOffset = neg;
    }

    public int getNegativeOffset(){
        return negativeOffset;
    }

    public void setPositiveOffset(int pos){
        positiveOffset = pos;
    }

    public int getPositiveOffset(){
        return positiveOffset;
    }
}

public class OLR {

    private int rawLongitude;
    private int rawLatitude;
    int functionalRoadClass;
    int bearing;
    int distanceNextPoint;
    boolean againstDrivingDirection;

    public OLR(){

    }

    public void setRawLongitude(int lon){
        rawLongitude = lon;
    }

    public int getRawLongitude(){
        return rawLongitude;
    }

    public void setRawLatitude(int lat){
        rawLatitude = lat;
    }

    public int getRawLatiude(){
        return rawLatitude;
    }

    public void setAgainstDrivingDirection(boolean againstDrivingDirection){
        this.againstDrivingDirection = againstDrivingDirection;
    }

    public boolean isAgainstDrivingDirection(){
        return againstDrivingDirection;
    }
}

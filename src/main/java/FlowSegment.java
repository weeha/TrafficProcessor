import java.util.Date;

public class FlowSegment {

    private int speed;
    private int averageSpeed;
    private int reference;
    private double travelTimeMinutes;
    private int speedBucket;
    private int code;
    private Date timeStamp;


    public FlowSegment(int code){
        this.code = code;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAverageSpeed(int averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public void setTravelTimeMinutes(double travelTimeMinutes) {
        this.travelTimeMinutes = travelTimeMinutes;
    }

    public void setSpeedBucket(int speedBucket) {
        this.speedBucket = speedBucket;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString(){
        String value = "";
        value += speed + ",";
        value += averageSpeed + ",";
        value += reference + ",";
        value += travelTimeMinutes + ",";
        value += speedBucket;
        return value;
    }
}

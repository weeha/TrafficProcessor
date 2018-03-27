package handlers;

import model.TrafficEvent;
import model.anpr.MeasurementResult;

import java.text.SimpleDateFormat;
import java.util.*;

public class ANPRHandler {

    private List<MeasurementResult> measurements;
    private List<TrafficEvent> events;
    private int timeInterval = 2;
    private int startSeconds = 0;
    private Integer maxTimeIncluded = null;

    public ANPRHandler(List<MeasurementResult> results, int timeInterval){
        measurements = results;
        events = new ArrayList<TrafficEvent>();
        this.timeInterval = timeInterval;
    }

    public void setMaxTimeIncluded(Integer maxTimeIncluded) {
        this.maxTimeIncluded = maxTimeIncluded;
    }

    public void setStartSeconds(int startSeconds) {
        this.startSeconds = startSeconds;
    }

    private boolean isOutlier(MeasurementResult m){
        if(maxTimeIncluded != null){
            return(m.getTravelTime() > maxTimeIncluded);
        }
        return false;
    }

    public void generateEventList(){
        sortList();
        if(measurements.size() < 1)
            return;
        int runner = 1;
        int intervalRunner = 0;
        int minuteRunner = measurements.get(0).getDate().getMinutes();
        double speedCounter = 0;
        int travelTimeCounter = 0;
        Date lastTimeStamp = measurements.get(0).getDate();
        Date intervalDate = measurements.get(0).getDate();
        for(MeasurementResult m : measurements){

            intervalRunner++;
            if(isOutlier(m))
                continue;

            if(minutesAfter(timeInterval, m.getDate(), intervalDate)){
                TrafficEvent e = new TrafficEvent();
                e.setTravelTime(travelTimeCounter/runner);
                e.setSpeed(Math.round((speedCounter/runner)*100.0)/100.0);
                e.setTimeStamp(lastTimeStamp);
                events.add(e);

                // reset
                intervalDate = m.getDate();
                speedCounter = 0;
                travelTimeCounter = 0;
                runner = 1;
            }
            lastTimeStamp = m.getDate();
            speedCounter += m.getSpeedInKmH();
            travelTimeCounter += m.getTravelTime();
            runner++;
        }
        System.out.println(measurements.size());
    }

    private int getIntervalRunner(Date d){
        return d.getMinutes()*60 + d.getSeconds();
    }

    private boolean minutesAfter(int minutes, Date d1, Date d2){
        return ((d1.getTime() - d2.getTime())/1000.0/60.0) > minutes;
    }

    public void printCSV(){
        sortList();
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        for(MeasurementResult result : measurements){
            if(isOutlier(result))
                continue;
            String speed = ("" + result.getSpeedInKmH()).replace('.', ',');
            System.out.println(ft.format(result.getDate()) + ";" + speed + ";" + result.getTravelTime());
        }
    }

    public void printEventsAsCSV(){
        generateEventList();
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        for(TrafficEvent e : this.events){
            String speed = (e.getSpeed() + "").replace('.', ',');
            System.out.println(ft.format(e.getTimeStamp()) + ";" + speed + ";" + e.getTravelTime());
        }
    }

    private void sortList(){
        Collections.sort(measurements, new Comparator<MeasurementResult>(){
            public int compare(MeasurementResult result1, MeasurementResult result2){
                if (result1.getDate() == null || result2.getDate() == null)
                    return 0;
                return result1.getDate().compareTo(result2.getDate());
            }
        });
    }

    public List<TrafficEvent> getEvents() {
        return events;
    }
}

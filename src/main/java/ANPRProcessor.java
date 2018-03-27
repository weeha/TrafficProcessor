import handlers.ANPRHandler;
import model.*;
import model.anpr.Measurement;
import model.anpr.MeasurementResult;
import mongoDB.EventDriver;
import mongoDB.ProviderDriver;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.lang.Math.toIntExact;

public class ANPRProcessor extends AbstractProcessor{

    private final String startFile;
    private final String endFile;
    private Integer length = null;
    public static int TIME_INTERVALL = 2;
    private Integer maxTime = null;
    private Location loc;
    private TrafficRoute tRoute;

    public ANPRProcessor(String startFile, String endFile, String address, int port){
        super(null, address, port);
        this.startFile = startFile;
        this.endFile = endFile;
    }

    public void setMetaInformation(int length, Location loc){
        this.length = length;
        this.loc = loc;
        tRoute = new TrafficRoute();
        tRoute.setLocation(loc);
        Provider p = new Provider("ANPR");
        ProviderDriver pDriver = new ProviderDriver("127.0.0.1", 27017);
        pDriver.connectToDatabase();
        p.setId(pDriver.findProviderID(p));
        pDriver.disconnect();
        tRoute.setProvider(p);
        Route r = new Route();
        r.setLocation(loc);
        tRoute.setRoute(r);

    }

    public void setMaxTime(Integer maxTime) {
        this.maxTime = maxTime;
        this.loc = loc;
    }

    public void process() {
        List<Measurement> startValues = processCSV(startFile);
        List<Measurement> endValues = processCSV(endFile);
        List<MeasurementResult> mResults = new ArrayList<MeasurementResult>();

        for(Measurement start : startValues){
            for(Measurement end : endValues){
                if(start.equals(end) && start.before(end)){
                    MeasurementResult result = new MeasurementResult();
                    result.setLength(length);
                    result.setTravelTime(toIntExact((end.getDate().getTime() - start.getDate().getTime())/1000));
                    result.setDate(end.getDate());
                    mResults.add(result);
                    break;
                }
            }
        }
        // insert into db
        ANPRHandler handler = new ANPRHandler(mResults, this.TIME_INTERVALL);
        handler.setMaxTimeIncluded(maxTime);
        handler.generateEventList();
        System.out.println(handler.getEvents().size());

        EventDriver driver = new EventDriver(address, port);
        driver.connectToDatabase();
        for(TrafficEvent e : handler.getEvents()){
            e.setLocation(loc);
            e.setTrafficRoute(tRoute);
            driver.insert(e);
        }
        driver.disconnect();
    }



    private List<Measurement> processCSV(String path){
        List<Measurement> measurements = new ArrayList<Measurement>();
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("File " + file + " does not exist!");
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while((line = br.readLine()) != null){
                if(!line.contains(";"))
                    continue;
                String [] val = line.split(";");
                Measurement m = new Measurement(val[1], val[2], val[3]);
                measurements.add(m);
            }
        }catch (FileNotFoundException fe) {
            fe.printStackTrace();
        }catch(IOException ie){
            ie.printStackTrace();
        }
        return measurements;
    }

    public static void main(String [] args){

        InrixProcessor.insertProviders();

        String  endFile = "C:\\Users\\flori\\Dropbox\\Uni\\Master\\Masterarbeit\\02_Dokumente\\Messungsdaten\\Messung_3_Ende.csv";
        String startFile = "C:\\Users\\flori\\Dropbox\\Uni\\Master\\Masterarbeit\\02_Dokumente\\Messungsdaten\\Messung_3_Start.csv";
        ANPRProcessor processor = new ANPRProcessor(startFile, endFile, "127.0.0.1", 27017);
        processor.setMaxTime(227);
        Location location = new Location();
        Coordinate start = new Coordinate(11.55822, 48.149822);
        Coordinate end = new Coordinate(11.558593, 48.147292);

        location.addCoordinates(start);
        location.addCoordinates(end);

        processor.setMetaInformation(300, location);
        System.out.println(location);
        processor.process();

    }
}

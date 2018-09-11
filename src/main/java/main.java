import model.Provider;
import mongoDB.ProviderDriver;
import java.io.File;

public class main {

    public static void main(String [] args){

        if(args.length > 0){
            // get the processor type
            String command = args[0];

            // INRIX
            if(command.equals("-i")){
                runINRIXProcessor(args);
            }
            // HERE
            else if(command.equals("-h")){
                runHEREProcessor(args);
            }
            // TomTom
            else if(command.equals("-t")){
                runTomTomProcessor(args);
            }
            // Configure
            else if(command.equals("configure")){
                insertProviders();
                // TODO: Check for params
            }
            // Help
            else if(command.equals("--help")){
                printHelp();
            }
            else{
                printUnknownCommandMessage(command);
            }
        }
    }

    private static void runINRIXProcessor(String [] params){

        if(params.length >= 5){
            String path = getPath(params, "-p");
            String xd = getPath(params, "-x");
            if(fileExists(path) && fileExists(xd)){
                InrixProcessor processor = new InrixProcessor(params[1], "127.0.0.1", 27017);
                processor.setReferenceSchemaPath(params[2]);
                processor.getReferenceSchema();
                processor.process();
            }
            else{
                System.out.println("Wrong paths for INRIX processor");
            }
        }
        else{
            System.out.println("Unknown parameters for INRIX Processor");
            System.out.println("Use --help for more information");
        }
    }

    private static void runTomTomProcessor(String [] params){

        if(params.length >= 3){
            String path = getPath(params, "-p");
            if(fileExists(path)){
                TomTomProcessor processor = new TomTomProcessor(path, "localhost", 27017);
                processor.process();
            }
            else{
                System.out.println("Wrong path for TomTom processor");
            }
        }
        else{
            System.out.println("Unknown parameters for TomTom Processor");
            System.out.println("Use --help for more information");
        }
    }

    private static void runHEREProcessor(String [] params){

        if(params.length >= 3){
            String path = getPath(params, "-p");
            if(fileExists(path)){
                HereProcessor processor = new HereProcessor(params[1], "127.0.0.1", 27017);
                processor.process();
            }
            else {
                System.out.println("Wrong path for HERE processor");
            }
        }
        else{
            System.out.println("Unknown parameters for HERE Processor");
            System.out.println("Use --help for more information");
        }
    }

    private static boolean fileExists(String path){
        if(path != null){
            File f = new File(path);
            return f.exists();
        }
        return false;
    }

    private static String getPath(String [] params, String identifier){

        boolean hasPath = false;
        String result = null;
        for(String s : params){
            if(s.equals(identifier)){
                hasPath = true;
                continue;
            }
            if(hasPath){
                result = s;
                break;
            }
        }
        return result;
    }

    private static void insertProviders(){
        ProviderDriver pDriver = new ProviderDriver("127.0.0.1", 27017);
        pDriver.connectToDatabase();
        String [] providers = {"HERE", "INRIX", "TomTom", "ANPR", "GPS"};
        for(String provider : providers)
            pDriver.insert(new Provider(provider));
        pDriver.disconnect();
    }

    private static void insertProvider(String provider){
        ProviderDriver pDriver = new ProviderDriver("127.0.0.1", 27017);
        pDriver.connectToDatabase();
        pDriver.insert(new Provider(provider));
        pDriver.disconnect();
    }

    public static void printHelp(){
        // TODO
        System.out.println("Help...");
    }

    public static void printUnknownCommandMessage(String command){
        System.out.println("Unknown command " + command);
        System.out.println("Use --help for more information");
    }
}

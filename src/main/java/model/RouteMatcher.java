package model;

import model.location.TracePoint;
import org.apache.http.*;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.json.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.apache.http.HttpHeaders.ACCEPT;
import static org.apache.http.HttpHeaders.CONTENT_TYPE;

public class RouteMatcher {

    private HttpPost request = null;
    private HttpResponse response;
    private org.apache.http.client.HttpClient client;
    protected RequestConfig config = null;
    private TrafficRoute tRoute;
    private List<TracePoint> points = new ArrayList<TracePoint>();
    private Pattern coordinatePattern = Pattern.compile("([0-9]+.[0-9]+) ([0-9]+.[0-9]+)");

    public RouteMatcher(TrafficRoute route){
        tRoute = route;
        config = RequestConfig.custom()
                .setCircularRedirectsAllowed(false)
                .setConnectionRequestTimeout(4000)
                .setConnectTimeout(4000)
                .setMaxRedirects(0)
                .setRedirectsEnabled(false)
                .setSocketTimeout(10000)
                .build();

        client = HttpClientBuilder.create().build();
    }

    private String generateGPXString(){
        String gpx =
                "<?xml version=\"1.0\"?>" +
                "<gpx version=\"1.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"http://www.topografix.com/GPX/1/0\" xsi:schemaLocation=\"http://www.topografix.com/GPX/1/0 http://www.topografix.com/GPX/1/0/GPX.xsd\">" +
                "<trk>" +
                "<trkseg>";
                //"<trkpt "
        for(List<Double> coords : tRoute.getLocation().getCoordinates()){
            gpx += "<trkpt " +
                    "lat=\"" + coords.get(1) + "\" " +
                    "lon=\"" + coords.get(0) + "\"" +
                    "/>";
        }
        gpx +=
                "</trkseg>" +
                "</trk>" +
                "</gpx>";
        return gpx;
    }

    private String getApiLink(){
        String link = "http://rme.cit.api.here.com/2/matchroute.json?routemode=car&app_id=UarjvWLh0j2kKcfM2DY9&app_code=ZqdFtOoZjmRArOLVSoTCNg";
        return link;
    }

    protected void generateRequest(){

        Header [] headers = new Header[2];
        request = new HttpPost(getApiLink());
        BasicHeader encodingHeader = new BasicHeader(HttpHeaders.ACCEPT_ENCODING, "gzip");
        BasicHeader contentTypeHeader = new BasicHeader("Content-Type", "*");
        request.setHeaders(headers);
        request.setConfig(config);

    }

    public List<Route> match(String resultString){
        List<Route> matchedRoutes = new ArrayList<Route>();
        JSONObject obj = new JSONObject(resultString);
        JSONArray routeLinks;
        try {
            routeLinks = obj.getJSONArray("RouteLinks");
        }catch (Exception e){
            return new ArrayList<Route>();
        }
        Route route = null;
        for(Object routeLink : routeLinks){
            if(routeLink instanceof JSONObject){
                route = new Route();
                System.out.println(((JSONObject)routeLink).getInt("linkId"));
                route.setId(((JSONObject)routeLink).getInt("linkId"));

                route.setLength(((JSONObject) routeLink).getDouble("linkLength"));
                Matcher m = coordinatePattern.matcher(((JSONObject) routeLink).getString("shape"));
                Location location = new Location();
                System.out.println(route);
                if(false){
                    while(m.find()){
                        Coordinate c = new Coordinate(Double.parseDouble(m.group(2)), Double.parseDouble(m.group(1)));
                        location.addReverseCoordinates(c);
                    }
                }else {
                    while (m.find()) {
                        Coordinate c = new Coordinate(Double.parseDouble(m.group(2)), Double.parseDouble(m.group(1)));
                        location.addCoordinates(c);
                    }
                }
                route.setLocation(location);
                matchedRoutes.add(route);
            }
        }
        System.out.println("####################################");
        System.out.println("ORIGINAL ROUTE");
        if(this.tRoute != null)
            System.out.println(this.tRoute.getLocation());
        System.out.println("MATCHED ROUTE");
        for(Route r : matchedRoutes)
            System.out.println(r.getLocation());
        System.out.println("####################################");
        return matchedRoutes;
    }

    public List<TracePoint> getPoints() {
        return points;
    }

    public List<Route> matchGpx(String resultString){
        List<Route> matchedRoutes = new ArrayList<Route>();
        JSONObject obj = new JSONObject(resultString);
        JSONArray routeLinks;
        try {
            routeLinks = obj.getJSONArray("RouteLinks");
        }catch (Exception e){
            return new ArrayList<Route>();
        }
        Route route = null;
        for(Object routeLink : routeLinks){
            if(routeLink instanceof JSONObject){
                route = new Route();

                route.setId(((JSONObject)routeLink).getInt("linkId"));
                route.setLength(((JSONObject) routeLink).getDouble("linkLength"));
                Matcher m = coordinatePattern.matcher(((JSONObject) routeLink).getString("shape"));
                Location location = new Location();
                if(false){
                    while(m.find()){
                        Coordinate c = new Coordinate(Double.parseDouble(m.group(2)), Double.parseDouble(m.group(1)));
                        location.addReverseCoordinates(c);
                    }
                }else {
                    while (m.find()) {
                        Coordinate c = new Coordinate(Double.parseDouble(m.group(2)), Double.parseDouble(m.group(1)));
                        location.addCoordinates(c);
                    }
                }
                route.setLocation(location);
                matchedRoutes.add(route);
            }
        }

        JSONArray tracePoints = obj.getJSONArray("TracePoints");
        for(Object tracePoint : tracePoints){
            int id = ((JSONObject)tracePoint).getInt("linkIdMatched");
            double lat = ((JSONObject)tracePoint).getDouble("lat");
            double lon = ((JSONObject)tracePoint).getDouble("lon");
            TracePoint point = new TracePoint(id, lat, lon);
            points.add(point);
        }

        if(this.tRoute != null)
            System.out.println(this.tRoute.getLocation());
        for(Route r : matchedRoutes)
            System.out.println(r.getLocation());
        System.out.println("####################################");
        return matchedRoutes;
    }

    public String callRouteMatchApi(){
        try {
            //generateRequest();
            Header [] headers = new Header[2];
            HttpPost post = new HttpPost(getApiLink());

            BasicHeader contentTypeHeader = new BasicHeader(CONTENT_TYPE, "*");
            BasicHeader acceptHeader = new BasicHeader(ACCEPT, "*");
            headers[0] = contentTypeHeader;
            headers[1] = acceptHeader ;
            post.setHeaders(headers);
            post.setEntity(new StringEntity(generateGPXString()));
            HttpResponse response = client.execute(post);
            System.out.println("\nSending 'POST' request to URL : " + getApiLink());
            System.out.println("Post parameters : " + post.getEntity());
            System.out.println("Response Code : " +
                    response.getStatusLine().getStatusCode());

            String responseString = EntityUtils.toString(response.getEntity(), "ISO-8859-1");

            return responseString;
        }catch(IOException ie){
            ie.printStackTrace();
        }
        return "";
    }

    public String callRouteMatchFromString(String gpx){
        try {
            //generateRequest();
            Header [] headers = new Header[2];
            HttpPost post = new HttpPost(getApiLink());

            BasicHeader contentTypeHeader = new BasicHeader(CONTENT_TYPE, "*");
            BasicHeader acceptHeader = new BasicHeader(ACCEPT, "*");
            headers[0] = contentTypeHeader;
            headers[1] = acceptHeader ;
            post.setHeaders(headers);
            post.setEntity(new StringEntity(gpx));
            HttpResponse response = client.execute(post);
            System.out.println("\nSending 'POST' request to URL : " + getApiLink());
            System.out.println("Post parameters : " + post.getEntity());
            System.out.println("Response Code : " +
                    response.getStatusLine().getStatusCode());

            String responseString = EntityUtils.toString(response.getEntity(), "ISO-8859-1");

            return responseString;
        }catch(IOException ie){
            ie.printStackTrace();
        }
        return "";
    }

    public static void main(String [] args){

        String json = "{\"RouteLinks\":[{\"linkId\":727336759,\"functionalClass\":2,\"confidence\":0.96,\"linkLength\":30.07,\"mSecToReachLinkFromStart\":0,\"shape\":\"45.46272 10.96728 45.46288 10.96697\"},{\"linkId\":842275653,\"functionalClass\":2,\"confidence\":0.96,\"linkLength\":15.99,\"mSecToReachLinkFromStart\":1500,\"shape\":\"45.46288 10.96697 45.46296 10.9668\"},{\"linkId\":842275654,\"functionalClass\":2,\"confidence\":0.97,\"linkLength\":14.72,\"mSecToReachLinkFromStart\":3244,\"shape\":\"45.46296 10.9668 45.46304 10.96665\"},{\"linkId\":728136234,\"functionalClass\":2,\"confidence\":0.97,\"linkLength\":50.56,\"mSecToReachLinkFromStart\":4850,\"shape\":\"45.46304 10.96665 45.46313 10.96645 45.46329 10.96611\"},{\"linkId\":943884376,\"functionalClass\":2,\"confidence\":0.97,\"linkLength\":40.94,\"mSecToReachLinkFromStart\":9400,\"shape\":\"45.46329 10.96611 45.4635 10.96568\"},{\"linkId\":943884377,\"functionalClass\":2,\"confidence\":0.98,\"linkLength\":15.35,\"mSecToReachLinkFromStart\":13085,\"shape\":\"45.4635 10.96568 45.46358 10.96552\"},{\"linkId\":842275642,\"functionalClass\":2,\"confidence\":0.98,\"linkLength\":30.07,\"mSecToReachLinkFromStart\":14467,\"shape\":\"45.46358 10.96552 45.46373 10.9652\"},{\"linkId\":842275643,\"functionalClass\":2,\"confidence\":0.98,\"linkLength\":17.91,\"mSecToReachLinkFromStart\":17173,\"shape\":\"45.46373 10.9652 45.46382 10.96501\"},{\"linkId\":842275644,\"functionalClass\":2,\"confidence\":0.99,\"linkLength\":25.59,\"mSecToReachLinkFromStart\":18785,\"shape\":\"45.46382 10.96501 45.46395 10.96474\"},{\"linkId\":842275645,\"functionalClass\":2,\"confidence\":0.99,\"linkLength\":9.59,\"mSecToReachLinkFromStart\":21088,\"shape\":\"45.46395 10.96474 45.464 10.96464\"},{\"linkId\":1035190136,\"functionalClass\":2,\"confidence\":0.99,\"linkLength\":23.06,\"mSecToReachLinkFromStart\":21951,\"shape\":\"45.464 10.96464 45.46411 10.96439\"},{\"linkId\":1035190137,\"functionalClass\":2,\"confidence\":0.99,\"linkLength\":40.97,\"mSecToReachLinkFromStart\":24026,\"shape\":\"45.46411 10.96439 45.46422 10.96415 45.46431 10.96395\"},{\"linkId\":1169674056,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":17.91,\"mSecToReachLinkFromStart\":27713,\"shape\":\"45.46431 10.96395 45.4644 10.96376\"},{\"linkId\":1169674057,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":24.32,\"mSecToReachLinkFromStart\":29325,\"shape\":\"45.4644 10.96376 45.46452 10.9635\"},{\"linkId\":1169674058,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":39.050000000000004,\"mSecToReachLinkFromStart\":31514,\"shape\":\"45.46452 10.9635 45.46471 10.96308\"},{\"linkId\":1169674059,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":37.74,\"mSecToReachLinkFromStart\":35029,\"shape\":\"45.46471 10.96308 45.4649 10.96268\"},{\"linkId\":1035190134,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":30.72,\"mSecToReachLinkFromStart\":38426,\"shape\":\"45.4649 10.96268 45.46505 10.96235\"},{\"linkId\":1156482214,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":17.91,\"mSecToReachLinkFromStart\":41191,\"shape\":\"45.46505 10.96235 45.46514 10.96216\"},{\"linkId\":1156482215,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":21.75,\"mSecToReachLinkFromStart\":42803,\"shape\":\"45.46514 10.96216 45.46525 10.96193\"},{\"linkId\":1035190131,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":39.71,\"mSecToReachLinkFromStart\":44761,\"shape\":\"45.46525 10.96193 45.46538 10.96163 45.46544 10.9615\"},{\"linkId\":842275650,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":14.73,\"mSecToReachLinkFromStart\":48335,\"shape\":\"45.46544 10.9615 45.46551 10.96134\"},{\"linkId\":842275651,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":15.99,\"mSecToReachLinkFromStart\":49661,\"shape\":\"45.46551 10.96134 45.46559 10.96117\"},{\"linkId\":1169674060,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":108.75,\"mSecToReachLinkFromStart\":51100,\"shape\":\"45.46559 10.96117 45.46564 10.96106 45.46586 10.9606 45.46614 10.96002\"},{\"linkId\":1169674061,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":31.35,\"mSecToReachLinkFromStart\":60888,\"shape\":\"45.46614 10.96002 45.4662 10.95989 45.4663 10.95969\"},{\"linkId\":842281003,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":15.35,\"mSecToReachLinkFromStart\":63710,\"shape\":\"45.4663 10.95969 45.46638 10.95953\"},{\"linkId\":842281004,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":24.94,\"mSecToReachLinkFromStart\":65092,\"shape\":\"45.46638 10.95953 45.46651 10.95927\"},{\"linkId\":1169674062,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":76.11,\"mSecToReachLinkFromStart\":67337,\"shape\":\"45.46651 10.95927 45.46669 10.9589 45.4669 10.95847\"},{\"linkId\":1169674063,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":49.25,\"mSecToReachLinkFromStart\":74187,\"shape\":\"45.4669 10.95847 45.46715 10.95795\"},{\"linkId\":842281006,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":34.56,\"mSecToReachLinkFromStart\":81730,\"shape\":\"45.46715 10.95795 45.46732 10.95758\"},{\"linkId\":1035190127,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":7.68,\"mSecToReachLinkFromStart\":82421,\"shape\":\"45.46732 10.95758 45.46736 10.9575\"},{\"linkId\":1035190128,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":40.29,\"mSecToReachLinkFromStart\":86047,\"shape\":\"45.46736 10.9575 45.46757 10.95708\"},{\"linkId\":1169674064,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":32.62,\"mSecToReachLinkFromStart\":88983,\"shape\":\"45.46757 10.95708 45.46774 10.95674\"},{\"linkId\":1169674065,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":17.91,\"mSecToReachLinkFromStart\":90595,\"shape\":\"45.46774 10.95674 45.46783 10.95655\"},{\"linkId\":842349185,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":31.34,\"mSecToReachLinkFromStart\":93416,\"shape\":\"45.46783 10.95655 45.46799 10.95622\"},{\"linkId\":842349186,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":8.32,\"mSecToReachLinkFromStart\":94165,\"shape\":\"45.46799 10.95622 45.46803 10.95613\"},{\"linkId\":842281010,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":26.240000000000002,\"mSecToReachLinkFromStart\":94165,\"shape\":\"45.46803 10.95613 45.46813 10.95592 45.46816 10.95585\"},{\"linkId\":1169678051,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":9.59,\"mSecToReachLinkFromStart\":98074,\"shape\":\"45.46816 10.95585 45.46821 10.95575\"},{\"linkId\":1169678052,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":6.41,\"mSecToReachLinkFromStart\":98773,\"shape\":\"45.46821 10.95575 45.46824 10.95568\"},{\"linkId\":1169678049,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":17.91,\"mSecToReachLinkFromStart\":100727,\"shape\":\"45.46824 10.95568 45.46833 10.95549\"},{\"linkId\":1169678050,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":9.59,\"mSecToReachLinkFromStart\":101773,\"shape\":\"45.46833 10.95549 45.46838 10.95539\"},{\"linkId\":842281013,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":11.51,\"mSecToReachLinkFromStart\":103029,\"shape\":\"45.46838 10.95539 45.46844 10.95527\"},{\"linkId\":943884374,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":12.82,\"mSecToReachLinkFromStart\":104428,\"shape\":\"45.46844 10.95527 45.4685 10.95513\"},{\"linkId\":943884375,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":47.99,\"mSecToReachLinkFromStart\":109663,\"shape\":\"45.4685 10.95513 45.4686 10.95491 45.46868 10.95475 45.46874 10.95462\"},{\"linkId\":728136236,\"functionalClass\":2,\"confidence\":1.0,\"linkLength\":15.35,\"mSecToReachLinkFromStart\":111104,\"shape\":\"45.46874 10.95462 45.46882 10.95446\"}],\"TracePoints\":[{\"confidenceValue\":0.76,\"elevation\":0.0,\"headingDegreeNorthClockwise\":10000.0,\"headingMatched\":-54.0,\"lat\":45.462767,\"latMatched\":45.46281,\"linkIdMatched\":727336759,\"lon\":10.96707,\"lonMatched\":10.96711,\"matchDistance\":6.54,\"matchOffsetOnLink\":0.5426393872184667,\"minError\":1.0,\"routeLinkSeqNrMatched\":0,\"speedMps\":0.0,\"timestamp\":0},{\"confidenceValue\":0.99,\"elevation\":0.0,\"headingDegreeNorthClockwise\":10000.0,\"headingMatched\":-55.0,\"lat\":45.468777,\"latMatched\":45.46881,\"linkIdMatched\":728136236,\"lon\":10.95445,\"lonMatched\":10.95448,\"matchDistance\":5.05,\"matchOffsetOnLink\":0.8603228331956944,\"minError\":4.0,\"routeLinkSeqNrMatched\":43,\"speedMps\":0.0,\"timestamp\":0}],\"Warnings\":[],\"MapVersion\":\"LATEST\"}";
        //45.46256,10.96757 45.46229,10.9681
        TrafficRoute route1 = new TrafficRoute();
        Location l1 = new Location();
        Coordinate c1 = new Coordinate(10.96757, 45.46256);
        Coordinate c2 = new Coordinate(10.9681, 45.46229);
        l1.addReverseCoordinates(c2);
        l1.addReverseCoordinates(c1);
        route1.setLocation(l1);

        TrafficRoute route2 = new TrafficRoute();
        Location l2 = new Location();
        l2.addReverseCoordinates(c1);
        l2.addReverseCoordinates(c2);
        route2.setLocation(l2);

        RouteMatcher rm = new RouteMatcher(route1);
        for(Route route : rm.match(rm.callRouteMatchApi())){
            System.out.println(route);
        }

        RouteMatcher rm_2 = new RouteMatcher(route2);
        for(Route route : rm_2.match(rm_2.callRouteMatchApi())){
            System.out.println(route);
        }

    }


}

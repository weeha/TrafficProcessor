package model.location;

import openlr.binary.data.AbstractLRP;

/**
 * Created by Florian Noack on 04.05.2017.
 */
public class LocationReferencePointImpl implements ILocationReferencePoint{

    private final AbstractLRP lrp;
    private final CoordinateValue coord;
    //private final FRCValue frc;
    //private final FOWValue fow;
    //private final BearValue bear;
    //private final LFRCNPValue lfrcnp;
    //private final DNPValue dnp;


    public LocationReferencePointImpl(AbstractLRP lrp){
        this.lrp = lrp;
        coord = new CoordinateValue(lrp.getLat(), lrp.getLon());
    }

    public LocationReferencePointImpl(AbstractLRP lrp, ILocationReferencePoint prevLRP){
        this.lrp = lrp;
        double lat = prevLRP.getLatitude() + (double)lrp.getLat() / 100000.0;
        double lon = prevLRP.getLongitude() + (double)lrp.getLon() / 100000.0;
        coord = new CoordinateValue(lat, lon, lrp.getLat(), lrp.getLon());
        //this.frc = new FRCValue(lrp.getAttrib1().getFrc());
        //this.fow = new FOWValue(lrp.getAttrib1().getFow());
        //this.bear = new BearValue(lrp.getAttrib2().getBear());
        //this.lfrcnp = new LFRCNPValue(lrp.getAttrib2().getLfrcnp());
        //this.dnp = new DNPValue(lrp.getAttrib3().getDnp());
    }


    public AbstractLRP getLRP(){
        return this.lrp;
    }

    public double getLongitude() {
        return coord.getLonDeg();
    }

    public double getLatitude() {
        return coord.getLatDeg();
    }

    public String toString(){
        return coord.toString();
    }

    public int getRawLat(){
        return coord.getLat();
    }

    public int getRawLon(){
        return coord.getLon();
    }
}

package model.location;

import openlr.binary.data.AbstractLRP;

/**
 * Created by flori on 04.05.2017.
 */
public interface ILocationReferencePoint {

    double getLongitude();
    double getLatitude();
    int getRawLat();
    int getRawLon();
    AbstractLRP getLRP();

}

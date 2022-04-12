package services;


import java.util.ArrayList;

import models.locations.Location;


public class LocationService {
    static private ArrayList<Location> locations = new ArrayList<Location>();
    static private Integer id = 0;

    public LocationService() {

    }

    public Location getLocationById(Integer id) {
        for (Location location : locations) {
            if (location.getId().equals(id))
                return location;
        }
        return null;
    }
}

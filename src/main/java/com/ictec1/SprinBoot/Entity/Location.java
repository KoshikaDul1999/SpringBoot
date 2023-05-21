package com.ictec1.SprinBoot.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Location {
    @Id
    @GeneratedValue
    private Long id;
    private String lat;
    private String lon;

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }
}

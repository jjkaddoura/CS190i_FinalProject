package com.example.radhika.a190i_finalproject;

/**
 * Created by Radhika on 6/6/17.
 */

public class Place {
    public String name, place_id;
    public Double Lat, lng;

    public Place( String Name, String placeID, Double lat, Double Lng){
        name = Name;
        Lat = lat;
        lng = Lng;
        place_id = placeID;
    }
}
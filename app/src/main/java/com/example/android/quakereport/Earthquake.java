package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.example.android.quakereport.R.id.date;

/**
 * Created by bruno on 23/06/2017.
 */

public class Earthquake {

    //Var
    private double mMagnitude;

    private String mPlace;

    private long mTimeInMilli;
    /** Website URL of the earthquake */
    private String mUrl;


    //Constructor
    public Earthquake(double magnitude, String place, long timeInMilli,String url){
        mMagnitude = magnitude;
        mPlace = place;
        mTimeInMilli = timeInMilli;
        mUrl = url;
    }

    // Method
    //get

    public double getMagnitude(){ return mMagnitude;}

    public String getPlace(){ return mPlace;}

    public long getTimeInMilli() { return mTimeInMilli;}

    public String getUrl() {
        return mUrl;
    }

}

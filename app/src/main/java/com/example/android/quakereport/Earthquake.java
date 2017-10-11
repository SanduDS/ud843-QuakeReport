package com.example.android.quakereport;

/**
 * Created by Dhanushka Sandaruwan on 10/12/2017.
 */

public class Earthquake {
    private String mMagnitude;
    private String mLocation;
    private String mDate;
    //gobal v to mag loc date

    /**
     * Constructs a new earthquick object.
     * @param mMagnitude is mag
     * @param mLocation is location
     * @param mDate is the date that earthquick happend.
     */
    public Earthquake(String mMagnitude, String mLocation, String mDate) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mDate = mDate;
    }

    /**
     *
     * @return s the maganitude of the earthquick.
     */
    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmDate() {
        return mDate;
    }
}

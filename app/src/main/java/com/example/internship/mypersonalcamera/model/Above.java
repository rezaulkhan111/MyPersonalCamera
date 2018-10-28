package com.example.internship.mypersonalcamera.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Above {
    @SerializedName("satid")
    public int satid;

    @SerializedName("satname")
    public String satname;

    @SerializedName("intDesignator")
    public String intDesignator;

    @SerializedName("launchDate")
    public String launchDate;

    @SerializedName("satlat")
    public double satlat;

    @SerializedName("satlng")
    public double satlng;

    @SerializedName("satalt")
    public double satalt;

    public Above(int satid, String satname, String intDesignator, String launchDate, double satlat, double satlng, double satalt) {
        this.satid = satid;
        this.satname = satname;
        this.intDesignator = intDesignator;
        this.launchDate = launchDate;
        this.satlat = satlat;
        this.satlng = satlng;
        this.satalt = satalt;
    }

    public int getSatid() {
        return satid;
    }

    public void setSatid(int satid) {
        this.satid = satid;
    }

    public String getSatname() {
        return satname;
    }

    public void setSatname(String satname) {
        this.satname = satname;
    }

    public String getIntDesignator() {
        return intDesignator;
    }

    public void setIntDesignator(String intDesignator) {
        this.intDesignator = intDesignator;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    public double getSatlat() {
        return satlat;
    }

    public void setSatlat(double satlat) {
        this.satlat = satlat;
    }

    public double getSatlng() {
        return satlng;
    }

    public void setSatlng(double satlng) {
        this.satlng = satlng;
    }

    public double getSatalt() {
        return satalt;
    }

    public void setSatalt(double satalt) {
        this.satalt = satalt;
    }
}

package com.example.internship.mypersonalcamera.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Info {
    @SerializedName("category")
    public String category;

    @SerializedName("transactionscount")
    public int transactionscount;

    @SerializedName("satcount")
    public int satcount;

    public Info(String category, int transactionscount, int satcount) {
        this.category = category;
        this.transactionscount = transactionscount;
        this.satcount = satcount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getTransactionscount() {
        return transactionscount;
    }

    public void setTransactionscount(int transactionscount) {
        this.transactionscount = transactionscount;
    }

    public int getSatcount() {
        return satcount;
    }

    public void setSatcount(int satcount) {
        this.satcount = satcount;
    }
}

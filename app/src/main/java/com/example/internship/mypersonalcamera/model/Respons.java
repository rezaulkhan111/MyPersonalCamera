package com.example.internship.mypersonalcamera.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Respons {
    @SerializedName("Status")
    private boolean Status;

    @SerializedName("Message")
    private String Message;

    @SerializedName("Data")
    private List<RootObject> data;

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public List<RootObject> getData() {
        return data;
    }

    public void setData(List<RootObject> data) {
        this.data = data;
    }
}

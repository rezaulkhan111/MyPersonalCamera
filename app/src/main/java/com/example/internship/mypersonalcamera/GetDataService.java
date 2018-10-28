package com.example.internship.mypersonalcamera;

import com.example.internship.mypersonalcamera.model.Respons;
import com.example.internship.mypersonalcamera.model.RootObject;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface GetDataService {

    @FormUrlEncoded
    @GET("above/{observer_lat}/{observer_lng}/{observer_alt}/{search_radius}/{category_id}")
    Call<Respons> PostFromURLData(
            @Path("observer_lat") double observer_lat,
            @Path("observer_lng") double observer_lng,
            @Path("observer_alt") double observer_alt,
            @Path("search_radius") int search_radius,
            @Path("category_id") int category_id,
            @Header("Authorization") String authorization

    );

//    Callback<List<RootObject>> getAllSatelliteList
}

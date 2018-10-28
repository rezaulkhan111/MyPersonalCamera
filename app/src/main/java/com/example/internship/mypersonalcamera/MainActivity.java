package com.example.internship.mypersonalcamera;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Camera;
import android.media.Image;
import android.os.AsyncTask;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.internship.mypersonalcamera.model.Above;
import com.example.internship.mypersonalcamera.model.Info;
import com.example.internship.mypersonalcamera.model.Respons;
import com.example.internship.mypersonalcamera.model.RetrofitClientInstance;
import com.example.internship.mypersonalcamera.model.RootObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends Activity {

    String apiKey = "53VELF-92F346-8HGD75-3IPC";
    double observer_lat = 41.702f;
    double observer_lng = -76.014f;
    double observer_alt;
    int search_radius0 = 0;
    int search_radius90 = 90;
    int category_id = 18;
    String array[];

    JSONObject jsonObject = null;
    String ad;
    ObjectAnimator downIt;
    android.hardware.Camera camera;
    FrameLayout frameLayout;
    ShowCamera showCamera;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout = findViewById(R.id.frame_layout_camera);
        imageView = findViewById(R.id.iv_photo);

        camera = android.hardware.Camera.open();
        showCamera = new ShowCamera(this, camera);
        frameLayout.addView(showCamera);





    }

    public void said(View view) {
        downIt = ObjectAnimator.ofFloat(imageView, "translationY", 39.5978f, -61.5837f);
        downIt.setDuration(2500);
        downIt.setRepeatCount(ValueAnimator.INFINITE);
        downIt.setRepeatMode(ValueAnimator.RESTART);
        downIt.start();
        aaaaaaa();
    }


//    private void StartA() {
//        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animation);
//        textView.startAnimation(animation);
//    }


    public void aaaaaaa() {
        GetDataService respons_service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);

        Call<Respons> call = respons_service.PostFromURLData(observer_lat, observer_lng, observer_alt, search_radius90, category_id, apiKey);
        // GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        // Call<JSONObject> call = service.PostFromURLData(observer_lat, observer_lng, observer_alt, search_radius90, category_id,apiKey);

        call.enqueue(new Callback<Respons>() {
            @Override
            public void onResponse(Call<Respons> call, Response<Respons> response) {
                if (response.isSuccessful()) {

                    array = new String[response.body().getData().size()];
                    String[] s = new String[response.body().getData().size()];
                    for(int i=0;i<response.body().getData().size();i++){
                        Above above;
                        String SatName=(response.body().getData().get(i).getAbove().get(i).getSatname());
                        double name=(response.body().getData().get(i).getAbove().get(i).getSatalt());

                    }

                }
            }

            @Override
            public void onFailure(Call<Respons> call, Throwable t) {

            }
        });

    }
}

package com.example.michlg.youtubebaseapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.michlg.youtubebaseapplication.Model.YoutubeResult;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit r = RetrofitClient.getRetrofitClient("https://www.googleapis.com");

        YoutubeClient service = r.create(YoutubeClient.class);

        Call<YoutubeResult> yres = service
                .listItems("AIzaSyCLflXUAXwY1xWUfgYWK0txiaWAh1om8Y8",
                        "esilv",
                        "snippet",
                        25);

        yres.enqueue(new Callback<YoutubeResult>() {
            @Override
            public void onResponse(Call<YoutubeResult> call, Response<YoutubeResult> response) {
                if (response.isSuccessful()) {
                    Log.i("RESPONSE", response.body().toString());
                } else {
                    Log.i("RESPONSE CODE", String.valueOf(response.code()));
                }
            }

            @Override
            public void onFailure(Call<YoutubeResult> call, Throwable t) {
                Log.i("RESPONSE", "ERROR");
                Log.e("ERROR", "onFailure: ", t);
            }
        });
    }
}

package com.example.michlg.youtubebaseapplication;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by M2469215 on 16/03/2018.
 */

public class RetrofitClient {
    private static Retrofit retrofit = null;

    public static Retrofit getRetrofitClient(String baseUrl) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

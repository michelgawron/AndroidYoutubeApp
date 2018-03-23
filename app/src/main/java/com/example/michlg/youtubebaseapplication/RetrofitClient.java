package com.example.michlg.youtubebaseapplication;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * This class stores our retrofit client - we only need one to run our program efficiently
 * Created by M2469215 on 16/03/2018.
 */

public class RetrofitClient {
    private static Retrofit retrofit = null;

    /**
     * Create an instance of retrofit client
     *
     * @param baseUrl
     * @return
     */
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

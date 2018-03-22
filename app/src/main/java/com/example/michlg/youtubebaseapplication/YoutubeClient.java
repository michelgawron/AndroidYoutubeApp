package com.example.michlg.youtubebaseapplication;

import com.example.michlg.youtubebaseapplication.Model.YoutubeResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Interface used to create our api endpoints
 * Created by michlg on 23/02/2018.
 */
public interface YoutubeClient {
    @GET("/youtube/v3/search")
    Call<YoutubeResult> listItems(@Query("key") String apikey,
                                  @Query("q") String query,
                                  @Query("part") String part,
                                  @Query("maxResults") int maxResults);
}
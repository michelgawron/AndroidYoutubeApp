package com.example.michlg.youtubebaseapplication.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * This class stores the id of our video
 * Created by michlg on 22/03/2018.
 */
public class YoutubeId {
    //region Model
    @SerializedName("videoId")
    @Expose
    private String videoId;
    //endregion

    //region Override toString() method
    @Override
    public String toString() {
        return "YoutubeId{" +
                "videoId='" + videoId + '\'' +
                '}';
    }
    //endregion

    //region Getters/Setters
    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }
    //endregion
}

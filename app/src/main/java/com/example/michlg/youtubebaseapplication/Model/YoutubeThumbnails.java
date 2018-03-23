package com.example.michlg.youtubebaseapplication.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * This object stores the thumbnails associated with a youtube video - their images
 * Created by michlg on 16/03/2018.
 */
public class YoutubeThumbnails {
    //region Model
    /**
     * Default quality image
     */
    @SerializedName("default")
    @Expose
    YoutubeSingleImage ytDefault;

    /**
     * Medium quality image
     */
    @SerializedName("medium")
    @Expose
    YoutubeSingleImage ytMedium;

    /**
     * High quality image
     */
    @SerializedName("high")
    @Expose
    YoutubeSingleImage ytHigh;
    //endregion

    //region toString override
    @Override
    public String toString() {
        return "YoutubeThumbnails{" +
                "ytDefault=" + ytDefault +
                ", ytMedium=" + ytMedium +
                ", ytHigh=" + ytHigh +
                '}';
    }
    //endregion

    //region Getters/Setters
    public YoutubeSingleImage getYtDefault() {
        return ytDefault;
    }

    public void setYtDefault(YoutubeSingleImage ytDefault) {
        this.ytDefault = ytDefault;
    }

    public YoutubeSingleImage getYtMedium() {
        return ytMedium;
    }

    public void setYtMedium(YoutubeSingleImage ytMedium) {
        this.ytMedium = ytMedium;
    }

    public YoutubeSingleImage getYtHigh() {
        return ytHigh;
    }

    public void setYtHigh(YoutubeSingleImage ytHigh) {
        this.ytHigh = ytHigh;
    }
    //endregion
}

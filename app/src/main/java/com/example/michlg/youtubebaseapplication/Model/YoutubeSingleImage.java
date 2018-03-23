package com.example.michlg.youtubebaseapplication.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * This object stores images attributes
 * Created by michlg on 16/03/2018.
 */
public class YoutubeSingleImage {
    //region Model
    /**
     * Image's url
     */
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * Image's width
     */
    @SerializedName("width")
    @Expose
    private int width;

    /**
     * Image's height
     */
    @SerializedName("height")
    @Expose
    private int height;
    //endregion

    //region toString override
    @Override
    public String toString() {
        return "YoutubeSingleImage{" +
                "url='" + url + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
    //endregion

    //region Getters/Setters
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    //endregion
}

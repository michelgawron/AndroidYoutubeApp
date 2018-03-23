package com.example.michlg.youtubebaseapplication.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * This object stores the snippet of our youtube video
 * Created by michlg on 16/03/2018.
 */
public class YoutubeSingleVideo {
    //region Model
    /**
     * Single youtube video snippet - basically a single item from the list of results
     * Calls the YoutubeVideoSnippet class
     */
    @SerializedName("snippet")
    @Expose
    private YoutubeVideoSnippet snippet;

    @SerializedName("id")
    @Expose
    private YoutubeId id;
    //endregion

    //region toString override
    @Override
    public String toString() {
        return "YoutubeSingleVideo{" +
                "snippet=" + snippet +
                '}';
    }
    //endregion

    //region Getters/Setters
    public YoutubeVideoSnippet getSnippet() {
        return snippet;
    }

    public void setSnippet(YoutubeVideoSnippet snippet) {
        this.snippet = snippet;
    }

    public YoutubeId getId() {
        return id;
    }

    public void setId(YoutubeId id) {
        this.id = id;
    }

    //endregion
}

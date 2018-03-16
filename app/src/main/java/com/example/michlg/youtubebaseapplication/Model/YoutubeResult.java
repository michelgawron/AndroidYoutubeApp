package com.example.michlg.youtubebaseapplication.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * This class stores the list of results returned by our query
 * Created by michlg on 16/03/2018.
 */

public class YoutubeResult {
    //region Model
    /**
     * List of items returned by the query
     */
    @SerializedName("items")
    @Expose
    private List<YoutubeSingleSnippet> items;
    //endregion

    //region toString override
    @Override
    public String toString() {
        return "YoutubeResult{" +
                "items=" + items +
                '}';
    }
    //endregion

    //region Getters/Setters
    public List<YoutubeSingleSnippet> getItems() {
        return items;
    }

    public void setItems(List<YoutubeSingleSnippet> items) {
        this.items = items;
    }
    //endregion
}

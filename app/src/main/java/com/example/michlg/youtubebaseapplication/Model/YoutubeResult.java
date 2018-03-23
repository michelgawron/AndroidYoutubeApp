package com.example.michlg.youtubebaseapplication.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * This object stores the list of results returned by our query
 * Created by michlg on 16/03/2018.
 */
public class YoutubeResult {
    //region Model
    /**
     * List of items returned by the query
     */
    @SerializedName("nextPa0geToken")
    @Expose
    private String nextPage;

    @SerializedName("items")
    @Expose
    private List<YoutubeSingleVideo> items;
    //endregion

    //region Override toString method
    @Override
    public String toString() {
        return "YoutubeResult{" +
                "nextPage='" + nextPage + '\'' +
                ", items=" + items +
                '}';
    }
    //endregion

    //region Getters/Setters
    public List<YoutubeSingleVideo> getItems() {
        return items;
    }

    public void setItems(List<YoutubeSingleVideo> items) {
        this.items = items;
    }

    public String getNextPage() {
        return nextPage;
    }

    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }
    //endregion
}

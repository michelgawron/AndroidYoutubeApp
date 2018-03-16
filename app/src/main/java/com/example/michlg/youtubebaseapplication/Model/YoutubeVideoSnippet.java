package com.example.michlg.youtubebaseapplication.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * This object stores a single result from our list
 * Created by michlg on 16/03/2018.
 */

public class YoutubeVideoSnippet {
    //region Model
    /**
     * Publication date
     */
    @SerializedName("publishedAt")
    @Expose
    private String publishedAt;

    /**
     * Video title
     */
    @SerializedName("title")
    @Expose
    private String title;

    /**
     * Video description
     */
    @SerializedName("description")
    @Expose
    private String description;

    /**
     * Video thumbnails - using YoutubeThumbnails class
     */
    @SerializedName("thumbnails")
    @Expose
    private YoutubeThumbnails thumbnails;
    //endregion

    //region toString override
    @Override
    public String toString() {
        return "YoutubeVideoSnippet{" +
                "publishedAt='" + publishedAt + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", thumbnails=" + thumbnails +
                '}';
    }
    //endregion

    //region Getters/Setters
    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public YoutubeThumbnails getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(YoutubeThumbnails thumbnails) {
        this.thumbnails = thumbnails;
    }
    //endregion
}

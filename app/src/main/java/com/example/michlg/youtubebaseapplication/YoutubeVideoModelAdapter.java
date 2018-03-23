package com.example.michlg.youtubebaseapplication;

import com.example.michlg.youtubebaseapplication.Model.YoutubeSingleVideo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class is going to store data for one element of our recyclerView
 * It is intended to give a clearer description and access to the data loaded in the Model
 * Created by michlg on 22/03/2018.
 */
public class YoutubeVideoModelAdapter {
    //region Model
    private String title;

    private String imageUrl;

    private Date publicationDate;

    private String videoId;

    private String description;

    private String channelId;
    //endregion

    //region Constructor
    public YoutubeVideoModelAdapter(YoutubeSingleVideo video) {
        this.title = video.getSnippet().getTitle();
        this.imageUrl = video.getSnippet().getThumbnails().getYtHigh().getUrl();
        this.videoId = video.getId().getVideoId();
        this.description = video.getSnippet().getDescription();
        this.channelId = video.getSnippet().getYoutubeChannelId();
        // Parse the date to readable format or date format
        try {
            this.publicationDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                    .parse(video.getSnippet().getPublishedAt()
                            .replaceAll("Z$", "-0000"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    //endregion

    //region Getters and setters
    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public String getVideoId() {
        return videoId;
    }

    public String getDescription() {
        return description;
    }

    public String getChannelId() {
        return channelId;
    }
    //endregion
}
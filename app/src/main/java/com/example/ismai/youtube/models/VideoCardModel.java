package com.example.ismai.youtube.models;

/**
 * Created by ismai on 3/7/2025.
 */

public class VideoCardModel {
    private String title;
    private String views;
    private String date;
    private String channelName;
    private int thumbnailResId;

    public VideoCardModel(String title, String views, String date, String channelName, int thumbnailResId) {
        this.title = title;
        this.views = views;
        this.date = date;
        this.channelName = channelName;
        this.thumbnailResId = thumbnailResId;
    }

    public String getTitle() { return title; }
    public String getViews() { return views; }
    public String getDate() { return date; }
    public String getChannelName() { return channelName; }
    public int getThumbnailResId() { return thumbnailResId; }
}

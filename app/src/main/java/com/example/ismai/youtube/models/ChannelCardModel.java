package com.example.ismai.youtube.models;

/**
 * Created by ismai on 3/7/2025.
 */

public class ChannelCardModel {
    private String name;
    private String subscribers;
    private int profilePicResId;

    public ChannelCardModel(String name, String subscribers, int profilePicResId) {
        this.name = name;
        this.subscribers = subscribers;
        this.profilePicResId = profilePicResId;
    }

    public String getName() { return name; }
    public String getSubscribers() { return subscribers; }
    public int getProfilePicResId() { return profilePicResId; }
}

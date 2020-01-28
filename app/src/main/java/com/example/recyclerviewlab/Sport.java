package com.example.recyclerviewlab;

import com.google.gson.annotations.SerializedName;

public class Sport {

    @SerializedName("imageURL")
    private String mimageURL;
    @SerializedName("Info")
    private String mInfo;
    @SerializedName("subTitle")
    private String msubTitle;
    @SerializedName("title")
    private String mTitle;
    public Sport(String mimageURL, String mInfo, String msubTitle, String mTitle) {
        this.mimageURL = mimageURL;
        this.mInfo = mInfo;
        this.msubTitle = msubTitle;
        this.mTitle = mTitle;
    }

    public String getMimageURL() {
        return mimageURL;
    }

    public void setMimageURL(String mimageURL) {
        this.mimageURL = mimageURL;
    }

    public String getmInfo() {
        return mInfo;
    }

    public void setmInfo(String mInfo) {
        this.mInfo = mInfo;
    }

    public String getMsubTitle() {
        return msubTitle;
    }

    public void setMsubTitle(String msubTitle) {
        this.msubTitle = msubTitle;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}

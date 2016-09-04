package com.banner.model;

/**
 * Created by Wonder on 16/9/5.
 */
public class BannerModel {

    private String imageUrl;
    private String mTips;

    public String getTips() {
        return mTips;
    }

    public void setTips(String tips) {
        mTips = tips;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

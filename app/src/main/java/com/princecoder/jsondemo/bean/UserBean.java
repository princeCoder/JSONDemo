package com.princecoder.jsondemo.bean;

/**
 * Created by prinzlyngotoum on 11/13/14.
 */
public class UserBean {
    String mName;
    String mTitle;

    public UserBean(String name, String title){
        this.mName=name;
        this.mTitle=title;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTite) {
        this.mTitle = mTite;
    }
}

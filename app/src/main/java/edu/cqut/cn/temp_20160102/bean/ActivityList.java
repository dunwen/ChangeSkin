package edu.cqut.cn.temp_20160102.bean;

import java.io.Serializable;

/**
 * Created by dun on 2015/11/2.
 */
public class ActivityList implements Serializable{
    private String title = "";
    private int guid = -1;
    private String startTime = "";
    private String headImage = "";
    private int seeTimes = 0;
    private int attenders = 0;
    private String address = "";
    private String briefIntroduce = "";
    public ActivityList() {
    }

    public ActivityList(String title, int guid, String startTime, String headImage, int seeTimes, int attenders, String address, String briefIntroduce) {
        this.title = title;
        this.guid = guid;
        this.startTime = startTime;
        this.headImage = headImage;
        this.seeTimes = seeTimes;
        this.attenders = attenders;
        this.address = address;
        this.briefIntroduce = briefIntroduce;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getGuid() {
        return guid;
    }

    public void setGuid(int guid) {
        this.guid = guid;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public int getSeeTimes() {
        return seeTimes;
    }

    public void setSeeTimes(int seeTimes) {
        this.seeTimes = seeTimes;
    }

    public int getAttenders() {
        return attenders;
    }

    public void setAttenders(int attenders) {
        this.attenders = attenders;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBriefIntroduce() {
        return briefIntroduce;
    }

    public void setBriefIntroduce(String briefIntroduce) {
        this.briefIntroduce = briefIntroduce;
    }
}

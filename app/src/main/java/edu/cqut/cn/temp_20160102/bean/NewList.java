package edu.cqut.cn.temp_20160102.bean;

/**
 * Created by dun on 2015/11/6.
 */
public class NewList {
    private int Id = -1;
    private String title = "";
    private String briefContent = "";
    private String headImage = "";

    public NewList(int id, String title, String briefContent, String headImage) {
        Id = id;
        this.title = title;
        this.briefContent = briefContent;
        this.headImage = headImage;
    }

    public NewList() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBriefContent() {
        return briefContent;
    }

    public void setBriefContent(String briefContent) {
        this.briefContent = briefContent;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }
}

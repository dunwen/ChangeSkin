package edu.cqut.cn.temp_20160102.bean;

import java.io.Serializable;

/**
 * Created by dun on 2015/11/4.
 */
public class CorporationList implements Serializable{
    private int Id = -1;
    private String headImage = "";
    private String name = "";
    private int sort = -1;
    private String type = "";

    public CorporationList() {
    }

    public CorporationList(int id, String headImage, String name, int sort, String type) {
        Id = id;
        this.headImage = headImage;
        this.name = name;
        this.sort = sort;
        this.type = type;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

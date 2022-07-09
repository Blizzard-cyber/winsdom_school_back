package com.campus.wisdom.entity;


/**
 * @Author:Gary
 * @ProjectName:winsdom_school_back
 * @Date: 2022/7/3 13:43
 **/
public class Notice {

    private String id;

    private String headline;

    private String content;

    private String img;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Notice() {
    }

    public Notice(String id, String headline, String content, String img) {
        this.id = id;
        this.headline = headline;
        this.content = content;
        this.img = img;
    }
}
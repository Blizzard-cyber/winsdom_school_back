package com.campus.wisdom.entity;

import com.mysql.cj.jdbc.Blob;

/**
 * @Author:Gary
 * @ProjectName:winsdom_school_back
 * @Date: 2022/7/3 13:43
 **/
public class Notice {

    private String nid;

    private String headline;

    private String content;

    private byte[] img;



    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
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

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public Notice() {
    }

    public Notice(String nid, String headline, String content, byte[] img) {
        this.nid = nid;
        this.headline = headline;
        this.content = content;
        this.img = img;
    }
}

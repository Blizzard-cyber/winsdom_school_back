package com.campus.wisdom.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;

/**
 * @ClassName Textbook
 * @Description
 * @Author Abel
 * @Date 2022/7/1 14:56
 * @Version 1.0
 **/
public class Textbook {
    private String id;
    private String name;
    private String author;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date time;
    private String press;
    private String version;

    public Textbook() {
    }

    public Textbook(String id, String name, String author, Date time, String press, String version) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.time = time;
        this.press = press;
        this.version = version;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Textbook{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", time=" + time +
                ", press='" + press + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}

package com.campus.wisdom.entity;

/**
 * @ClassName Teacher
 * @Description
 * @Author Abel
 * @Date 2022/7/1 14:58
 * @Version 1.0
 **/
public class Teacher {
    private String tid;
    private String name;
    private String title;

    public Teacher() {
    }

    public Teacher(String tid, String name, String title) {
        this.tid = tid;
        this.name = name;
        this.title = title;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid='" + tid + '\'' +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

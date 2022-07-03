package com.campus.wisdom.entity;

/**
 * @ClassName course
 * @Description
 * @Author Abel
 * @Date 2022/7/1 8:34
 * @Version 1.0
 **/
public class Student {
    private String sid;
    private String name;
    private String password;
    private String college;
    private String major;
    private String phone;

    public Student() {
    }

    public Student(String sid, String name, String password, String college, String major, String phone) {
        this.sid = sid;
        this.name = name;
        this.password = password;
        this.college = college;
        this.major = major;
        this.phone = phone;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", college='" + college + '\'' +
                ", major='" + major + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
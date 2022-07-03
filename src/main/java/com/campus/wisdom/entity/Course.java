package com.campus.wisdom.entity;

/**
 * @ClassName Course
 * @Description
 * @Author Abel
 * @Date 2022/7/1 8:44
 * @Version 1.0
 **/
public class Course {
    private String cid;
    private String name;
    private String type;
    private String credit;
    private String classroom;
    private String remark;

    public Course() {
    }

    public Course(String cid, String name, String type, String credit, String classroom, String remark) {
        this.cid = cid;
        this.name = name;
        this.type = type;
        this.credit = credit;
        this.classroom = classroom;
        this.remark = remark;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cid='" + cid + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", credit='" + credit + '\'' +
                ", classroom='" + classroom + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}

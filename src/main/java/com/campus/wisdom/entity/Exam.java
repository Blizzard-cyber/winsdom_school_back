package com.campus.wisdom.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @ClassName Exam
 * @Description
 * @Author Abel
 * @Date 2022/7/1 8:47
 * @Version 1.0
 **/
public class Exam{
    private String cid;
    private String name;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date time;
    private String location;
    private String seatNum;
    private String remark;

    public Exam() {
    }

    public Exam(String cid, String name, Date time, String location, String seatNum, String remark) {
        this.cid = cid;
        this.name = name;
        this.time = time;
        this.location = location;
        this.seatNum = seatNum;
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(String seatNum) {
        this.seatNum = seatNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "cid='" + cid + '\'' +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", location='" + location + '\'' +
                ", seatNum='" + seatNum + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}

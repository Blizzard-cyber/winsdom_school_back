package com.campus.wisdom.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @Author:Gary
 * @ProjectName:winsdom_school_back
 * @Date: 2022/7/3 20:19
 **/
public class LabAppoint {
    String labId;

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    Date openTime;

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    Date closeTime;

    public String getLabId() {
        return labId;
    }

    public void setLabId(String labId) {
        this.labId = labId;
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public LabAppoint() {
    }

    public LabAppoint(String labId, Date openTime, Date closeTime) {
        this.labId = labId;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }
}

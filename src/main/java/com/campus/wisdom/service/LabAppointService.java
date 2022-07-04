package com.campus.wisdom.service;

import com.campus.wisdom.entity.LabAppoint;

import java.util.List;

/**
 * @Author:Gary
 * @ProjectName:winsdom_school_back
 * @Date: 2022/7/3 20:27
 **/
public interface LabAppointService {
    LabAppoint getLabAppointByLabId(String labId);

    List<LabAppoint> getAllLabAppoint();
}

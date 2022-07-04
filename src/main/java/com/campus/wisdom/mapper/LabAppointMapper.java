package com.campus.wisdom.mapper;

import com.campus.wisdom.controller.LabAppointController;
import com.campus.wisdom.entity.LabAppoint;
import com.campus.wisdom.entity.News;

import java.util.List;

/**
 * @Author:Gary
 * @ProjectName:winsdom_school_back
 * @Date: 2022/7/3 20:25
 **/
public interface LabAppointMapper {
    LabAppoint getLabAppointByLabId(String labId);

    List<LabAppoint> getAllLabAppoint();
}

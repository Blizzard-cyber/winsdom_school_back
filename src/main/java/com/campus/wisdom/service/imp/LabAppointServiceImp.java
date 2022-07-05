package com.campus.wisdom.service.imp;

import com.campus.wisdom.entity.LabAppoint;
import com.campus.wisdom.mapper.LabAppointMapper;
import com.campus.wisdom.service.LabAppointService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:Gary
 * @ProjectName:winsdom_school_back
 * @Date: 2022/7/3 20:28
 **/
@Service
public class LabAppointServiceImp implements LabAppointService {
    @Resource
    LabAppointMapper labAppointMapper;

    @Override
    public LabAppoint getLabAppointById(String id) {
        return labAppointMapper.getLabAppointById(id);
    }

    @Override
    public List<LabAppoint> getAllLabAppoint() {
        return labAppointMapper.getAllLabAppoint();
    }
}

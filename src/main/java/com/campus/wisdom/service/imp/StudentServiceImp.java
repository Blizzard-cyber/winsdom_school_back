package com.campus.wisdom.service.imp;

import com.campus.wisdom.entity.Student;
import com.campus.wisdom.mapper.StudentMapper;
import com.campus.wisdom.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author:Gary
 * @ProjectName:winsdom_school_back
 * @Date: 2022/7/3 12:41
 **/
@Service
public class StudentServiceImp implements StudentService {
    @Resource
    StudentMapper mapper;


    @Override
    public Student getStudentBySid(String sid) {
        return mapper.getStudentBySid(sid);
    }

    @Override
    public void modifyPhone(String sid, String phone) {
        mapper.modifyPhone(sid, phone);
    }

}
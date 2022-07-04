package com.campus.wisdom.service.imp;

import com.campus.wisdom.entity.Student;
import com.campus.wisdom.mapper.StudentMapper;
import com.campus.wisdom.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName StudentServiceImp
 * @Description
 * @Author Abel
 * @Date 2022/7/3 17:42
 * @Version 1.0
 **/
@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student login(String sid,String password) {
        return studentMapper.getStudentBySidAndPassword(sid,password);
    }
}

package com.campus.wisdom.service;

import com.campus.wisdom.entity.Student;

/**
 * @ClassName StudentService
 * @Description
 * @Author Abel
 * @Date 2022/7/3 17:41
 * @Version 1.0
 **/
public interface StudentService {
    Student login(String sid,String password);

    Student getStudentBySid(String sid);

    void modifyPhone(String sid, String phone);
}

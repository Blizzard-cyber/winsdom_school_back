package com.campus.wisdom.service;

import com.campus.wisdom.entity.Student;

/**
 * @Author:Gary
 * @ProjectName:winsdom_school_back
 * @Date: 2022/7/3 12:39
 **/

public interface StudentService {
    Student getStudentBySid(String sid);

    void modifyPhone(String sid, String phone);
}

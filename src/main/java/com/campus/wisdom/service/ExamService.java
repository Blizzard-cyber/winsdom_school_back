package com.campus.wisdom.service;

import com.campus.wisdom.entity.Exam;

import java.util.List;

/**
 * @ClassName ExamService
 * @Description
 * @Author Abel
 * @Date 2022/7/3 16:23
 * @Version 1.0
 **/
public interface ExamService {
    List<Exam> getExamListBySid(String sid,String semester);
}

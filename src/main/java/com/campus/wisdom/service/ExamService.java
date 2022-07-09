package com.campus.wisdom.service;

import com.campus.wisdom.entity.Exam;

import java.util.List;

/**
 * @ClassName ExamService
 * @Description 我的考试服务层
 * @Author Abel
 * @Date 2022/7/3 16:23
 * @Version 1.0
 **/
public interface ExamService {
    /**
      * @Author Abel
      * @Description 获取指定学生指定学期的考试信息
      * @Date 21:06 2022/7/3
      **/
    List<Exam> getExamListBySid(String sid);
}

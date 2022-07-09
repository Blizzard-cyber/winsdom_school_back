package com.campus.wisdom.service;

import com.campus.wisdom.entity.CourseTable;

import java.util.List;

/**
 * @ClassName CourseTableService
 * @Description 课程表服务层
 * @Author Abel
 * @Date 2022/7/2 16:14
 * @Version 1.0
 **/
public interface CourseTableService {
    /**
      * @Author Abel
      * @Description 获取指定学生指定学期的课表信息
      * @Date 21:04 2022/7/3
      **/
    List<CourseTable> getCourseTableListBySid(String sid,String semester);

    /**
      * @Author Abel
      * @Description 获取指定学生当前学期
      * @Date 21:05 2022/7/3
      **/
    String getSemester(String sid);
}
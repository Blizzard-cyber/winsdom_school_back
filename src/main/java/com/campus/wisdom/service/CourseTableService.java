package com.campus.wisdom.service;

import com.campus.wisdom.entity.CourseTable;

import java.util.List;

/**
 * @ClassName CourseTableService
 * @Description
 * @Author Abel
 * @Date 2022/7/2 16:14
 * @Version 1.0
 **/
public interface CourseTableService {
    List<CourseTable> getCourseTableListBySid(String sid,String semester);
}

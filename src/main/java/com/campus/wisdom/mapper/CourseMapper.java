package com.campus.wisdom.mapper;

import com.campus.wisdom.entity.Course;
import org.apache.ibatis.annotations.Param;


/**
 * @ClassName CourseMapper
 * @Description 课程
 * @Author Abel
 * @Date 2022/7/2 18:50
 * @Version 1.0
 **/
public interface CourseMapper {
    /**
      * @Author Abel
      * @Description 根据课程id查找课程信息
      * @Date 21:08 2022/7/3
      **/
    Course getCourseByCid(@Param("cid") String cid);
}
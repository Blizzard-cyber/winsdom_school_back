package com.campus.wisdom.mapper;

import com.campus.wisdom.entity.CourseTime;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName CourseTimeMapper
 * @Description 课程时间
 * @Author Abel
 * @Date 2022/7/2 18:50
 * @Version 1.0
 **/
public interface CourseTimeMapper {
    /**
      * @Author Abel
      * @Description 根据id查找课程时间
      * @Date 21:11 2022/7/3
      **/
    CourseTime getCourseTimeById(@Param("id") String id);
}
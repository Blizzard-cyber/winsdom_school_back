package com.campus.wisdom.mapper;

import com.campus.wisdom.entity.CourseTime;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName CourseTimeMapper
 * @Description
 * @Author Abel
 * @Date 2022/7/2 18:50
 * @Version 1.0
 **/
public interface CourseTimeMapper {
    CourseTime getCourseTimeById(@Param("id") String id);
}

package com.campus.wisdom.mapper;

import com.campus.wisdom.entity.Course;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName CourseMapper
 * @Description
 * @Author Abel
 * @Date 2022/7/2 18:50
 * @Version 1.0
 **/
public interface CourseMapper {
    Course getCourseByCid(@Param("cid") String cid);
}

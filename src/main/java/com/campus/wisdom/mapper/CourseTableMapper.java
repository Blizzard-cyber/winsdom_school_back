package com.campus.wisdom.mapper;

import com.campus.wisdom.entity.CourseTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName CourseTableMapper
 * @Description
 * @Author Abel
 * @Date 2022/7/2 16:32
 * @Version 1.0
 **/
public interface CourseTableMapper {
    List<CourseTable> getCourseTableListBySid(@Param("id") String sid,@Param("semester") String semester);
}

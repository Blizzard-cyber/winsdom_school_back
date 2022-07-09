package com.campus.wisdom.mapper;

import com.campus.wisdom.entity.CourseTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName CourseTableMapper
 * @Description 课表
 * @Author Abel
 * @Date 2022/7/2 16:32
 * @Version 1.0
 **/
public interface CourseTableMapper {
    /**
      * @Author Abel
      * @Description 根据学生id和学期查找课表信息
      * @Date 21:09 2022/7/3
      **/
    List<CourseTable> getCourseTableListBySid(@Param("sid") String sid,@Param("semester") String semester);

    /**
      * @Author Abel
      * @Description 根据学生id和学期查找课程id集合
      * @Date 21:10 2022/7/3
      **/
    List<String> getCidListBySid(@Param("sid") String sid);

    /**
      * @Author Abel
      * @Description 查找学生学期集合
      * @Date 21:11 2022/7/3
      **/
    List<String> getSemesterList(@Param("sid") String sid);
}
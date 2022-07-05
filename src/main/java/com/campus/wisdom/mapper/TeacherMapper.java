package com.campus.wisdom.mapper;

import com.campus.wisdom.entity.Teacher;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName TeacherMapper
 * @Description 教师
 * @Author Abel
 * @Date 2022/7/2 18:51
 * @Version 1.0
 **/
public interface TeacherMapper {
    /**
      * @Author Abel
      * @Description 根据教师id查找教师信息
      * @Date 21:14 2022/7/3
      **/
    Teacher getTeacherByTid(@Param("tid") String tid);
}
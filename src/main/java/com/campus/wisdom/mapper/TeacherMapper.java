package com.campus.wisdom.mapper;

import com.campus.wisdom.entity.Teacher;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName TeacherMapper
 * @Description
 * @Author Abel
 * @Date 2022/7/2 18:51
 * @Version 1.0
 **/
public interface TeacherMapper {
    Teacher getTeacherByTid(@Param("tid") String tid);
}

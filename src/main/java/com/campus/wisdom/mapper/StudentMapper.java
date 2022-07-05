package com.campus.wisdom.mapper;

import com.campus.wisdom.entity.Student;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName StudentMapper
 * @Description 学生
 * @Author Abel
 * @Date 2022/7/2 18:50
 * @Version 1.0
 **/
public interface StudentMapper {
    /**
      * @Author Abel
      * @Description 根据学生id查找学生信息
      * @Date 18:13 2022/7/3
      **/
    Student getStudentBySid(@Param("sid") String sid);
    /**
      * @Author Abel
      * @Description 根据学生id和密码查找学生信息
      * @Date 18:13 2022/7/3
      **/
    Student getStudentBySidAndPassword(@Param("sid") String sid,@Param("password") String password);

    void modifyPhone(@Param("sid") String sid, @Param("phone") String phone);
}
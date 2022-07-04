package com.campus.wisdom.mapper;

import com.campus.wisdom.entity.Student;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName StudentMapper
 * @Description
 * @Author Abel
 * @Date 2022/7/2 18:50
 * @Version 1.0
 **/
public interface StudentMapper {
    Student getStudentBySid(@Param("sid") String sid);

    void modifyPhone(@Param("sid") String sid, @Param("phone") String phone);
}

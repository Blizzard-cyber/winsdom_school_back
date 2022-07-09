package com.campus.wisdom.mapper;

import com.campus.wisdom.entity.MyGrade;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName MyGradeMapper
 * @Description
 * @Author Abel
 * @Date 2022/7/6 10:28
 * @Version 1.0
 **/
public interface MyGradeMapper {
    List<MyGrade> getMyGradeListBySid(@Param("sid") String sid);
}

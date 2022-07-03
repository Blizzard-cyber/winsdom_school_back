package com.campus.wisdom.mapper;

import com.campus.wisdom.entity.Exam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName ExamMapper
 * @Description
 * @Author Abel
 * @Date 2022/7/3 14:30
 * @Version 1.0
 **/
public interface ExamMapper {
    List<Exam> getExamListByCid(@Param("cidList") List<String> cidList);
}
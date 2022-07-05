package com.campus.wisdom.mapper;

import com.campus.wisdom.entity.Exam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName ExamMapper
 * @Description 考试
 * @Author Abel
 * @Date 2022/7/3 14:30
 * @Version 1.0
 **/
public interface ExamMapper {
    /**
      * @Author Abel
      * @Description 根据当前学期课表情况查看对应考试情况
      * @Date 21:12 2022/7/3
      **/
    List<Exam> getExamListByCid(@Param("cidList") List<String> cidList);
}
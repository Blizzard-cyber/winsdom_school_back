package com.campus.wisdom.mapper;

import com.campus.wisdom.entity.Study;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName StudyMapper
 * @Description
 * @Author Abel
 * @Date 2022/7/3 19:45
 * @Version 1.0
 **/
public interface StudyMapper {
    List<Study> getStudyListBySid(@Param("sid") String sid);
}

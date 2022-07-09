package com.campus.wisdom.service;

import com.campus.wisdom.entity.MyGrade;

import java.util.List;

/**
 * @ClassName MyGradeService
 * @Description
 * @Author Abel
 * @Date 2022/7/6 10:42
 * @Version 1.0
 **/
public interface MyGradeService {
    List<MyGrade> getMyGradeListBySid(String sid);
}

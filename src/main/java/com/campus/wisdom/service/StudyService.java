package com.campus.wisdom.service;

import com.campus.wisdom.entity.Study;

import java.util.List;

/**
 * @ClassName StudyService
 * @Description
 * @Author Abel
 * @Date 2022/7/3 20:03
 * @Version 1.0
 **/
public interface StudyService {
    List<Study> getStudyListBySid(String sid);
}

package com.campus.wisdom.controller;

import com.campus.wisdom.entity.Study;
import com.campus.wisdom.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName StudyController
 * @Description
 * @Author Abel
 * @Date 2022/7/3 20:11
 * @Version 1.0
 **/
@RestController
@RequestMapping("/study")
public class StudyController {
    @Autowired
    private StudyService studyService;

    @RequestMapping(value = "/{sid}",method = RequestMethod.GET)
    public List<Study> getStudyListBySid(@PathVariable("sid") String sid){
        return studyService.getStudyListBySid(sid);
    }
}
package com.campus.wisdom.controller;

import com.campus.wisdom.entity.Exam;
import com.campus.wisdom.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName ExamController
 * @Description
 * @Author Abel
 * @Date 2022/7/3 16:32
 * @Version 1.0
 **/
@RestController
@RequestMapping("/exam")
public class ExamController {
    @Autowired
    private ExamService examService;

    @RequestMapping(value = "/{sid}/{semester}",method = RequestMethod.GET)
    public List<Exam> getExamListBySid(@PathVariable("sid") String sid, @PathVariable String semester){
        return examService.getExamListBySid(sid,semester);
    }
}
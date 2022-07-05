package com.campus.wisdom.controller;

import com.campus.wisdom.entity.Exam;
import com.campus.wisdom.service.CourseTableService;
import com.campus.wisdom.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName ExamController
 * @Description 我的考试控制层
 * @Author Abel
 * @Date 2022/7/3 16:32
 * @Version 1.0
 **/
@RestController
@CrossOrigin
@RequestMapping("/exam")
public class ExamController {
    @Autowired
    private ExamService examService;
    @Autowired
    private CourseTableService courseTableService;

    /**
      * @Author Abel
      * @Description 考试信息学期切换
      * @Date 21:01 2022/7/3
      **/
    @RequestMapping(value = "/{sid}/{semester}",method = RequestMethod.GET)
    public List<Exam> getExamListBySid(@PathVariable("sid") String sid, @PathVariable String semester){
        return examService.getExamListBySid(sid,semester);
    }

    /**
      * @Author Abel
      * @Description 进入考试信息模块
      * @Date 21:02 2022/7/3
      **/
    @RequestMapping(value = "/{sid}",method = RequestMethod.GET)
    public List<Exam> getExamListBySid(@PathVariable("sid") String sid){
        return examService.getExamListBySid(sid,courseTableService.getSemester());
    }
}
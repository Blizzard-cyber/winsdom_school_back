package com.campus.wisdom.controller;

import com.campus.wisdom.entity.CourseTable;
import com.campus.wisdom.entity.Textbook;
import com.campus.wisdom.service.CourseTableService;
import com.campus.wisdom.service.TextbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName TimeTable
 * @Description 课程表控制层
 * @Author Abel
 * @Date 2022/7/2 15:40
 * @Version 1.0
 **/
@RestController
@CrossOrigin
@RequestMapping("/courseTable")
public class CourseTableController {
    @Autowired
    private CourseTableService courseTableService;
    @Autowired
    private TextbookService textbookService;

    /**
      * @Author Abel
      * @Description 课程表
      * @Date 20:59 2022/7/3
      **/
    @RequestMapping(value = "/{sid}/{semester}",method = RequestMethod.GET)
    public List<CourseTable> getCourseTableBySid(@PathVariable("sid") String sid,@PathVariable("semester") String semester){
        return courseTableService.getCourseTableListBySid(sid,semester);
    }

    /**
      * @Author Abel
      * @Description 进入课程表模块
      * @Date 21:00 2022/7/3
      **/
    @RequestMapping(value = "/{sid}/",method = RequestMethod.GET)
    public List<CourseTable> getCourseTableBySid(@PathVariable("sid") String sid){
        return courseTableService.getCourseTableListBySid(sid,courseTableService.getSemester(sid));
    }

    /**
      * @Author Abel
      * @Description 查看教科书详情
      * @Date 21:01 2022/7/3
      **/
    @RequestMapping(value = "/textbook/{id}",method = RequestMethod.GET)
    public Textbook getTextbookById(@PathVariable("id") String id){
        return textbookService.getTextbookById(id);
    }
}
package com.campus.wisdom.controller;

import com.campus.wisdom.entity.CourseTable;
import com.campus.wisdom.entity.Textbook;
import com.campus.wisdom.service.CourseTableService;
import com.campus.wisdom.service.TextbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName TimeTable
 * @Description
 * @Author Abel
 * @Date 2022/7/2 15:40
 * @Version 1.0
 **/
@RestController
@RequestMapping("/courseTable")
public class CourseTableController {
    @Autowired
    private CourseTableService courseTableService;
    @Autowired
    private TextbookService textbookService;

    @RequestMapping(value = "/{sid}/{semester}",method = RequestMethod.GET)
    public List<CourseTable> getCourseTableBySid(@PathVariable("sid") String sid,@PathVariable("semester") String semester){
        return courseTableService.getCourseTableListBySid(sid,semester);
    }

    @RequestMapping(value = "/textbook/{id}",method = RequestMethod.GET)
    public Textbook getTextbookById(@PathVariable("id") String id){
        return textbookService.getTextbookById(id);
    }

}
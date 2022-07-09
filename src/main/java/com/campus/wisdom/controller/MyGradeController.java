package com.campus.wisdom.controller;

import com.campus.wisdom.entity.MyGrade;
import com.campus.wisdom.service.MyGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName MyGradeController
 * @Description
 * @Author Abel
 * @Date 2022/7/6 10:47
 * @Version 1.0
 **/
@RestController
@CrossOrigin
@RequestMapping("/myGrade")
public class MyGradeController {
    @Autowired
    private MyGradeService myGradeService;

    @RequestMapping(value = "/{sid}",method = RequestMethod.GET)
    public List<MyGrade> getMyGradeListBySid(@PathVariable("sid") String sid){
        return myGradeService.getMyGradeListBySid(sid);
    }
}
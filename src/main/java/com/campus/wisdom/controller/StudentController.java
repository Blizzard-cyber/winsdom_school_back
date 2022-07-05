package com.campus.wisdom.controller;

import com.campus.wisdom.entity.Student;
import com.campus.wisdom.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName StudentController
 * @Description 登录
 * @Author Abel
 * @Date 2022/7/3 17:40
 * @Version 1.0
 **/
@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/{sid}/{password}",method = RequestMethod.POST)
    public Student login(@PathVariable("sid") String sid,@PathVariable("password") String password){
        return studentService.login(sid,password);
    }

    @RequestMapping(value = "/{sid}", method = RequestMethod.GET)
    public Student info(@PathVariable("sid") String sid) {
        Student student = studentService.getStudentBySid(sid);
        if(student != null) student.setPassword(null);
        return student;
    }


    @RequestMapping(value = "/{sid}", method = RequestMethod.POST)
    public String modify(@PathVariable("sid") String sid, @RequestParam("phone") String phone) {
        studentService.modifyPhone(sid, phone);
        return "Modify Success";
    }
}
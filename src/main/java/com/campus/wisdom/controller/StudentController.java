package com.campus.wisdom.controller;

/**
 * @Author:Gary
 * @ProjectName:winsdom_school_back
 * @Date: 2022/7/3 12:39
 **/

import com.campus.wisdom.entity.Student;
import com.campus.wisdom.mapper.StudentMapper;
import com.campus.wisdom.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;


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

package com.campus.wisdom.service.imp;

import com.campus.wisdom.entity.Exam;
import com.campus.wisdom.mapper.CourseTableMapper;
import com.campus.wisdom.mapper.ExamMapper;
import com.campus.wisdom.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ExamServiceImp
 * @Description 我的考试服务层具体实现
 * @Author Abel
 * @Date 2022/7/3 16:24
 * @Version 1.0
 **/
@Service
public class ExamServiceImp implements ExamService {
    @Autowired
    private CourseTableMapper courseTableMapper;
    @Autowired
    private ExamMapper examMapper;

    @Override
    public List<Exam> getExamListBySid(String sid, String semester) {
        List<String> cidList = courseTableMapper.getCidListBySid(sid,semester);
        return examMapper.getExamListByCid(cidList);
    }
}
package com.campus.wisdom.service.imp;

import com.campus.wisdom.entity.CourseTable;
import com.campus.wisdom.mapper.CourseTableMapper;
import com.campus.wisdom.service.CourseTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CourseTableServiceImp
 * @Description
 * @Author Abel
 * @Date 2022/7/2 16:19
 * @Version 1.0
 **/
@Service
public class CourseTableServiceImp implements CourseTableService {
    @Autowired
    private CourseTableMapper courseTableMapper;
    @Override
    public List<CourseTable> getCourseTableListBySid(String sid,String semester) {
        return courseTableMapper.getCourseTableListBySid(sid,semester);
    }
}

package com.campus.wisdom.service.imp;

import com.campus.wisdom.entity.MyGrade;
import com.campus.wisdom.mapper.MyGradeMapper;
import com.campus.wisdom.service.MyGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @ClassName MyGradeServiceImp
 * @Description
 * @Author Abel
 * @Date 2022/7/6 10:43
 * @Version 1.0
 **/
@Service
public class MyGradeServiceImp implements MyGradeService {
    @Autowired
    private MyGradeMapper myGradeMapper;

    @Override
    public List<MyGrade> getMyGradeListBySid(String sid) {
        List<MyGrade> myGradeList = myGradeMapper.getMyGradeListBySid(sid);
        Collections.sort(myGradeList);
        return myGradeList;
    }
}

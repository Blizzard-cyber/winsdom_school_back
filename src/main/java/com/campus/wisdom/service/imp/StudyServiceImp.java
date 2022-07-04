package com.campus.wisdom.service.imp;

import com.campus.wisdom.entity.Study;
import com.campus.wisdom.mapper.StudyMapper;
import com.campus.wisdom.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName StudyServiceImp
 * @Description
 * @Author Abel
 * @Date 2022/7/3 20:04
 * @Version 1.0
 **/
@Service
public class StudyServiceImp implements StudyService {
    @Autowired
    private StudyMapper studyMapper;

    @Override
    public List<Study> getStudyListBySid(String sid) {
        List<Study> studyList = studyMapper.getStudyListBySid(sid);

        BigDecimal creditNum = new BigDecimal(0);
        for(Study study : studyList){
            creditNum = creditNum.add(new BigDecimal(study.getCourse().getCredit()));
            study.setCreditSum(creditNum + "");
        }

        return studyList;
    }
}
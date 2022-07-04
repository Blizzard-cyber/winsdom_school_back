package com.campus.wisdom.service.imp;

import com.campus.wisdom.entity.Gdesign;
import com.campus.wisdom.mapper.GdesignMapper;
import com.campus.wisdom.service.GdesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName GdesignServiceImp
 * @Description
 * @Author Abel
 * @Date 2022/7/3 19:02
 * @Version 1.0
 **/
@Service
public class GdesignServiceImp implements GdesignService {
    @Autowired
    private GdesignMapper gdesignMapper;

    @Override
    public Gdesign getGdesignBySid(String sid) {
        return gdesignMapper.getGdesignBySid(sid);
    }
}
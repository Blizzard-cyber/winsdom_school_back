package com.campus.wisdom.service.imp;


import com.campus.wisdom.entity.PayInfo;
import com.campus.wisdom.mapper.PayInfoMapper;
import com.campus.wisdom.service.PayInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:Gary
 * @ProjectName:winsdom_school_back
 * @Date: 2022/7/3 22:24
 **/
@Service
public class PayInfoServiceImpl implements PayInfoService {
    @Resource
    PayInfoMapper payInfoMapper;

    @Override
    public PayInfo getOnePayInfo(String sid, String id) {
        return payInfoMapper.getOnePayInfo(sid, id);
    }

    @Override
    public List<PayInfo> getAllPayInfoBySid(String sid) {
        return payInfoMapper.getAllPayInfoBySid(sid);
    }
}

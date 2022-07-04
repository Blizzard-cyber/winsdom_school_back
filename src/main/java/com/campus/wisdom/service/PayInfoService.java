package com.campus.wisdom.service;

import com.campus.wisdom.entity.PayInfo;

import java.util.List;

/**
 * @Author:Gary
 * @ProjectName:winsdom_school_back
 * @Date: 2022/7/3 22:24
 **/
public interface PayInfoService {

    PayInfo getOnePayInfo(String sid, String id);

    List<PayInfo> getAllPayInfoBySid(String sid);
}

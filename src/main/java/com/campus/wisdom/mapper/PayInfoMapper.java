package com.campus.wisdom.mapper;

import com.campus.wisdom.entity.Notice;
import com.campus.wisdom.entity.PayInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author:Gary
 * @ProjectName:winsdom_school_back
 * @Date: 2022/7/3 22:23
 **/
public interface PayInfoMapper {

    PayInfo getOnePayInfo(@Param("sid") String sid, @Param("id") String id);

    List<PayInfo> getAllPayInfoBySid(String sid);
}

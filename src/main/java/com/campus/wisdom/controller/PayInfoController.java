package com.campus.wisdom.controller;

import com.campus.wisdom.entity.Notice;
import com.campus.wisdom.entity.PayInfo;
import com.campus.wisdom.mapper.PayInfoMapper;
import com.campus.wisdom.service.PayInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:Gary
 * @ProjectName:winsdom_school_back
 * @Date: 2022/7/3 22:23
 **/
@RestController
@CrossOrigin
@RequestMapping("/pay")
public class PayInfoController {
    @Autowired
    PayInfoService payInfoService;

    @RequestMapping(value="/{sid}/{id}", method = RequestMethod.GET)
    public PayInfo getOnePay(@PathVariable("sid") String sid, @PathVariable("id") String id) {
        return payInfoService.getOnePayInfo(sid, id);
    }

    @RequestMapping(value="/{sid}", method = RequestMethod.GET)
    public List<PayInfo> getAllPay(@PathVariable("sid") String sid) {
        return payInfoService.getAllPayInfoBySid(sid);
    }
}
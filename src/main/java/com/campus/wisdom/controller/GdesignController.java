package com.campus.wisdom.controller;

import com.campus.wisdom.entity.Gdesign;
import com.campus.wisdom.service.GdesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName GdesignController
 * @Description
 * @Author Abel
 * @Date 2022/7/3 19:03
 * @Version 1.0
 **/
@RestController
@CrossOrigin
@RequestMapping("/gdesign")
public class GdesignController {
    @Autowired
    private GdesignService gdesignService;

    @RequestMapping(value = "/{sid}",method = RequestMethod.GET)
    public Gdesign getGdesignBySid(@PathVariable("sid") String sid){
        return gdesignService.getGdesignBySid(sid);
    }
}
package com.campus.wisdom.controller;

import com.campus.wisdom.entity.LabAppoint;
import com.campus.wisdom.entity.News;
import com.campus.wisdom.service.LabAppointService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:Gary
 * @ProjectName:winsdom_school_back
 * @Date: 2022/7/3 20:22
 **/

@RestController
@RequestMapping("/lab")
public class LabAppointController {
    @Resource
    private LabAppointService labAppointService;

    @RequestMapping(value = "/{labId}", method = RequestMethod.GET)
    public LabAppoint getOneLabAppoint(@PathVariable("labId") String labId) {
        return labAppointService.getLabAppointByLabId(labId);
    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<LabAppoint> getAllLabAppoint() {
        return labAppointService.getAllLabAppoint();
    }


}

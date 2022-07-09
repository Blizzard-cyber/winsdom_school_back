package com.campus.wisdom.controller;

import com.campus.wisdom.entity.LabAppoint;
import com.campus.wisdom.service.LabAppointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Gary
 * @ProjectName: winsdom_school_back
 * @Date: 2022/7/3 20:22
 **/

@RestController
@CrossOrigin
@RequestMapping("/lab")
public class LabAppointController {
    @Autowired
    private LabAppointService labAppointService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public LabAppoint getOneLabAppoint(@PathVariable("id") String id) {
        return labAppointService.getLabAppointById(id);
    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<LabAppoint> getAllLabAppoint() {
        return labAppointService.getAllLabAppoint();
    }
}
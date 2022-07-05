package com.campus.wisdom.controller;

import com.campus.wisdom.entity.Notice;
import com.campus.wisdom.service.NoticeService;
import com.sun.imageio.plugins.common.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:Gary
 * @ProjectName:winsdom_school_back
 * @Date: 2022/7/3 14:01
 **/

@RestController
@CrossOrigin
@RequestMapping("/notice")
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Notice getOneNotice(@PathVariable("id") String id) {
        return noticeService.getNoticeById(id);
    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<Notice> getAllNotice() {
        return noticeService.getAllNotice();
    }
}

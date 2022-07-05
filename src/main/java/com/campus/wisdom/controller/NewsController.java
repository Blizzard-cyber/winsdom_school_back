package com.campus.wisdom.controller;

import com.campus.wisdom.entity.News;
import com.campus.wisdom.entity.Notice;
import com.campus.wisdom.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:Gary
 * @ProjectName:winsdom_school_back
 * @Date: 2022/7/3 19:50
 **/
@RestController
@CrossOrigin
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public News getOneNews(@PathVariable("id") String id) {
        return newsService.getNewsById(id);
    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<News> getAllNotice() {
        return newsService.getAllNews();
    }
}

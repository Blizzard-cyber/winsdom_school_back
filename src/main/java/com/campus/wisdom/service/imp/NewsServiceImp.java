package com.campus.wisdom.service.imp;

import com.campus.wisdom.entity.News;
import com.campus.wisdom.mapper.NewsMapper;
import com.campus.wisdom.service.NewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:Gary
 * @ProjectName:winsdom_school_back
 * @Date: 2022/7/3 19:55
 **/
@Service
public class NewsServiceImp implements NewsService {

    @Resource
    NewsMapper newsMapper;

    @Override
    public News getNewsById(String id) {
        return newsMapper.getNewsById(id);
    }

    @Override
    public List<News> getAllNews() {
        return newsMapper.getAllNews();
    }
}

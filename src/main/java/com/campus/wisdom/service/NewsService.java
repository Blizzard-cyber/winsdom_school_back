package com.campus.wisdom.service;

import com.campus.wisdom.entity.News;

import java.util.List;

/**
 * @Author:Gary
 * @ProjectName:winsdom_school_back
 * @Date: 2022/7/3 19:51
 **/
public interface NewsService {
    News getNewsById(String id);

    List<News> getAllNews();
}

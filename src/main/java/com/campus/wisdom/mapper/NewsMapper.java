package com.campus.wisdom.mapper;

import com.campus.wisdom.entity.News;
import com.campus.wisdom.entity.Notice;

import java.util.List;

/**
 * @Author:Gary
 * @ProjectName:winsdom_school_back
 * @Date: 2022/7/3 19:47
 **/
public interface NewsMapper {
    News getNewsById(String id);

    List<News> getAllNews();
}

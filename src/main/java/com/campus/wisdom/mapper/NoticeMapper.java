package com.campus.wisdom.mapper;

import com.campus.wisdom.entity.Notice;

import java.util.List;

/**
 * @Author:Gary
 * @ProjectName:winsdom_school_back
 * @Date: 2022/7/3 13:59
 **/
public interface NoticeMapper {
    Notice getNoticeById(String id);

    List<Notice> getAllNotice();
}

package com.campus.wisdom.service;

import com.campus.wisdom.entity.Notice;

import java.util.List;

/**
 * @Author:Gary
 * @ProjectName:winsdom_school_back
 * @Date: 2022/7/3 13:56
 **/
public interface NoticeService {
    Notice getNoticeById(String id);

    List<Notice> getAllNotice();

//    void addNoticeByNid(Notice notice);
}

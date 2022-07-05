package com.campus.wisdom.service.imp;

import com.campus.wisdom.entity.Notice;
import com.campus.wisdom.mapper.NoticeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:Gary
 * @ProjectName:winsdom_school_back
 * @Date: 2022/7/3 13:57
 **/
@Service
public class NoticeServiceImp implements com.campus.wisdom.service.NoticeService {
    @Resource
    NoticeMapper noticeMapper;

    @Override
    public Notice getNoticeByNid(String nid) {
        return noticeMapper.getNoticeByNid(nid);
    }

    @Override
    public List<Notice> getAllNotice() {
        return noticeMapper.getAllNotice();
    }

//    @Override
//    public void addNoticeByNid(Notice notice) {
//        noticeMapper.addNoticeByNid(notice);
//    }
}

package com.campus.wisdom.controller;

import com.campus.wisdom.entity.Notice;
import com.campus.wisdom.service.NoticeService;
import com.sun.imageio.plugins.common.ImageUtil;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:Gary
 * @ProjectName:winsdom_school_back
 * @Date: 2022/7/3 14:01
 **/

@RestController
@RequestMapping("/notice")
public class NoticeController {
    /**
     * 字节数组转字符串，如 A0 09 70 -> 101000000000100101110000。
     * @param bts 转入字节数组。
     * @return 转换好的只有“1”和“0”的字符串。
     */
    static String bytes2String(byte[] bts) {
        String[] dic = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111" };
        StringBuilder out = new StringBuilder();
        for (byte b : bts) {
            String s = String.format("%x", b);
            s = s.length() == 1? "0" + s: s;
            out.append(dic[Integer.parseInt(s.substring(0, 1), 16)]);
            out.append(dic[Integer.parseInt(s.substring(1, 2), 16)]);
        }
        return out.toString();
    }


    @Resource
    private NoticeService noticeService;

    @RequestMapping(value="/{nid}", method = RequestMethod.GET)
    public Notice getOneNotice(@PathVariable("nid") String nid) {
        return noticeService.getNoticeByNid(nid);
    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<Notice> getAllNotice() {
        return noticeService.getAllNotice();
    }
}

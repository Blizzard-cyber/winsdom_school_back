package com.campus.wisdom.service.imp;

import com.campus.wisdom.entity.Textbook;
import com.campus.wisdom.mapper.TextbookMapper;
import com.campus.wisdom.service.TextbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName TextbookServiceImp
 * @Description
 * @Author Abel
 * @Date 2022/7/3 9:49
 * @Version 1.0
 **/
@Service
public class TextbookServiceImp implements TextbookService {
    @Autowired
    private TextbookMapper textbookMapper;

    @Override
    public Textbook getTextbookById(String id) {
        return textbookMapper.getTextbookById(id);
    }
}

package com.campus.wisdom.mapper;

import com.campus.wisdom.entity.Textbook;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName TextbookMapper
 * @Description
 * @Author Abel
 * @Date 2022/7/2 18:51
 * @Version 1.0
 **/
public interface TextbookMapper {
    Textbook getTextbookById(@Param("id") String id);
}

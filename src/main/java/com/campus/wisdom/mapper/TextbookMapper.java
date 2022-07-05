package com.campus.wisdom.mapper;

import com.campus.wisdom.entity.Textbook;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName TextbookMapper
 * @Description 教科书
 * @Author Abel
 * @Date 2022/7/2 18:51
 * @Version 1.0
 **/
public interface TextbookMapper {
    /**
      * @Author Abel
      * @Description 根据教科书id查找教科书信息
      * @Date 21:14 2022/7/3
      **/
    Textbook getTextbookById(@Param("id") String id);
}
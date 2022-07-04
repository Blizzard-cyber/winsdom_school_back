package com.campus.wisdom.mapper;

import com.campus.wisdom.entity.Gdesign;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName GdesignMapper
 * @Description
 * @Author Abel
 * @Date 2022/7/3 18:48
 * @Version 1.0
 **/
public interface GdesignMapper {
    Gdesign getGdesignBySid(@Param("sid") String sid);
}

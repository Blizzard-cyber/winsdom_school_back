package com.campus.wisdom.mapper;

import com.campus.wisdom.entity.GdesignInfo;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName GdesignInfoMapper
 * @Description
 * @Author Abel
 * @Date 2022/7/3 18:44
 * @Version 1.0
 **/
public interface GdesignInfoMapper {
    GdesignInfo getGdesignInfoById(@Param("id") String id);
}

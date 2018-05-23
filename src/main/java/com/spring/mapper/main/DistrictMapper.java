package com.spring.mapper.main;

import com.spring.model.District;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by SAM on 2017/10/11.
 */
@Mapper
public interface DistrictMapper {

    Integer addDistrict( District district);

    Integer updateDistrict( District district);

    Integer deleteDistrictByName(@Param("name") String name);

    District findDistrictByName(@Param("name") String name);



}



































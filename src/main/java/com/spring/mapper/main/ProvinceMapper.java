package com.spring.mapper.main;

import com.spring.model.City;
import com.spring.model.Province;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by SAM on 2017/10/11.
 */
@Mapper
public interface ProvinceMapper {

    Integer updateProvince(Province province);

    Integer addProvince( Province province);


    Integer deleteProvinceByName(String name);

    Province findProvinceByName(String name);

    List<Province> findAll();

    List<Map<String,String>> findAllName();

    List<City> citiesInProvince();

    List<String> provincesOfClient(String clientName);

}



































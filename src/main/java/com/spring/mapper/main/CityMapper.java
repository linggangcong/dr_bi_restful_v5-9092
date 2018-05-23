package com.spring.mapper.main;

import com.spring.model.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by SAM on 2017/10/11.
 */
@Mapper
public interface CityMapper {

    Integer addCity( City city);

    Integer updateCity(City city);

    Integer deleteCity(String city_name);

    City findByName(String name);

    List<String> findByTier( String ctiy_level);

    List<String> citiesInProvince( String provinceName);

    List<String> citiesOfClient( String clientName);





}



































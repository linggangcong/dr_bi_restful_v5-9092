package com.spring.mapper.main;

import com.spring.model.Country;
import com.spring.model.ProvincesOneCountry;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by SAM on 2017/10/10.
 */
@Component
@Mapper
public interface CountryMapper {

    Integer updateCountry(Country country);

    Integer addCountry( Country country);


    Integer deleteCountryByName(String countryName);

    Country findCountryByName(String countryName);
    List<Country> selectAll();
   ProvincesOneCountry selectProvincesOneCountry();
}


















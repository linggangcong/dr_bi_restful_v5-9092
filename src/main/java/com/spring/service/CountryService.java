package com.spring.service;

import com.spring.model.Country;
import com.spring.model.ProvincesOneCountry;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by SAM on 2017/10/9.
 */
@Mapper
public interface CountryService {

   Integer  addCountry(Country country);

   Integer update(Country country);

   Integer deleteByName(String name);

   Country findByName(String name);

   List<Country> allCountry();

   ProvincesOneCountry selectProvincesOneCountry();

}

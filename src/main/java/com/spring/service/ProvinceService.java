package com.spring.service;

import com.spring.model.Province;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by SAM on 2017/10/9.
 */
@Mapper
public interface ProvinceService {
   
   Integer  addProvince(Province province);

   Integer update(Province province);

   Integer deleteByName(String name);

   Province findByName(String name);

   List<Province> allProvinces();

   List<Map<String,String>> allProvincesName();

   List<String> provincesOfClient(String clientName);

}

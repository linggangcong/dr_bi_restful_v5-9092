package com.spring.service.impl;

import com.spring.mapper.main.CityMapper;
import com.spring.model.City;
import com.spring.service.CityService;
import com.spring.util.ExceptionUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by SAM on 2017/10/13.
 */

@Service
@Scope("prototype")
public class CityServiceImpl implements CityService{
    @Resource   //按照名称装配。找不到名称，按类型装配。
    CityMapper cityMapper;

    @Override
    public Integer addCity(City city) {
       Integer num=cityMapper.addCity(city);
       if(num==0){
           ExceptionUtil.dataNotExistException("增加失败");
       }
        return num;
    }
    @Override
    public Integer update(City city) {
        Integer num=cityMapper.updateCity(city);
        if(num==0){
            ExceptionUtil.dataNotExistException("更新失败");
        }
        return num;
    }

        @Override
        public City findByName(String name) {
            return cityMapper.findByName(name);
        }

        @Override
        public List<String> findByTier(String cityLevel) {
            List<String>  list=cityMapper.findByTier(cityLevel);
            return list;
        }


        @Override
        public Integer deleteByName(String name) {
            Integer num=cityMapper.deleteCity(name);
        if(num==0){
            ExceptionUtil.dataNotExistException("删除失败");  //
        }
        return num;
    }

    @Override
    public List<String> citiesInProvince(String name) {
        List<String>  list=cityMapper.citiesInProvince(name);
        return list;
    }


    @Override
    public List<String> citiesOfClient(String name) {
        List<String>  listCities=cityMapper.citiesOfClient(name);
        return listCities;
    }

}

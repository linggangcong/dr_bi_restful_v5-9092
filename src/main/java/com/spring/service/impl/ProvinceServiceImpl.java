package com.spring.service.impl;

import com.spring.mapper.main.ProvinceMapper;
import com.spring.model.Province;
import com.spring.service.ProvinceService;
import com.spring.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by SAM on 2017/10/10.
 */
@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    ProvinceMapper provinceMapper;
    @Override
    public Integer  addProvince(Province province){
        Integer num=provinceMapper.addProvince(province);
        if(num==0){
            ExceptionUtil.dataNotExistException("增加失败");
        }
        return num;
    }

    @Override
    public Integer update(Province province){
        return provinceMapper.updateProvince(province);
    }

    @Override
    public Integer deleteByName(String name) {
        return provinceMapper.deleteProvinceByName(name);
    }

    @Override
    public Province findByName(String name) {
        return provinceMapper.findProvinceByName(name);
    }

    @Override
    public List<Province> allProvinces() {
        return provinceMapper.findAll();
    }

    @Override
    public List<Map<String,String>> allProvincesName() {
        return provinceMapper.findAllName();
    }
    @Override
    public List<String> provincesOfClient(String clientName) {
        return provinceMapper.provincesOfClient(clientName);
    }
}

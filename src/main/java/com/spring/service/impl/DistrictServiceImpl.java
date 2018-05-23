package com.spring.service.impl;

import com.spring.mapper.main.DistrictMapper;
import com.spring.model.District;
import com.spring.service.DistrictService;
import com.spring.util.ExceptionUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by SAM on 2017/10/13.
 */
@Service
@Scope("prototype")
public class DistrictServiceImpl implements DistrictService{
    @Resource
    DistrictMapper districtMapper;

    @Override
    public Integer add(District district) {
       Integer num=districtMapper.addDistrict(district);
       if(num==0){
           ExceptionUtil.dataNotExistException("增加失败");
       }
        return num;
    }
    @Override
    public Integer update(District district) {
        Integer num=districtMapper.updateDistrict(district);
        if(num==0){
            ExceptionUtil.dataNotExistException("更新失败");
        }
        return num;
    }

    @Override
    public District findByName(String name) {
       return districtMapper.findDistrictByName(name);
    }


    @Override
    public Integer deleteByName(String name) {
        Integer num=districtMapper.deleteDistrictByName(name);
        if(num==0){
            ExceptionUtil.dataNotExistException("删除失败");
        }
        return num;
    }

}

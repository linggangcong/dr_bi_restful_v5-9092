package com.spring.service.impl;

import com.spring.mapper.main.Child_brandMapper;
import com.spring.model.Child_brand;
import com.spring.service.Child_brandService;
import com.spring.util.ExceptionUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by SAM on 2017/10/13.
 */
@Service
@Scope("prototype")
public class Child_brandServiceImpl implements Child_brandService{
    @Resource
    Child_brandMapper childBrandMapper;

    @Override
    public Integer add(Child_brand child_brand) {
        Integer num=childBrandMapper.insertChild_brand(child_brand);
       if(num==0){
           ExceptionUtil.dataNotExistException("增加失败");
       }
        return num;
    }
    @Override
    public Integer update(Child_brand child_brand) {
        Integer num=childBrandMapper.updateChild_brandByName(child_brand);
        if(num==0){
            ExceptionUtil.dataNotExistException("更新失败");  //
        }
        return num;
    }

    @Override
    public Child_brand findByName(String name) {
       return childBrandMapper.getChild_brand(name);
    }


    @Override
    public Integer deleteByName(String name) {
        Integer num=childBrandMapper.deleteChild_brandByName(name);
        if(num==0){
            ExceptionUtil.dataNotExistException("删除失败");  //
        }
        return num;
    }

}

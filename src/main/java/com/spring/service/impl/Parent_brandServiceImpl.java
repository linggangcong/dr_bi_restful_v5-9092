package com.spring.service.impl;

import com.spring.mapper.main.Parent_brandMapper;
import com.spring.model.Parent_brand;
import com.spring.model.Parent_brandTrimed;
import com.spring.service.Parent_brandService;
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
public class Parent_brandServiceImpl implements Parent_brandService{
    @Resource
    Parent_brandMapper parent_brandMapper;

    @Override
    public Integer add(Parent_brand parent_brand) {
       Integer num=parent_brandMapper.addParent_brand(parent_brand);
       if(num==0){
           ExceptionUtil.dataNotExistException("增加失败");  //
       }
        return num;
    }
    @Override
    public Integer update(Parent_brand parent_brand) {
        Integer num=parent_brandMapper.updateParent_brand(parent_brand);
        if(num==0){
            ExceptionUtil.dataNotExistException("更新失败");  //
        }
        return num;
    }

    @Override
    public Parent_brand findByName(String name) {
       return parent_brandMapper.findParent_brandByName(name);
    }


    @Override
    public Integer deleteByName(String name) {
        Integer num=parent_brandMapper.deleteParent_brandByName(name);
        if(num==0){
            ExceptionUtil.dataNotExistException("删除失败");  //
        }
        return num;
    }

    @Override
    public List<Parent_brandTrimed> categoryToParentBrand(String categoryCode) {
        return parent_brandMapper.categoryToParentBrand(categoryCode);

    }
    @Override
    public List<Parent_brandTrimed> brandOfClient(String clientName) {
        return parent_brandMapper.brandOfClient(clientName);

    }
}

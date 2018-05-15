package com.spring.service.impl;

import com.spring.mapper.main.Feature_category_relMapper;
import com.spring.model.Feature_category_rel;
import com.spring.service.Feature_category_relService;
import com.spring.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SAM on 2017/10/10.
 */
@Service
public class Feature_category_relServiceImpl implements Feature_category_relService {
    @Autowired
    Feature_category_relMapper product_category_featuretypeMapper;
    @Override
    public Integer  add(Feature_category_rel product_category_featuretype){
        Integer num=product_category_featuretypeMapper.addfeature_category_rel(product_category_featuretype);
        if(num==0){
            ExceptionUtil.dataNotExistException("增加失败");
        }
        return num;
    }

    @Override
    public Integer update(Feature_category_rel product_category_featuretype){
        return product_category_featuretypeMapper.updatefeature_category_rel(product_category_featuretype);
    }

    @Override
    public Integer deleteByName(String name) {
        return product_category_featuretypeMapper.deletefeature_category_relByName(name);
    }

    @Override
    public List<Feature_category_rel> findByName(String name) {
        return product_category_featuretypeMapper.findfeature_category_relByName(name);
    }

    @Override
    public List<String> findFeaturetypeName(String categoryCode) {
        return product_category_featuretypeMapper.findFeaturetypeByCategory(categoryCode);
    }

    @Override
    public List<String> findFeatureByCategory(String categoryDesc ,String featuretypeDesc) {
        return product_category_featuretypeMapper.findFeatureByCategory(categoryDesc ,featuretypeDesc);
    }
}

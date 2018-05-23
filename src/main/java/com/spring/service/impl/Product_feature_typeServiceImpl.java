package com.spring.service.impl;

import com.spring.mapper.main.Product_feature_typeMapper;
import com.spring.model.Product_feature_type;
import com.spring.service.Product_feature_typeService;
import com.spring.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SAM on 2017/10/10.
 */
@Service
public class Product_feature_typeServiceImpl implements Product_feature_typeService {
    @Autowired
    Product_feature_typeMapper product_feature_typeMapper;
    @Override
    public Integer  addProduct_feature_type(Product_feature_type product_feature_type){
        Integer num=product_feature_typeMapper.addProduct_feature_type(product_feature_type);
        if(num==0){
            ExceptionUtil.dataNotExistException("增加失败");
        }
        return num;
    }

    @Override
    public Integer update(Product_feature_type product_feature_type){
        return product_feature_typeMapper.updateProduct_feature_type(product_feature_type);
    }

    @Override
    public Integer deleteByDesc(String desc) {
        return product_feature_typeMapper.deleteProduct_feature_typeByName(desc);
    }

    @Override
    public Product_feature_type findByDesc(String desc) {
        return product_feature_typeMapper.findProduct_feature_typeByName(desc);
    }
}

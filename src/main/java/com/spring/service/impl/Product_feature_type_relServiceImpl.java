package com.spring.service.impl;

import com.spring.mapper.main.Product_feature_type_relMapper;
import com.spring.model.Product_feature_type_rel;
import com.spring.service.Product_feature_type_relService;
import com.spring.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SAM on 2017/10/10.
 */
@Service
public class Product_feature_type_relServiceImpl implements Product_feature_type_relService {
    @Autowired
    Product_feature_type_relMapper product_feature_type_relMapper;
    @Override
    public Integer  addProduct_feature_type_rel(Product_feature_type_rel product_feature_type_rel){
        Integer num=product_feature_type_relMapper.addProduct_feature_type_rel(product_feature_type_rel);
        if(num==0){
            ExceptionUtil.dataNotExistException("增加失败");
        }
        return num;
    }

    @Override
    public Integer update(Product_feature_type_rel product_feature_type_rel){
        return product_feature_type_relMapper.updateProduct_feature_type_rel(product_feature_type_rel);
    }

    @Override
    public Integer deleteById(int id) {
        return product_feature_type_relMapper.deleteProduct_feature_type_relById(id);
    }

    @Override
    public Product_feature_type_rel findById(int id) {
        return product_feature_type_relMapper.findProduct_feature_type_relById(id);
    }
}

package com.spring.service.impl;

import com.spring.mapper.main.Product_feature_relMapper;
import com.spring.model.Product_feature_rel;
import com.spring.service.Product_feature_relService;
import com.spring.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SAM on 2017/10/10.
 */
@Service
public class Product_feature_relServiceImpl implements Product_feature_relService {
    @Autowired
    Product_feature_relMapper product_feature_relMapper;

    @Override
    public Integer  addProduct_feature_rel(Product_feature_rel product_feature_rel){
        Integer num= product_feature_relMapper.addProduct_feature_rel(product_feature_rel);
        if(num==0){
            ExceptionUtil.dataNotExistException("增加失败");
        }
        return num;
    }

    @Override
    public Integer update(Product_feature_rel product_feature_rel){
        return product_feature_relMapper.updateProduct_feature_rel(product_feature_rel);
    }

    @Override
    public Integer deleteById(int id) {
        return product_feature_relMapper.deleteProduct_feature_relById(id);
    }


}

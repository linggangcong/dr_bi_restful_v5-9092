package com.spring.service.impl;

import com.spring.mapper.main.Product_featureMapper;
import com.spring.model.Product_feature;
import com.spring.service.Product_featureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SAM on 2017/10/10.
 */
@Service
public class Product_featureServiceImpl implements Product_featureService {
    @Autowired
    Product_featureMapper product_featureMapper;
    @Override
    public Integer  addProduct_feature(Product_feature product_feature){
        return product_featureMapper.addProduct_feature(product_feature);

    }

    @Override
    public Integer update(Product_feature product_feature){
        return product_featureMapper.updateProduct_feature(product_feature);
    }

    @Override
    public Integer deleteByName(String featureCode)    {
        return product_featureMapper.deleteProduct_featureByName(featureCode);
    }

    @Override
    public Product_feature findByName(String featureCode) {
        return product_featureMapper.findProduct_featureByName(featureCode);
    }
}

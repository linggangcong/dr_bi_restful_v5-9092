package com.spring.mapper.main;

import com.spring.model.Product_feature;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by SAM on 2017/10/10.
 */
@Mapper
public interface Product_featureMapper {

    Integer updateProduct_feature(Product_feature product_feature);

    Integer addProduct_feature(Product_feature product_feature);

    Integer deleteProduct_featureByName(String featureCode);

    Product_feature findProduct_featureByName(String featureCode);

}


















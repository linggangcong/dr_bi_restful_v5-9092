package com.spring.service;

import com.spring.model.Product_feature;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by SAM on 2017/10/9.
 */
@Mapper
public interface Product_featureService {

   Integer  addProduct_feature(Product_feature product_feature);

   Integer update(Product_feature product_feature);

   Integer deleteByName(String featureCode);

   Product_feature findByName(String featureCode);


}

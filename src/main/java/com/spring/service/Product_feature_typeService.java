package com.spring.service;

import com.spring.model.Product_feature_type;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by SAM on 2017/10/9.
 */
@Mapper
public interface Product_feature_typeService {

   Integer  addProduct_feature_type(Product_feature_type product_feature_type);

   Integer update(Product_feature_type product_feature_type);

   Integer deleteByDesc(String desc);

   Product_feature_type findByDesc(String desc);


}

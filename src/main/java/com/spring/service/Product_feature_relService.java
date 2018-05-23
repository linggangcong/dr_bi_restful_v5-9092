package com.spring.service;

import com.spring.model.Product_feature_rel;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by SAM on 2017/10/9.
 */
@Mapper
public interface Product_feature_relService {

   Integer  addProduct_feature_rel(Product_feature_rel product_feature_rel);

   Integer update(Product_feature_rel product_feature_rel);

   Integer deleteById(int id);

   


}

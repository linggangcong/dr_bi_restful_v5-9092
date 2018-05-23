package com.spring.mapper.main;

import com.spring.model.Product_feature_rel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


/**
 * Created by SAM on 2017/10/10.
 */
@Component
@Mapper
public interface Product_feature_relMapper {

    Integer updateProduct_feature_rel(Product_feature_rel product_feature_rel);

    Integer addProduct_feature_rel(Product_feature_rel product_feature_rel);

    Integer deleteProduct_feature_relById(int id);



}


















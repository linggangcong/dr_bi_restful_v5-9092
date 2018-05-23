package com.spring.mapper.main;

import com.spring.model.Product_feature_type;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * Created by SAM on 2017/10/10.
 */
@Component
@Mapper
public interface Product_feature_typeMapper {

    Integer updateProduct_feature_type(Product_feature_type product_feature_type);

    Integer addProduct_feature_type(Product_feature_type product_feature_type);

    Integer deleteProduct_feature_typeByName(String desc);

    Product_feature_type findProduct_feature_typeByName(@Param("featureTypeDesc") String desc);

}


















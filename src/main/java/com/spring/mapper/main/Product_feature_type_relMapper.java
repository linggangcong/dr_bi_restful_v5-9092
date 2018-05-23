package com.spring.mapper.main;

import com.spring.model.Product_feature_type_rel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by SAM on 2017/10/10.
 */
@Component
@Mapper
public interface Product_feature_type_relMapper {

        Integer updateProduct_feature_type_rel(Product_feature_type_rel product_feature_type_rel);

        Integer addProduct_feature_type_rel(Product_feature_type_rel product_feature_type_rel);

        Integer deleteProduct_feature_type_relById(int id);

        Product_feature_type_rel findProduct_feature_type_relById(int id);
}


















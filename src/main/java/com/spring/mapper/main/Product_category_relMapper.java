package com.spring.mapper.main;

import com.spring.model.Product_category_rel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by SAM on 2017/10/10.
 */
@Component
@Mapper
public interface Product_category_relMapper {

    Integer updateProduct_category_rel(Product_category_rel product_category_rel);

    Integer addProduct_category_rel(Product_category_rel product_category_rel);

    Integer deleteProduct_category_relById(int productId);

    List<Product_category_rel> findProduct_category_relById(int id);

}


















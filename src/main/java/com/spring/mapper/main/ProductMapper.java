package com.spring.mapper.main;

import com.spring.model.Product;
import com.spring.model.ProductTrimed;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by SAM on 2017/10/11.
 */
@Mapper
public interface ProductMapper {

    Integer addProduct(Product product);

    Integer updateProduct(Product product);

    Integer deleteProductByName(String name);

    Product findProductByName(String name);

    List<ProductTrimed> productsInCategory(String code);
    List<ProductTrimed> productsInCategoryBrand(@Param("categoryCode") String categoryCode ,@Param("brandName") String brandName);







}



































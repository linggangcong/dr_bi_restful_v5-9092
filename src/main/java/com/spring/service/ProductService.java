package com.spring.service;

import com.spring.model.Product;
import com.spring.model.ProductTrimed;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by SAM on 2017/10/9.
 */
@Mapper
public interface ProductService {

   Integer  addProduct(Product product);

   Integer update(Product product);

   Integer deleteByName(String name);

   Product findByName(String name);

   List<ProductTrimed> productsInCategory(String code);

   List<ProductTrimed> productsInCategoryBrand(String categoryCode ,String brandName);


}

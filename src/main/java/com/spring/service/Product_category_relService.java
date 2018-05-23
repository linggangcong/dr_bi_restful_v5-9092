package com.spring.service;

import com.spring.model.Product_category_rel;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * Created by SAM on 2017/10/9.
 */
@Mapper
public interface Product_category_relService {
   Integer  addProduct_category_rel(Product_category_rel product_category_rel);

   Integer update(Product_category_rel product_category_rel);

   Integer deleteById(int id);

   List<Product_category_rel> findProduct_category_relById(int id);

}

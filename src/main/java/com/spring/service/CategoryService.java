package com.spring.service;

import com.spring.model.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by SAM on 2017/10/9.
 */
@Mapper
public interface CategoryService {
   Integer  addCategory(Category category);

   Integer update(Category category);

    //Category findByName(String category_name);

   Integer deleteByName(String code);

   Category findByName(String name);

   List<Category> findByIndistinctName(String desc);

   List<String> categoryOfClient(String clientName);

   List<Category> all();

   List<Category> findCategoryByClient(String clientId);



}

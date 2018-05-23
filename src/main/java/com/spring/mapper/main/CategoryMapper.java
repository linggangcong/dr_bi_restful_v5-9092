package com.spring.mapper.main;

import com.spring.model.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by SAM on 2017/10/10.
 */
@Component
@Mapper
public interface CategoryMapper {

    Integer updateCategory(Category category);

    Integer addCategory(Category category);

    Integer deleteCategoryByName(String code);

    Category findCategoryByName( String desc);

    List<Category> findByIndistinctName( @Param("desc")String desc);

    List<String> categoryOfClient(String clientName);

    List<Category> findAll();

    List<Category> findCategoryByClient(String clientId);

}


















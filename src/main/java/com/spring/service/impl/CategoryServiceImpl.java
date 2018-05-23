package com.spring.service.impl;

import com.spring.mapper.main.CategoryMapper;
import com.spring.model.Category;
import com.spring.service.CategoryService;
import com.spring.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SAM on 2017/10/10.
 */
@Service
@ComponentScan
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public Integer  addCategory(Category category){
        Integer num=categoryMapper.addCategory(category);
        if(num==0){
            ExceptionUtil.dataNotExistException("增加失败");
        }
        return num;
    }

    @Override
    public Integer update(Category category){
        return categoryMapper.updateCategory(category);
    }

    @Override
    public Integer deleteByName(String name) {
        return categoryMapper.deleteCategoryByName(name);
    }

    @Override
    public Category findByName(String name) {
        return categoryMapper.findCategoryByName(name);
    }

    @Override
    public List<String> categoryOfClient(String clientName) {
        return categoryMapper.categoryOfClient(clientName);
    }

    @Override
    public List<Category> all() {
        return categoryMapper.findAll();
    }

    @Override
    public List<Category> findByIndistinctName(String indistinctName) {
        return categoryMapper.findByIndistinctName(indistinctName);
    }

    @Override
    public List<Category> findCategoryByClient(String clientId) {
        return categoryMapper.findCategoryByClient(clientId);
    }
}

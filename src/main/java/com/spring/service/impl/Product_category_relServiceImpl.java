package com.spring.service.impl;

import com.spring.mapper.main.Product_category_relMapper;
import com.spring.model.Product_category_rel;
import com.spring.service.Product_category_relService;
import com.spring.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SAM on 2017/10/10.
 */
@Service
public class Product_category_relServiceImpl implements Product_category_relService {
    @Autowired
    Product_category_relMapper product_category_relMapper;
    @Override
    public Integer  addProduct_category_rel(Product_category_rel product_category_rel){
        Integer num=product_category_relMapper.addProduct_category_rel(product_category_rel);
        if(num==0){
            ExceptionUtil.dataNotExistException("增加失败");
        }
        return num;
    }

    @Override
    public Integer update(Product_category_rel product_category_rel){
        return product_category_relMapper.updateProduct_category_rel(product_category_rel);
    }

    @Override
    public Integer deleteById(int id) {
        return product_category_relMapper.deleteProduct_category_relById(id);
    }

    @Override
    public List<Product_category_rel> findProduct_category_relById(int id) {
        return product_category_relMapper.findProduct_category_relById(id);
    }
}

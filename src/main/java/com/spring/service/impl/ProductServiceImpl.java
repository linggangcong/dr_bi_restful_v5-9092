package com.spring.service.impl;

import com.spring.mapper.main.ProductMapper;
import com.spring.model.Product;
import com.spring.model.ProductTrimed;
import com.spring.service.ProductService;
import com.spring.util.ExceptionUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by SAM on 2017/10/13.
 */
@Service
@Scope("prototype")
public class ProductServiceImpl implements ProductService{
    @Resource
    ProductMapper productMapper;

    @Override
    public Integer addProduct(Product product) {
       Integer num=productMapper.addProduct(product);
       if(num==0){
           ExceptionUtil.dataNotExistException("增加失败");
       }
        return num;
    }
    @Override
    public Integer update(Product product) {
        Integer num=productMapper.updateProduct(product);
        if(num==0){
            ExceptionUtil.dataNotExistException("更新失败");
        }
        return num;
    }

    @Override
    public Product findByName(String name) {
       return productMapper.findProductByName(name);
    }


    @Override
    public Integer deleteByName(String name) {
        Integer num=productMapper.deleteProductByName(name);
        if(num==0){
            ExceptionUtil.dataNotExistException("删除失败");
        }
        return num;
    }

    @Override
    public List<ProductTrimed> productsInCategory(String code) {
        return productMapper.productsInCategory(code);
    }

    @Override
    public List<ProductTrimed> productsInCategoryBrand(String categoryCode ,String brandName) {
        return productMapper.productsInCategoryBrand(categoryCode ,brandName);
    }
}

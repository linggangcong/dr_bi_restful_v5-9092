package com.spring.controller;

import com.spring.model.Product;
import com.spring.model.ProductTrimed;
import com.spring.service.ProductService;
import com.spring.util.CommonResponse;
import com.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created by SAM on 2017/10/9.
 */
@Controller
@RequestMapping("/protected/product")
@Transactional
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping(value="/add")
    @ResponseBody
    public  CommonResponse addProduct(Product product){
        Integer num = 0;
        num = productService.addProduct(product);
        return ResponseUtil.success(num);
    }

    @PutMapping("/update")
    @ResponseBody
    public CommonResponse updateProduct(Product product) {

        Integer num = 0;
        num = productService.update(product);
        return ResponseUtil.success(num);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public CommonResponse deleteProduct(String productName) {
        Integer num = 0;
        num = productService.deleteByName(productName);
        return ResponseUtil.success(num);
    }


    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName(String productName ){
        Product product = productService.findByName(productName);
        if (product==null) {
            return ResponseUtil.exception("product_name不存在");
        }
        return ResponseUtil.success(product);
    }

    @GetMapping(value="/productsInCategory")
    @ResponseBody
    public CommonResponse productsInCategory(String code ){
        List<ProductTrimed> listProduct = productService.productsInCategory(code);
        if (listProduct==null) {
            return ResponseUtil.exception("product_name不存在");
        }
        return ResponseUtil.success(listProduct);
    }
    @GetMapping(value="/productsInCategoryBrand")
    @ResponseBody
    public CommonResponse productsInCategoryBrand(String categoryCode ,String brandName){
        List<ProductTrimed> list = productService.productsInCategoryBrand(categoryCode,brandName);
        if (list==null) {
            return ResponseUtil.exception("product_name不存在");
        }
        return ResponseUtil.success(list);
    }

}

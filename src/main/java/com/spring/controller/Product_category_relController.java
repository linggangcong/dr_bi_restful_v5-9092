package com.spring.controller;

import com.spring.model.Product_category_rel;
import com.spring.service.Product_category_relService;
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
@RequestMapping("/protected/product_category_rel")
@Transactional
public class Product_category_relController {
    @Autowired
    private Product_category_relService product_category_relService;
    @PostMapping(value="/add")
    @ResponseBody
    public CommonResponse addProduct_category_rel(Product_category_rel product_category_rel){
        int num=product_category_relService.addProduct_category_rel(product_category_rel);
        return ResponseUtil.success(num);
    }

    @PutMapping(value="/update")
    @ResponseBody
    public CommonResponse updateProduct_category_rel(Product_category_rel product_category_rel){
        int num=product_category_relService.update(product_category_rel);
        return ResponseUtil.success(num);
    }

    @DeleteMapping(value="/delete")
    @ResponseBody
    public CommonResponse deleteProduct_category_rel(int productId){
        int num=product_category_relService.deleteById(productId);
        return ResponseUtil.success(num);
    }

    @GetMapping(value = "/find_by_name")
    @ResponseBody
    public CommonResponse findProduct_category_relById(int productId){
        List<Product_category_rel> listPCR=product_category_relService.findProduct_category_relById(productId);
        return ResponseUtil.success(listPCR);
    }
}

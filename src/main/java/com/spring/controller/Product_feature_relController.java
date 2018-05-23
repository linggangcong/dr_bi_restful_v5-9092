package com.spring.controller;

import com.spring.model.Product_feature_rel;
import com.spring.service.Product_feature_relService;
import com.spring.util.CommonResponse;
import com.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * Created by SAM on 2017/10/9.
 */
@Controller
@RequestMapping("/protected/product_featrure_rel")
//加上这个注解，使得支持事务
@Transactional
public class Product_feature_relController {
    @Autowired
    private Product_feature_relService product_feature_relService;

    @PostMapping(value="/add")
    @ResponseBody
    public CommonResponse addProduct_featrure_rel(Product_feature_rel product_feature_rel){
        

       int num= product_feature_relService.addProduct_feature_rel(product_feature_rel);
        return ResponseUtil.success(num);
    }

    @PutMapping(value="/update")
    @ResponseBody
    public CommonResponse updateProduct_featrure_rel(Product_feature_rel product_feature_rel){


        int num= product_feature_relService.update(product_feature_rel);
        return ResponseUtil.success(num);
    }

    @DeleteMapping(value="/delete")
    @ResponseBody
    public CommonResponse deleteProduct_featrure_rel( @RequestParam("id") int id){

        int num= product_feature_relService.deleteById(id);
        return ResponseUtil.success(num);
    }

}

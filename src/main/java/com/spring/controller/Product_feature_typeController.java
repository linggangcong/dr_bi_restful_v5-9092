package com.spring.controller;

import com.spring.model.Product_feature_type;
import com.spring.service.Product_feature_typeService;
import com.spring.util.CommonResponse;
import com.spring.util.ResponseUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * Created by SAM on 2017/10/9.
 */
@Controller
@RequestMapping("/protected/product_feature_type")
//加上这个注解，使得支持事务
@Transactional
public class Product_feature_typeController {

    @Autowired
    private Product_feature_typeService product_feature_typeService;

    @PostMapping(value="/add")
    @ResponseBody
    public CommonResponse addProduct_feature_type(Product_feature_type product_feature_type){


        int num=product_feature_typeService.addProduct_feature_type(product_feature_type);
        return ResponseUtil.success(num);

    }

    @PutMapping(value="/update")
    @ResponseBody
    public CommonResponse updateProduct_feature_type(Product_feature_type product_feature_type){


        int num= product_feature_typeService.update(product_feature_type);
        return ResponseUtil.success(num);
    }

    @DeleteMapping(value="/delete")
    @ResponseBody
    public CommonResponse deleteProduct_feature_type( @Param("desc")String desc){

        int num= product_feature_typeService.deleteByDesc(desc);
        return ResponseUtil.success(num);
    }

    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName(@Param("desc") String desc){

        Product_feature_type product_feature_type= product_feature_typeService.findByDesc(desc);
        return ResponseUtil.success(product_feature_type);
    }

}

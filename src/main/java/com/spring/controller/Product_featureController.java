package com.spring.controller;

import com.spring.model.Product_feature;
import com.spring.service.Product_featureService;
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
@RequestMapping("/protected/product_feature")
@Transactional
public class Product_featureController {

    @Autowired
    private Product_featureService product_featureService;
   

    @PostMapping(value="/add")
    @ResponseBody
    public CommonResponse addProduct_feature(Product_feature product_feature){
        

        int num=product_featureService.addProduct_feature(product_feature);
        return ResponseUtil.success(num);

       
    }

    @PutMapping(value="/update")
    @ResponseBody
    public CommonResponse updateProduct_feature(Product_feature product_feature){


        int num= product_featureService.update(product_feature);
        return ResponseUtil.success(num);
    }

    @DeleteMapping(value="/delete")
    @ResponseBody
    public CommonResponse deleteProduct_feature(@RequestParam("featureCode")String featureCode){

        int num= product_featureService.deleteByName(featureCode);
        return ResponseUtil.success(num);
    }

    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName(@RequestParam("featureCode")String featureCode){

        Product_feature product_feature = product_featureService.findByName(featureCode);
        return ResponseUtil.success(product_feature);

    }

}

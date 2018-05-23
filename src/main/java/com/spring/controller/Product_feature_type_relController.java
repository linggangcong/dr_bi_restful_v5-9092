package com.spring.controller;

import com.spring.model.Product_feature_type_rel;
import com.spring.service.Product_feature_type_relService;
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
@RequestMapping("/protected/product_feature_type_rel")
@Transactional
public class Product_feature_type_relController {

    @Autowired
    private Product_feature_type_relService product_feature_type_relService;
   

    @PostMapping(value="/add")
    @ResponseBody
    public CommonResponse addProduct_feature_type_rel(@RequestParam("productId") int id, @RequestParam("featuretypeCode")String featuretypeCode){
        
        Product_feature_type_rel product_feature_type_rel=new Product_feature_type_rel();

        product_feature_type_rel.setProductId(id);
        product_feature_type_rel.setFeatureTypeCode(featuretypeCode);
        int num=product_feature_type_relService.addProduct_feature_type_rel(product_feature_type_rel);
        return ResponseUtil.success(num);

       
    }

    @PutMapping(value="/update")
    @ResponseBody
    public CommonResponse updateProduct_feature_type_rel( @RequestParam("productId") int id, @RequestParam("featuretypeCode")String featuretypeCode){

        Product_feature_type_rel product_feature_type_rel =new Product_feature_type_rel();
        product_feature_type_rel.setProductId(id);
        product_feature_type_rel.setFeatureTypeCode(featuretypeCode);
        int num=product_feature_type_relService.update(product_feature_type_rel);
        return ResponseUtil.success(num);

    }

    @DeleteMapping(value="/delete")
    @ResponseBody
    public CommonResponse deleteProduct_feature_type_rel(@RequestParam("productId") int id){

        int num= product_feature_type_relService.deleteById(id);
        return ResponseUtil.success(num);

    }

    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName(@RequestParam("productId") int id){

        Product_feature_type_rel product_feature_type_rel= product_feature_type_relService.findById(id);
        return ResponseUtil.success(product_feature_type_rel);
    }

}

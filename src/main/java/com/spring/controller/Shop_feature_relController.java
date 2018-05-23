package com.spring.controller;

import com.spring.model.Shop_feature_rel;
import com.spring.service.Shop_feature_relService;
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
@RequestMapping("/protected/shop_feature_rel")
//加上这个注解，使得支持事务
@Transactional
public class Shop_feature_relController {

    @Autowired
    private Shop_feature_relService shop_feature_relService;
   

    @PostMapping(value="/add")
    @ResponseBody
    public  CommonResponse addShop_feature_rel(Shop_feature_rel shop_feature_rel){
        

        int num=shop_feature_relService.addShop_feature_rel(shop_feature_rel);
        return ResponseUtil.success(num);

    }

    @PutMapping(value="/update")
    @ResponseBody
    public CommonResponse updateShop_feature_rel(Shop_feature_rel shop_feature_rel){

        int num=shop_feature_relService.update(shop_feature_rel);
        return  ResponseUtil.success(num);
    }

    @DeleteMapping(value="/delete")
    @ResponseBody
    public CommonResponse deleteShop_feature_rel(@RequestParam("shopId") int shopId){
        int num= shop_feature_relService.deleteByName(shopId);
        return ResponseUtil.success(num);
    }

    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName(@RequestParam("shopId") int shopId){

        Shop_feature_rel shop_feature_rel= shop_feature_relService.findByName(shopId);
        return ResponseUtil.success(shop_feature_rel);
    }

}

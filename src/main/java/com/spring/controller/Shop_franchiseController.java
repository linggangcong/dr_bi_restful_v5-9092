package com.spring.controller;

import com.spring.model.Shop_franchise;
import com.spring.service.Shop_franchiseService;
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
@RequestMapping("/protected/shop_franchise")
@Transactional
public class Shop_franchiseController {

    @Autowired
    private Shop_franchiseService shop_franchiseService;
   

    @PostMapping(value="/add")
    @ResponseBody
            public CommonResponse addShop_franchise(Shop_franchise shop_franchise) {
        int num = shop_franchiseService.addShop_franchise(shop_franchise);
        return ResponseUtil.success(num);
    }



    @PutMapping(value="/update")
    @ResponseBody
    public CommonResponse updateShop_franchise(Shop_franchise shop_franchise){


        int num=shop_franchiseService.update(shop_franchise);
        return ResponseUtil.success(num);
    }

    @DeleteMapping(value="/delete")
    @ResponseBody
    public CommonResponse deleteShop_franchise(@Param("franchiseId")int franchiseId){
        int num= shop_franchiseService.deleteByName(franchiseId);
        return ResponseUtil.success(num);
    }

    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName(@Param("franchiseId") int franchiseId){
        Shop_franchise shop_franchise= shop_franchiseService.findByName(franchiseId);
        return ResponseUtil.success(shop_franchise);
    }

}

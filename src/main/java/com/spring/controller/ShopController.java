package com.spring.controller;

import com.spring.model.Shop;
import com.spring.service.ShopService;
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
@RequestMapping("/protected/shop")
@Transactional
public class ShopController {

    @Autowired
    private ShopService shopService;

    @PostMapping(value="/add")
    @ResponseBody
    public CommonResponse addShop(Shop shop){
        int num =shopService.addShop(shop);
        return ResponseUtil.success(num);
    }

    @PutMapping(value="/update")
    @ResponseBody
    public CommonResponse updateShop(Shop shop){
        int num= shopService.update(shop);
        return ResponseUtil.success(num);
    }

    @DeleteMapping(value="/delete")
    @ResponseBody
    public CommonResponse deleteShop(String shopName){
        int num= shopService.deleteByName(shopName);
        return ResponseUtil.success(num);
    }

    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName( String shopName){
        Shop shop= shopService.findByName(shopName);
        return ResponseUtil.success(shop);
    }
}

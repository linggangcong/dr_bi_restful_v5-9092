package com.spring.controller;

import com.spring.model.ShopNew;
import com.spring.service.ShopNewService;
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
@RequestMapping("/protected/shopNew")
@Transactional
public class ShopNewController {

    @Autowired
    private ShopNewService shopNewService;

    @PostMapping(value="/add")
    @ResponseBody
    public CommonResponse addShopNew(ShopNew shopNew){
        int num =shopNewService.addShopNew(shopNew);
        return ResponseUtil.success(num);
    }

    @PutMapping(value="/update")
    @ResponseBody
    public CommonResponse updateShopNew(ShopNew shopNew){
        int num= shopNewService.update(shopNew);
        return ResponseUtil.success(num);
    }

    @DeleteMapping(value="/delete")
    @ResponseBody
    public CommonResponse deleteShopNew(String shopId){
        int num= shopNewService.deleteById(shopId);
        return ResponseUtil.success(num);
    }

    @GetMapping(value="/find_by_location")
    @ResponseBody
    public CommonResponse findByLocation( String countryId, String provinceId, String cityId, String districtId){
        List<ShopNew> shopNewList= shopNewService.findByLocation( countryId, provinceId,  cityId,  districtId);
        return ResponseUtil.success(shopNewList);
    }
}

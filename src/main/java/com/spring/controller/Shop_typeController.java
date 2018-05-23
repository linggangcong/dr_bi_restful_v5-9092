package com.spring.controller;

import com.spring.model.Shop_type;
import com.spring.service.Shop_typeService;
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
@RequestMapping("/protected/shop_type")
@Transactional
public class Shop_typeController {

    @Autowired
    private Shop_typeService shop_typeService;
   

    @PostMapping(value="/add")
    @ResponseBody
        public CommonResponse addShop_type(@RequestParam("typeId") int typeId, @RequestParam("typeCode")String typeCode, @RequestParam("typeDesc")String typeDesc, @RequestParam("dataSource")int dataSource, @RequestParam("creUser")String creUser){
        
        Shop_type shop_type=new Shop_type();
        shop_type.setTypeId(typeId);
        shop_type.setTypeCode(typeCode);
        shop_type.setTypeDesc(typeDesc);
        shop_type.setDataSource(dataSource);
        shop_type.setCreUser(creUser);
        int num=shop_typeService.addShop_type(shop_type);
        return ResponseUtil.success(num);

    }

    @PutMapping(value="/update")
    @ResponseBody
    public CommonResponse updateShop_type(@RequestParam("typeId") int typeId, @RequestParam("typeCode")String typeCode, @RequestParam("typeDesc")String typeDesc,@RequestParam("updUser")String updUser){

        Shop_type shop_type =new Shop_type();
        shop_type.setTypeId(typeId);
        shop_type.setTypeCode(typeCode);
        shop_type.setTypeDesc(typeDesc);
        shop_type.setUpdUser(updUser);
        int num= shop_typeService.update(shop_type);
        return ResponseUtil.success(num);

    }

    @DeleteMapping(value="/delete")
    @ResponseBody
    public CommonResponse deleteShop_type(@Param("typeId")int typeId){
        int num= shop_typeService.deleteByName(typeId);
        return ResponseUtil.success(num);
    }

    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName(@Param("typeId") int typeId){
        Shop_type shop_type= shop_typeService.findByName(typeId);
        return ResponseUtil.success(shop_type);
    }

}

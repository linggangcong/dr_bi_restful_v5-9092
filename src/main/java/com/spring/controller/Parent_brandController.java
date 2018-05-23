package com.spring.controller;

import com.spring.model.Parent_brand;
import com.spring.model.Parent_brandTrimed;
import com.spring.service.Parent_brandService;
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
@RequestMapping("/protected/parent_brand")
    @Transactional
    public class Parent_brandController {
        @Autowired
        private Parent_brandService parent_brandService;

        @PostMapping(value="/add")
        @ResponseBody
        public  CommonResponse addParent_brand(Parent_brand parent_brand){
            int num = parent_brandService.add(parent_brand);
            return ResponseUtil.success(num);
    }

    @PutMapping("/update")
    @ResponseBody
    public CommonResponse updateParent_brand(Parent_brand parent_brand) {
        int  num = parent_brandService.update(parent_brand);
        return ResponseUtil.success(num);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public CommonResponse deleteParent_brand(String parent_brand_name) {
        int num = parent_brandService.deleteByName(parent_brand_name);
        return ResponseUtil.success(num);
    }

    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName(String parent_brand_name){
        Parent_brand parent_brand = parent_brandService.findByName(parent_brand_name);
        if (parent_brand==null) {
            return ResponseUtil.exception("parent_brand_name不存在");
        }
        return ResponseUtil.success(parent_brand);
    }

    @GetMapping(value="/categoryToBrand")
    @ResponseBody
    public CommonResponse categoryToBrand(String categoryCode){
        List<Parent_brandTrimed> list = parent_brandService.categoryToParentBrand(categoryCode);
        if (list==null) {
            return ResponseUtil.exception("parent_brand_name不存在");
        }
        return ResponseUtil.success(list);
    }
    @GetMapping(value="/brandOfClient")
    @ResponseBody
    public CommonResponse brandOfClient(String clientName){
        List<Parent_brandTrimed> listBrand = parent_brandService.brandOfClient(clientName);
        if (listBrand==null) {
            return ResponseUtil.exception("parent_brand_name不存在");
        }
        return ResponseUtil.success(listBrand);
    }
}

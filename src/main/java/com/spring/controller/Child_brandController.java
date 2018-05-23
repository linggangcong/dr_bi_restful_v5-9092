package com.spring.controller;

import com.spring.model.Child_brand;
import com.spring.service.Child_brandService;
import com.spring.util.CommonResponse;
import com.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by SAM on 2017/10/9.
 */
@Controller
@RequestMapping("/protected/child_brand")
@Transactional
public class Child_brandController {
    @Autowired
    private Child_brandService child_brandService;

    @PostMapping(value="/add")
    @ResponseBody
    public  CommonResponse addChild_brand(Child_brand child_brand){
        Integer num = 0;
        num = child_brandService.add(child_brand);
        return ResponseUtil.success(num);
    }


    @PutMapping("/update")
    @ResponseBody
    public CommonResponse updateChild_brand(Child_brand child_brand) {

        Integer num = 0;
        num = child_brandService.update(child_brand);
        return ResponseUtil.success(num);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public CommonResponse deleteChild_brand(HttpServletRequest request) {
        String name = request.getParameter("name").toString();
        Integer num = 0;
        num = child_brandService.deleteByName(name);
        return ResponseUtil.success(num);
    }

    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName(String name ){

        Child_brand child_brand = child_brandService.findByName(name);
        if (child_brand==null) {
            return ResponseUtil.exception("child_brand不存在");
        }
        return ResponseUtil.success(child_brand);
    }
}

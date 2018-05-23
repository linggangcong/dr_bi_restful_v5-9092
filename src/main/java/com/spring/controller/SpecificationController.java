package com.spring.controller;

import com.spring.model.Specification;
import com.spring.service.SpecificationService;
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
@RequestMapping("/protected/specification")
@Transactional
public class SpecificationController {

    @Autowired
    private SpecificationService specificationService;
   

    @PostMapping(value="/add")
    @ResponseBody
    public CommonResponse addSpecification(Specification specification) {
       

        int num=specificationService.addSpecification(specification);
        return ResponseUtil.success(num);
    }

    @PutMapping(value="/update")
    @ResponseBody
    public CommonResponse updateSpecification(Specification specification){

        int num= specificationService.update(specification);
        return ResponseUtil.success(num);
    }

    @DeleteMapping(value="/delete")
    @ResponseBody
    public CommonResponse deleteSpecification( int id){
        int num= specificationService.deleteByName(id);
        return ResponseUtil.success(num);
    }

    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName( int id){


        Specification specification= specificationService.findByName(id);
        return  ResponseUtil.success(specification);
    }

}

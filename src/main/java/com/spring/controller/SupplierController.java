package com.spring.controller;

import com.spring.model.Supplier;
import com.spring.service.SupplierService;
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
@RequestMapping("/protected/supplier")
@Transactional
public class SupplierController {

    @Autowired
    private SupplierService supplierService;
   

    @PostMapping(value="/add")
    @ResponseBody
    public CommonResponse addSupplier(Supplier supplier){

        int num=supplierService.addSupplier(supplier);
        return ResponseUtil.success(num);
    }

    @PutMapping(value="/update")
    @ResponseBody
    public CommonResponse updateSupplier( Supplier supplier ){

        int num=supplierService.update(supplier);
        return  ResponseUtil.success(num);
    }

    @DeleteMapping(value="/delete")
    @ResponseBody
    public CommonResponse deleteSupplier(String code){

        int num= supplierService.deleteById(code);
        return  ResponseUtil.success(num);
    }

    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName( String code)
    {
        Supplier supplier= supplierService.findById(code);
        return ResponseUtil.success(supplier);
    }

}

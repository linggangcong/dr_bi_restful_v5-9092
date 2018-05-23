package com.spring.controller;

import com.spring.model.Client_brand_rel;
import com.spring.service.Client_brand_relService;
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
@RequestMapping("/protected/client_brand_rel")
@Transactional
public class Client_brand_relController {

    @Autowired
    private Client_brand_relService client_brand_relService;
    @PostMapping(value="/add")
    @ResponseBody
    public  CommonResponse addClient_brand_rel( Client_brand_rel client_brand_rel){
        int num=client_brand_relService.addClient_brand_rel(client_brand_rel);
        return ResponseUtil.success(num);
    }

    @PutMapping(value="/update")
        @ResponseBody
        public CommonResponse updateClient_brand_rel(Client_brand_rel client_brand_rel){
        int num= client_brand_relService.update(client_brand_rel);
        return ResponseUtil.success(num);
    }

    @DeleteMapping(value="/delete")
    @ResponseBody
    public CommonResponse deleteClient_brand_rel( @Param("clientId")int clientId){
        int num= client_brand_relService.deleteByName(clientId);
        return ResponseUtil.success(num);
    }

    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName(@Param("clientId") int clientId){
        Client_brand_rel client_brand_rel= client_brand_relService.findByName(clientId);
        return ResponseUtil.success(client_brand_rel);
    }
}

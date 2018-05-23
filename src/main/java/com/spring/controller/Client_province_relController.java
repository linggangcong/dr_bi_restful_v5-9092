package com.spring.controller;

import com.spring.model.Client_province_rel;
import com.spring.service.Client_province_relService;
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
@RequestMapping("/protected/client_province_rel")
@Transactional
public class Client_province_relController {
    @Autowired
    private Client_province_relService client_province_relService;
    @PostMapping(value="/add")
    @ResponseBody
    public CommonResponse addClient_province_rel(Client_province_rel client_province_rel){
        int num=client_province_relService.addClient_province_rel(client_province_rel);
        return ResponseUtil.success(num);
    }

    @PutMapping(value="/update")
    @ResponseBody
    public CommonResponse updateClient_province_rel(Client_province_rel client_province_rel){
        int num= client_province_relService.update(client_province_rel);
        return ResponseUtil.success(num);
    }

    @DeleteMapping(value="/delete")
    @ResponseBody
    public CommonResponse deleteClient_province_rel(int clientId){
        int num= client_province_relService.deleteByName(clientId);
        return ResponseUtil.success(num);
    }

    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName( int clientId){
        Client_province_rel client_province_rel= client_province_relService.findByName(clientId);
        return ResponseUtil.success(client_province_rel);
    }

}

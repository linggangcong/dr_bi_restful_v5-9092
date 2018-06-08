package com.spring.controller;

import com.spring.model.Client_banner_rel;
import com.spring.service.Client_banner_relService;
import com.spring.util.CommonResponse;
import com.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by SAM on 2017/10/9.
 */
@Controller
@RequestMapping("/protected/client_banner_rel")
@Transactional
public class Client_banner_relController {

    @Autowired
    private Client_banner_relService client_banner_relService;
    @PostMapping(value="/add")
    @ResponseBody
    public  CommonResponse addClient_banner_rel( Client_banner_rel client_banner_rel){
        int num=client_banner_relService.addClient_banner_rel(client_banner_rel);
        return ResponseUtil.success(num);
    }

    @PutMapping(value="/update")
        @ResponseBody
        public CommonResponse updateClient_banner_rel(Client_banner_rel client_banner_rel){
        int num= client_banner_relService.update(client_banner_rel);
        return ResponseUtil.success(num);
    }

    /*@DeleteMapping(value="/delete")
    @ResponseBody
    public CommonResponse deleteClient_banner_rel( @Param("clientId")int clientId){
        int num= client_banner_relService.deleteByName(clientId);
        return ResponseUtil.success(num);
    }

    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName(@Param("clientId") int clientId){
        Client_banner_rel client_banner_rel= client_banner_relService.findByName(clientId);
        return ResponseUtil.success(client_banner_rel);
    }*/
}

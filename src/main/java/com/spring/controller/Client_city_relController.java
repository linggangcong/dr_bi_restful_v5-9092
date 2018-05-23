package com.spring.controller;

import com.spring.model.Client_city_rel;
import com.spring.service.Client_city_relService;
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
@RequestMapping("/protected/client_city_rel")
@Transactional
public class Client_city_relController {
    @Autowired   //在字段上,或写在setter方法上。 按类型。
    private Client_city_relService client_city_relService;
    @PostMapping (value="/add")
    @ResponseBody
    public  CommonResponse addClient_city_rel( Client_city_rel client_city_rel){
        int num=client_city_relService.addClient_city_rel(client_city_rel);
        return ResponseUtil.success(num);
    }

    @PutMapping(value="/update")
    @ResponseBody
    public CommonResponse updateClient_city_rel(Client_city_rel client_city_rel){
       int num= client_city_relService.update(client_city_rel);
       return ResponseUtil.success(num);
    }

    @DeleteMapping(value="/delete")
    @ResponseBody
    public CommonResponse deleteClient_city_rel(@Param("clientId")int clientId){
        int num= client_city_relService.deleteByName(clientId);
        return ResponseUtil.success(num);
    }

    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName(@Param("clientId") int clientId){
        Client_city_rel client_city_rel= client_city_relService.findByName(clientId);
        return ResponseUtil.success(client_city_rel);
    }

}

package com.spring.controller;

import com.spring.model.Client_category_rel;
import com.spring.service.Client_category_relService;
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
@RequestMapping("/protected/client_category_rel")
@Transactional
public class Client_category_relController {
    @Autowired
    private Client_category_relService client_category_relService;
    @PostMapping(value="/add")
    @ResponseBody
    public  CommonResponse addClient_category_rel(Client_category_rel client_category_rel){
        int num=client_category_relService.addClient_category_rel(client_category_rel);
        return ResponseUtil.success(num);

    }

    @PutMapping(value="/update")
    @ResponseBody
    public CommonResponse updateClient_category_rel(Client_category_rel client_category_rel){
        int num= client_category_relService.update(client_category_rel);
        return ResponseUtil.success(num);
    }

    @DeleteMapping(value="/delete")
    @ResponseBody
    public CommonResponse deleteClient_category_rel( int clientId){
        int num= client_category_relService.deleteByName(clientId);
        return ResponseUtil.success(num);
    }

    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName(int clientId){
        List<Client_category_rel> list= client_category_relService.findByName(clientId);
        return ResponseUtil.success(list);
    }
}

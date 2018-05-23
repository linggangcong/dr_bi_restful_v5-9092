package com.spring.controller;

import com.spring.model.Client;
import com.spring.service.ClientService;
import com.spring.util.CommonResponse;
import com.spring.util.ResponseUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by SAM on 2017/10/9.
 */
@Controller
@RequestMapping("/protected/client")
@Transactional
public class ClientController {
    @Resource
    private ClientService clientService;
/*
    @PostMapping(value="/add")
    @ResponseBody
    public CommonResponse addClient(String id,String idy ,String bannerCode,String name,  //,String email_address,String gender,String headshot,
                                    String companyName,String pwd,String startDate,String endDate,  //,String phoneNum,String role,String industry
                                    String data_date_start,String data_date_end){
        int num=clientService.addClient(id,idy,  bannerCode, name,   //,email_address,gender, headshot
                companyName, pwd, startDate,endDate,    //, phoneNum, role,industry
                data_date_start,data_date_end);
        return ResponseUtil.success(num);
    }*/

    /*@PostMapping(value="/add")
    @ResponseBody
    public CommonResponse addClient(String id,String idy){
        Map paramMap=new HashMap();
        paramMap.put("client_id",id );paramMap.put("idy",idy );
        int num=clientService.addClient(paramMap);
        return ResponseUtil.success(num);
    }*/

    /*@PostMapping(value="/add")
    @ResponseBody
    public CommonResponse addClient(String id,String idy){
        *//*Map paramMap=new HashMap();
        paramMap.put("client_id",id );paramMap.put("idy",idy );*//*
        int num=clientService.addClient(id,idy);
        return ResponseUtil.success(num);
    }*/

    @PostMapping(value="/add")
    @ResponseBody
    public CommonResponse addClient(Client client){
        int num=clientService.add(client);
        return ResponseUtil.success(num);
    }

    @PutMapping(value="/update")
    @ResponseBody
    public CommonResponse updateClient( Client client){
        int num=clientService.update(client);
        return ResponseUtil.success(num);
    }

    @DeleteMapping(value="/delete")
    @ResponseBody
    public CommonResponse deleteClient( @Param("id")String id){
        int num= clientService.deleteByName(id);
        return ResponseUtil.success(num);
    }


    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName(@Param("name") String name){
        List<Client> list= clientService.findByName(name);
        return ResponseUtil.success(list);
    }

    @GetMapping(value="/find_by_id")
    @ResponseBody
    public CommonResponse findByClientId(@Param("id") String id){
        Client client= clientService.findById(id);
        return ResponseUtil.success(client);
    }
    @GetMapping(value="/indistinctClient")
    @ResponseBody
    public CommonResponse findByNameAndCorp(@Param("clientName") String clientName, @Param("companyName") String companyName){
        List<Client> listClient= clientService.indistinctClient(clientName,companyName);
        return ResponseUtil.success(listClient);
    }
    //查询用户id。
    @GetMapping(value="/find_id")
    @ResponseBody
    public CommonResponse findId(String name,String password){
        String id= clientService.findId(name,password);
        return ResponseUtil.success(id);
    }
    //验证时间有效性。
    @GetMapping(value="/is_date_useful")
    @ResponseBody
    public CommonResponse isDateUseful(String name,String password){
        boolean isUseful= clientService.isDateUseful(name,password);
        return ResponseUtil.success(isUseful);
    }

    //查询用户id和identity。
    @GetMapping(value="/find_id_identity")
    @ResponseBody
    public CommonResponse findIdAndIdentity(String name,String password){
        Map<String,String> idAndIdentity= clientService.findIdAndIdentity(name,password);
        return ResponseUtil.success(idAndIdentity);
    }
    /*//查询用户id和banner_code。
    @GetMapping(value="/find_id_banner")
    @ResponseBody
    public CommonResponse findIdBanner(String name,String password){

        Map<String,String> idBannerMap= clientService.findIdBanner(name,password);
        return ResponseUtil.success(idBannerMap);
    }*/

    //查询用户id和banner_code,identity datadate。
    @GetMapping(value="/find_id_banner")
    @ResponseBody
    public CommonResponse findIdBannerIdentity(String name,String password){
        Client  idBannerMap= clientService.findIdBannerIdentity(name,password);
        return ResponseUtil.success(idBannerMap);
    }
}

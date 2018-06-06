package com.spring.controller;

import com.spring.model.Client;
import com.spring.model.ClientE;
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


    @PostMapping(value="/add1")
    @ResponseBody
    public CommonResponse addClient1(ClientE clientE ){
        String[] bannerCodeList =clientE.getBannerCodeList();




        int num=clientService.add(clientE.getClient());
        return ResponseUtil.success(num);
    }

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
    @GetMapping(value="/find_all")
    @ResponseBody
    public CommonResponse findAll(){
        List<Client> list= clientService.findAll();
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

    //查询用户id和identity。  没用
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
        //String[] bannerCodeArr= idBannerMap.getBannerCode().split(":");
        return ResponseUtil.success(idBannerMap);
    }
    /*@GetMapping(value="/find_banner")
    @ResponseBody
    public CommonResponse findIdBanner(String name,String password){
        Client  idBannerMap= clientService.findIdBannerIdentity(name,password);
        String[] bannerCodeArr= idBannerMap.getBannerCode().split(":");
        return ResponseUtil.success(bannerCodeArr);
    }*/


    @GetMapping(value="/get_data_end")
    @ResponseBody
    public CommonResponse getDataEnd(String name,String password){
        String[] dateStrList= clientService.getDate(name,password);
        return ResponseUtil.success(dateStrList);
    }
}

package com.spring.controller;

import com.spring.model.Client;
import com.spring.model.Client_banner_rel;
import com.spring.service.ClientService;
import com.spring.service.Client_banner_relService;
import com.spring.util.CommonResponse;
import com.spring.util.ResponseUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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
    @Resource
    private Client_banner_relService client_banner_relService;



    @PostMapping(value="/add")
    @ResponseBody
    public CommonResponse addClient(HttpServletRequest request){

        String bannerCode =request.getParameter("bannerCodeList");     //传入的客户对应的全部零售商
        String[] bannerCodeList=bannerCode.split(",");

        Client_banner_rel client_banner_rel=new Client_banner_rel();
        Client client=new Client();           //包含加密的过程。
        //client.setPassword(Md5Util.parseStrToMd5L32(request.getParameter("password")));
        client.setPassword(request.getParameter("password"));
        client.setName(request.getParameter("name"));
        client.setPhoneNum(request.getParameter("phoneNum"));
        client.setCompanyName(request.getParameter("companyName"));
        client.setIdy(request.getParameter("idy"));
        client.setIndustry(request.getParameter("industry"));
        client.setBannerCode(request.getParameter("bannerCode"));
        client.setPublishType(request.getParameter("publishType"));
        client.setDayOfWeek(request.getParameter("dayOfWeek"));
        client.setDayOfMonth(request.getParameter("dayOfMonth"));
        client.setStartDataDate(request.getParameter("startDataDate"));
        client.setEndDate(request.getParameter("endDate"));

        client_banner_rel.setClientName(client.getName());
        //client_banner_rel.setClientId();     //client表，通过name找id.
        for (String i : bannerCodeList) {
            client_banner_rel.setBannerCode(i);
            client_banner_relService.addClient_banner_rel(client_banner_rel);   //插入Client_banner_rel多行，对应一个客户。
        }
        int num=clientService.add(client);
        return ResponseUtil.success(num);
    }

    @PostMapping(value="/update")
    @ResponseBody
    public CommonResponse updateClient(HttpServletRequest request){

        String bannerCode =request.getParameter("bannerCodeList");     //传入的客户对应的全部零售商
        String[] bannerCodeList=bannerCode.split(",");

        Client_banner_rel client_banner_rel=new Client_banner_rel();
        Client client=new Client();           //包含加密的过程。
        //client.setPassword(Md5Util.parseStrToMd5L32(request.getParameter("password")));
        client.setPassword(request.getParameter("password"));
        client.setName(request.getParameter("name"));
        client.setPhoneNum(request.getParameter("phoneNum"));
        client.setCompanyName(request.getParameter("companyName"));
        client.setIdy(request.getParameter("idy"));
        client.setIndustry(request.getParameter("industry"));
        client.setBannerCode(request.getParameter("bannerCode"));
        client.setPublishType(request.getParameter("publishType"));
        client.setDayOfWeek(request.getParameter("dayOfWeek"));
        client.setDayOfMonth(request.getParameter("dayOfMonth"));
        client.setStartDataDate(request.getParameter("startDataDate"));
        client.setEndDate(request.getParameter("endDate"));

        client_banner_relService.deleteByName(client.getName());   //先删除该用户所有关联
        client_banner_rel.setClientName(client.getName());
        //client_banner_rel.setClientId();     //client表，通过name找id.
        for (String i : bannerCodeList) {
            client_banner_rel.setBannerCode(i);
            client_banner_relService.addClient_banner_rel(client_banner_rel);   //插入Client_banner_rel多行，对应一个客户。
        }
        int num=clientService.update(client);
        return ResponseUtil.success(num);
    }


    /* @PostMapping(value="/add")
    @ResponseBody
    public CommonResponse addClient(@RequestBody  ClientPO clientE ){
        List<String> bannerCodeList =clientE.getBannerCodeList();     //传入的客户对应的全部零售商
        Client_banner_rel client_banner_rel=new Client_banner_rel();
        Client client=clientE.getClient();            //包含加密的过程。

        client_banner_rel.setClientName(client.getName());
        //client_banner_rel.setClientId();     //client表，通过name找id.
        for (String i : bannerCodeList) {
            client_banner_rel.setBannerCode(i);
            client_banner_relService.addClient_banner_rel(client_banner_rel);  //插入Client_banner_rel多行，对应一个客户。
        }
        int num=clientService.add(client);
        return ResponseUtil.success(num);
    }

    @PutMapping(value="/update")
    @ResponseBody
    public CommonResponse updateClient( ClientPO clientE){
        //String[] bannerCodeList =clientE.getBannerCodeList();     //传入的客户对应的全部零售商
        List<String> bannerCodeList =clientE.getBannerCodeList();     //传入的客户对应的全部零售商
        Client client=clientE.getClient();

        //client_banner_rel.setClientName(client.getName());
        client_banner_relService.deleteByName(client.getName());   //先删除该用户所有关联
        for (String i : bannerCodeList) {
            Client_banner_rel client_banner_rel=new Client_banner_rel( );   //client.getC(),client.getName(),i
            client_banner_rel.setClientName(client.getName());
            client_banner_rel.setBannerCode(i);
            client_banner_relService.addClient_banner_rel(client_banner_rel);  //再插入多行，对应一个客户。
        }
        int num=clientService.update(client);
        return ResponseUtil.success(num);
    }*/


   /* @PostMapping(value="/add")
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
    }*/

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
    @GetMapping(value="/data_status")
    @ResponseBody
    public CommonResponse getDataStatus(String clientName){
        List<Map<String,String>> clientStatus= clientService.findDataStatusByName(clientName);
        return ResponseUtil.success(clientStatus);
    }
}

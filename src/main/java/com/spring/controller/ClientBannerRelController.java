package com.spring.controller;

import com.spring.service.ClientBannerRelService;
import com.spring.util.CommonResponse;
import com.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by SAM on 2017/10/9.
 */
@Controller
@RequestMapping("/protected/client_banner_rel")
@Transactional
public class ClientBannerRelController {
    @Autowired
    private ClientBannerRelService clientBannerRelService;

    /*@PostMapping(value="/add")
    @ResponseBody
    public  CommonResponse addClientBannerRel(ClientBannerRel city){
        Integer num = 0;
        num = cityService.addClientBannerRel(city);
        return ResponseUtil.success(num);
    }

    @PutMapping("/update")
    @ResponseBody
    public CommonResponse updateClientBannerRel(HttpServletRequest request,ClientBannerRel city) {

        Integer num = 0;
        num = cityService.update(city);
        return ResponseUtil.success(num);
    }
     @DeleteMapping("/delete")
    @ResponseBody
    public CommonResponse deleteClientBannerRel(HttpServletRequest request,String city_name) {
        String category_id = request.getParameter("city_name").toString();
        Integer num = 0;
        num = cityService.deleteByName(city_name);
        return ResponseUtil.success(num);
    }*/

    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findBannerByName(String name){

        List<Map<String ,String>>  bannerList= clientBannerRelService.findBannerByClientName(name);
        return ResponseUtil.success(bannerList);
    }


}

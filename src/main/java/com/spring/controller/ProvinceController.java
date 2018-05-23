package com.spring.controller;

import com.spring.model.Province;
import com.spring.service.ProvinceService;
import com.spring.util.CommonResponse;
import com.spring.util.ResponseUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by SAM on 2017/10/9.
 */
@Controller
@RequestMapping("protected/province")
//加上这个注解，使得支持事务
@Transactional
public class ProvinceController {

    @Autowired
    private ProvinceService provinceService;
   

    @PostMapping(value="/add")
    @ResponseBody
    public CommonResponse addProvince(@RequestParam("provinceId") int provinceId,@RequestParam("countryId") int countryId,
                                      @RequestParam("districtCode")String districtCode , @RequestParam("provinceCode")String provinceCode,
                                      @RequestParam("provinceName")String provinceName){
        
        Province province=new Province();

        province.setCountryId(provinceId);
        province.setProvinceId(countryId);
        province.setProvinceDistrictCode(districtCode);
        province.setProvince(provinceCode);
        province.setProvinceName(provinceName);
        int num=provinceService.addProvince(province);
        return ResponseUtil.success(num);

    }

    @PutMapping(value="/update")
    @ResponseBody
    public CommonResponse updateProvince( @RequestParam("countryId") int countryId, @RequestParam("districtCode")String districtCode ,
                                          @RequestParam("provinceCode")String provinceCode,@RequestParam("provinceName")String provinceName){

        Province province =new Province();
        province.setProvinceDistrictCode(districtCode);
        province.setProvince(provinceCode);
        province.setProvinceName(provinceName);
        int num=provinceService.update(province);
        return ResponseUtil.success(num);
    }

    @DeleteMapping(value="/delete")
    @ResponseBody
    public CommonResponse deleteProvince( @Param("name")String name){

        int num=provinceService.deleteByName(name);
        return ResponseUtil.success(num);
    }

    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName(@Param("name") String name){

        Province province= provinceService.findByName(name);
        return ResponseUtil.success(province);
    }

    @GetMapping(value="/all")
    @ResponseBody
    public CommonResponse findAll( ){
        List<Province> listPr= provinceService.allProvinces();
        return ResponseUtil.success(listPr);
    }

    @GetMapping(value="/all_names")
    @ResponseBody
    public CommonResponse findAllNames( ){
        List<Map<String,String>> listPrName= provinceService.allProvincesName();
        return ResponseUtil.success(listPrName);
    }

    @GetMapping(value="/provincesOfClient")
    @ResponseBody
    public CommonResponse provincesOfClient(String clientName ){
        List<String> list= provinceService.provincesOfClient(clientName);
        return ResponseUtil.success(list);
    }


}

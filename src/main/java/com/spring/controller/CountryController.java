package com.spring.controller;

import com.spring.model.Country;
import com.spring.model.ProvincesOneCountry;
import com.spring.service.CountryService;
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
@RequestMapping("/protected/country")
//加上这个注解，使得支持事务
@Transactional
public class CountryController {

    @Autowired
    private CountryService countryService;

    @PostMapping(value="/add" )
    @ResponseBody
    public CommonResponse addCountry(Country country){

        int num=countryService.addCountry(country);
        return ResponseUtil.success(num);
    }

    @PutMapping(value="/update")
    @ResponseBody
    public CommonResponse updateCountry(Country country){
         int num=countryService.update(country);
        return ResponseUtil.success(num);
    }

    @DeleteMapping(value="/delete" )
    @ResponseBody
    public CommonResponse deleteCountry( String countryName){
        int num=countryService.deleteByName(countryName);
        return ResponseUtil.success(num);
    }

    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName(String countryName){
        Country country= countryService.findByName(countryName);
        return ResponseUtil.success(country);
    }

    @GetMapping(value="/all")
    @ResponseBody
    public CommonResponse allCountry(){
        List<Country> allCountry = countryService.allCountry();
        return ResponseUtil.success(allCountry);
    }

    @GetMapping(value="/provinces_from_one")
    @ResponseBody
    public CommonResponse selectProvincesOneCountry(){
        ProvincesOneCountry provincesOneCountry = countryService.selectProvincesOneCountry();
        return ResponseUtil.success(provincesOneCountry);
    }
}

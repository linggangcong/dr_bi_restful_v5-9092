package com.spring.controller;

import com.spring.model.City;
import com.spring.service.CityService;
import com.spring.util.CommonResponse;
import com.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by SAM on 2017/10/9.
 */
@Controller
@RequestMapping("/protected/city")
@Transactional
public class CityController {
    @Autowired
    private CityService cityService;

    @PostMapping(value="/add")
    @ResponseBody
    public  CommonResponse addCity(City city){
        Integer num = 0;
        num = cityService.addCity(city);
        return ResponseUtil.success(num);
    }

    @PutMapping("/update")
    @ResponseBody
    public CommonResponse updateCity(HttpServletRequest request,City city) {

        Integer num = 0;
        num = cityService.update(city);
        return ResponseUtil.success(num);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public CommonResponse deleteCity(HttpServletRequest request,String city_name) {
        String category_id = request.getParameter("city_name").toString();
        Integer num = 0;
        num = cityService.deleteByName(city_name);
        return ResponseUtil.success(num);
    }

    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName(HttpServletRequest request ){
        String city_name = request.getParameter("city_name").toString();
        City city = cityService.findByName(city_name);
        if (city==null) {
            return ResponseUtil.exception("city_name不存在");
        }
        return ResponseUtil.success(city);
    }

    @GetMapping(value="/find_by_tier")
    @ResponseBody
    public CommonResponse findByTier( HttpServletRequest request ){
        String cityLevel = request.getParameter("cityLevel").toString();
        List<String> listName = cityService.findByTier(cityLevel);
        if (listName==null) {
            return ResponseUtil.exception("city_name不存在");
        }
        return ResponseUtil.success(listName);
    }

    @GetMapping(value="/citiesInProvince")
    @ResponseBody
    public CommonResponse citiesInProvince( HttpServletRequest request ){
        String provinceName = request.getParameter("province").toString();
        List<String> listName = cityService.citiesInProvince(provinceName);
        if (listName==null) {
            return ResponseUtil.exception("city_name不存在");
        }
        return ResponseUtil.success(listName);
    }
    @GetMapping(value="/citiesOfClient")
    @ResponseBody
    public CommonResponse citiesOfClient( HttpServletRequest request ){
        String clientName = request.getParameter("clientName").toString();
        List<String> listCity = cityService.citiesOfClient(clientName);
        return ResponseUtil.success(listCity);
    }
}

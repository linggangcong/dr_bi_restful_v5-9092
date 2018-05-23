package com.spring.controller;

import com.spring.model.District;
import com.spring.service.DistrictService;
import com.spring.util.CommonResponse;
import com.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by SAM on 2017/10/9.
 */
@Controller
@RequestMapping("/protected/district")
@Transactional
public class DistrictController {
    @Autowired
    private DistrictService districtService;

    @RequestMapping(value="/add")
    @ResponseBody
    public  CommonResponse addDistrict(District district){
        Integer num = 0;
        num = districtService.add(district);
        return ResponseUtil.success(num);
    }

    @RequestMapping("/update")
    @ResponseBody
    public CommonResponse updateDistrict(HttpServletRequest request,District district) {

        Integer num = 0;
        num = districtService.update(district);
        return ResponseUtil.success(num);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public CommonResponse deleteDistrict(HttpServletRequest request,String district_name) {
        String category_id = request.getParameter("district_name").toString();
        Integer num = 0;
        num = districtService.deleteByName(district_name);
        return ResponseUtil.success(num);
    }

    @RequestMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName(HttpServletRequest request ){
        String district_name = request.getParameter("district_name").toString();
        District district = districtService.findByName(district_name);
        if (district==null) {
            return ResponseUtil.exception("district_name不存在");
        }
        return ResponseUtil.success(district);
    }
}

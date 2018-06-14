package com.spring.controller;

import com.spring.model.Banner;
import com.spring.service.BannerService;
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
@RequestMapping("/protected/banner")
@Transactional
public class BannerController {
    @Autowired
    private BannerService bannerService;

    @PostMapping(value="/add")
    @ResponseBody
    public  CommonResponse addBanner(Banner banner){

            Integer num = bannerService.addBanner(banner);
        return ResponseUtil.success(num);
    }

    @PutMapping("/update")
    @ResponseBody
    public CommonResponse updateBanner(HttpServletRequest request,Banner banner) {

        Integer num= bannerService.updateBanner(banner);
        return ResponseUtil.success(num);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public CommonResponse deleteBanner(HttpServletRequest request,String banner_name) {
        String category_id = request.getParameter("banner_name").toString();
        Integer num = 0;
        num = bannerService.deleteBannerByName(banner_name);
        return ResponseUtil.success(num);
    }

    @GetMapping(value="/find_by_name")
    @ResponseBody
    public CommonResponse findByName(HttpServletRequest request ){
        String banner_name = request.getParameter("banner_name").toString();
        Banner banner = bannerService.findBannerByName(banner_name);
            if (banner==null) {
            return ResponseUtil.exception("banner_name不存在");
        }
        return ResponseUtil.success(banner);
    }
    @GetMapping(value="/find_all")
    @ResponseBody
    public CommonResponse findAll(){

        List<Banner> bannerList = bannerService.findAll();
        if (bannerList==null) {
            return ResponseUtil.exception("banner表无数据");
        }
        return ResponseUtil.success(bannerList);
    }

}

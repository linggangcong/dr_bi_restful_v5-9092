package com.spring.service.impl;

import com.spring.mapper.main.BannerMapper;
import com.spring.model.Banner;
import com.spring.service.BannerService;
import com.spring.util.ExceptionUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by SAM on 2017/10/13.
 */
@Service
public class BannerServiceImpl implements BannerService {
    @Resource
    BannerMapper bannerMapper;
    @Override
    public Integer addBanner(Banner banner) {
        Integer num = bannerMapper.insertBanner(banner);
        if(num==0){
            ExceptionUtil.dataNotExistException("要修改的元素不存在");
        }
        return num;
    }

    @Override
    public Integer updateBanner(Banner banner) {
        Integer num = bannerMapper.updateBanner(banner);
        if(num==0){
            ExceptionUtil.dataNotExistException("要修改的元素不存在");
        }
        return num;
    }

    @Override
    public Integer deleteBannerByName(String banner_name) {
        Integer num=bannerMapper.deleteBannerByName(banner_name);
        if(num==0){
            ExceptionUtil.dataNotExistException("要删除的元素不存在");
        }
        return num;
    }

    @Override
    public Banner findBannerByName(String banner_name) {
        return bannerMapper.getBannerByName(banner_name);
    }

    @Override
    public List<Banner> findAll() {
        return bannerMapper.findAll();
    }
}

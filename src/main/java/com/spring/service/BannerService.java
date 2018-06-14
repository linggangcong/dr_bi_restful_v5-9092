package com.spring.service;

import com.spring.model.Banner;

import java.util.List;

/**
 * Created by SAM on 2017/10/13.
 */

public interface BannerService {
    Integer addBanner(Banner banner);

    Integer updateBanner(Banner banner);

    Banner findBannerByName(String banner_name);

    Integer deleteBannerByName(String banner_name);
    List<Banner> findAll();
}

package com.spring.mapper.main;

import com.spring.model.Banner;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface BannerMapper {

    Integer insertBanner(Banner banner);

    Integer updateBanner( Banner banner);

    Integer deleteBannerByName(@Param("name") String banner_name);

    Banner getBannerByName(@Param("name")String banner_name);


}

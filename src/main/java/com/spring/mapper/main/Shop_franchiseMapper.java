package com.spring.mapper.main;

import com.spring.model.Shop_franchise;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by SAM on 2017/10/10.
 */
@Component
@Mapper
public interface Shop_franchiseMapper {

    Integer updateShop_franchise(Shop_franchise shop_franchise);

    Integer addShop_franchise(Shop_franchise shop_franchise);

    Integer deleteShop_franchiseByName(int franchiseId);

    Shop_franchise findShop_franchiseByName(int franchiseId);

}


















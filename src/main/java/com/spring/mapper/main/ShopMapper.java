package com.spring.mapper.main;

import com.spring.model.Shop;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by SAM on 2017/10/10.
 */
@Component
@Mapper
public interface ShopMapper {

    Integer updateShop(Shop shop);

    Integer addShop(Shop shop);

    Integer deleteShopByName(String shopName);

    Shop findShopByName(String shopName);

}


















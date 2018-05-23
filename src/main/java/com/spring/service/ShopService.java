package com.spring.service;

import com.spring.model.Shop;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by SAM on 2017/10/9.
 */
@Mapper
public interface ShopService {

   Integer  addShop(Shop shop);

   Integer update(Shop shop);

   Integer deleteByName(String shopName);

   Shop findByName(String shopName);

}

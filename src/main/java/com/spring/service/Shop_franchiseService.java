package com.spring.service;

import com.spring.model.Shop_franchise;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by SAM on 2017/10/9.
 */
@Mapper
public interface Shop_franchiseService {

   Integer  addShop_franchise(Shop_franchise shop_franchise);

   Integer update(Shop_franchise shop_franchise);

   Integer deleteByName(int franchiseId);

   Shop_franchise findByName(int franchiseId);


}

package com.spring.service;

import com.spring.model.Shop_type;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by SAM on 2017/10/9.
 */
@Mapper
public interface Shop_typeService {

   Integer  addShop_type(Shop_type shop_type);

   Integer update(Shop_type shop_type);

   Integer deleteByName(int typeId);

   Shop_type findByName(int typeId);


}

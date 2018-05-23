package com.spring.mapper.main;

import com.spring.model.Shop_type;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by SAM on 2017/10/10.
 */
@Component
@Mapper
public interface Shop_typeMapper {

    Integer updateShop_type(Shop_type shop_type);

    Integer addShop_type(Shop_type shop_type);

    Integer deleteShop_typeByName(int typeId);

    Shop_type findShop_typeByName(int typeId);

}


















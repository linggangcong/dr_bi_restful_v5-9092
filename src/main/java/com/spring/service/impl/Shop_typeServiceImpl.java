package com.spring.service.impl;

import com.spring.mapper.main.Shop_typeMapper;
import com.spring.model.Shop_type;
import com.spring.service.Shop_typeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SAM on 2017/10/10.
 */
@Service
public class Shop_typeServiceImpl implements Shop_typeService {
    @Autowired
    Shop_typeMapper shop_typeMapper;
    @Override
    public Integer  addShop_type(Shop_type shop_type){
        return shop_typeMapper.addShop_type(shop_type);

    }

    @Override
    public Integer update(Shop_type shop_type){
        return shop_typeMapper.updateShop_type(shop_type);
    }

    @Override
    public Integer deleteByName(int typeId)    {
        return shop_typeMapper.deleteShop_typeByName(typeId);
    }

    @Override
    public Shop_type findByName(int typeId) {
        return shop_typeMapper.findShop_typeByName(typeId);
    }
}

package com.spring.service.impl;

import com.spring.mapper.main.Shop_franchiseMapper;
import com.spring.model.Shop_franchise;
import com.spring.service.Shop_franchiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SAM on 2017/10/10.
 */
@Service
public class Shop_franchiseServiceImpl implements Shop_franchiseService {
    @Autowired
    Shop_franchiseMapper shop_franchiseMapper;
    @Override
    public Integer  addShop_franchise(Shop_franchise shop_franchise){
        return shop_franchiseMapper.addShop_franchise(shop_franchise);

    }

    @Override
    public Integer update(Shop_franchise shop_franchise){
        return shop_franchiseMapper.updateShop_franchise(shop_franchise);
    }

    @Override
    public Integer deleteByName(int franchiseId)    {
        return shop_franchiseMapper.deleteShop_franchiseByName(franchiseId);
    }

    @Override
    public Shop_franchise findByName(int franchiseId) {
        return shop_franchiseMapper.findShop_franchiseByName(franchiseId);
    }
}

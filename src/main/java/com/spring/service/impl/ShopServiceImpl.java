package com.spring.service.impl;

import com.spring.mapper.main.ShopMapper;
import com.spring.model.Shop;
import com.spring.service.ShopService;
import com.spring.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SAM on 2017/10/10.
 */
@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    ShopMapper shopMapper;
    @Override
    public Integer  addShop(Shop shop){
        return shopMapper.addShop(shop);
    }

    @Override
    public Integer update(Shop shop){
        return shopMapper.updateShop(shop);
    }

    @Override
    public Integer deleteByName(String shopName)    {
        int num= shopMapper.deleteShopByName(shopName);
        return num;
    }

    @Override
    public Shop findByName(String shopName) {
        return shopMapper.findShopByName(shopName);
    }
}

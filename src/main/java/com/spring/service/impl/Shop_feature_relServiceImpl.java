package com.spring.service.impl;

import com.spring.mapper.main.Shop_feature_relMapper;
import com.spring.model.Shop_feature_rel;
import com.spring.service.Shop_feature_relService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SAM on 2017/10/10.
 */
@Service
public class Shop_feature_relServiceImpl implements Shop_feature_relService {
    @Autowired
    Shop_feature_relMapper shop_feature_relMapper;
    @Override
    public Integer  addShop_feature_rel(Shop_feature_rel shop_feature_rel){
        return shop_feature_relMapper.addShop_feature_rel(shop_feature_rel);

    }

    @Override
    public Integer update(Shop_feature_rel shop_feature_rel){
        return shop_feature_relMapper.updateShop_feature_rel(shop_feature_rel);
    }

    @Override
    public Integer deleteByName(int shopId)    {
        return shop_feature_relMapper.deleteShop_feature_relByName(shopId);
    }

    @Override
    public Shop_feature_rel findByName(int shopId) {
        return shop_feature_relMapper.findShop_feature_relByName(shopId);
    }
}

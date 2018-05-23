package com.spring.service.impl;

import com.spring.mapper.main.ShopNewMapper;
import com.spring.model.ShopNew;
import com.spring.service.ShopNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SAM on 2017/10/10.
 */
@Service
public class ShopNewServiceImpl implements ShopNewService {
    @Autowired
    ShopNewMapper shopNewMapper;

    @Override
    public Integer addShopNew(ShopNew shopNew) {
        return shopNewMapper.addShopNew(shopNew);
    }

    @Override
    public Integer update(ShopNew shopNew) {
        return shopNewMapper.updateShopNew(shopNew);
    }

    @Override
    public Integer deleteById(String shopId) {
        int num= shopNewMapper.deleteShopNewById(shopId);
        return num;
    }

    @Override
    public List<ShopNew> findByLocation(String countryId, String provinceId, String cityId, String districtId) {
        return shopNewMapper.findShopNewByLocation( countryId, provinceId,  cityId,  districtId);
    }


}

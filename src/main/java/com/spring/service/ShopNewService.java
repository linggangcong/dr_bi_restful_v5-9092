package com.spring.service;

import com.spring.model.ShopNew;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by SAM on 2017/10/9.
 */
@Mapper
public interface ShopNewService {

   Integer  addShopNew(ShopNew shopNew);

   Integer update(ShopNew shopNew);

   Integer deleteById(String shopId);

   List<ShopNew> findByLocation(String countryId, String provinceId, String cityId, String districtId);

}

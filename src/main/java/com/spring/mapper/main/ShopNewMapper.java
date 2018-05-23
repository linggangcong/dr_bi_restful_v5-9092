package com.spring.mapper.main;

import com.spring.model.ShopNew;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by SAM on 2017/10/10.
 */
@Component
@Mapper
public interface ShopNewMapper {

    Integer addShopNew(ShopNew shopNew);

    Integer updateShopNew(ShopNew shopNew);

    Integer deleteShopNewById(String shopId);

    List<ShopNew> findShopNewByLocation(String countryId, String provinceId, String cityId, String districtId);

}


















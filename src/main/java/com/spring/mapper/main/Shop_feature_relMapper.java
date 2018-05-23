package com.spring.mapper.main;

import com.spring.model.Shop_feature_rel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by SAM on 2017/10/10.
 */
@Component
@Mapper
public interface Shop_feature_relMapper {

    Integer updateShop_feature_rel(Shop_feature_rel shop_feature_rel);

    Integer addShop_feature_rel(Shop_feature_rel shop_feature_rel);

    Integer deleteShop_feature_relByName(int shopId);

    Shop_feature_rel findShop_feature_relByName(int shopId);

}


















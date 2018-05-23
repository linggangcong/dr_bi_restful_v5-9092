package com.spring.service;

import com.spring.model.Shop_feature_rel;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by SAM on 2017/10/9.
 */
@Mapper
public interface Shop_feature_relService {

   Integer  addShop_feature_rel(Shop_feature_rel shop_feature_rel);

   Integer update(Shop_feature_rel shop_feature_rel);

   Integer deleteByName(int shopId);

   Shop_feature_rel findByName(int shopId);


}

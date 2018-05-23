package com.spring.service;

import com.spring.model.Feature_category_rel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by SAM on 2017/10/9.
 */
@Mapper
public interface Feature_category_relService {
   Integer  add(Feature_category_rel product_category_featuretype);

   Integer update(Feature_category_rel product_category_featuretype);

    //Feature_category_rel findByName(String product_category_featuretype_name);

   Integer deleteByName(String desc);

   List<Feature_category_rel> findByName(String desc);

   List<String> findFeaturetypeName(String categoryCode);

   List<String> findFeatureByCategory(String categoryDesc ,String featuretypeDesc);


}

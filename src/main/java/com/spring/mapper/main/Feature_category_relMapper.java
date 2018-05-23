package com.spring.mapper.main;

import com.spring.model.Feature_category_rel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by SAM on 2017/10/10.
 */
@Component
@Mapper
public interface Feature_category_relMapper {

    Integer updatefeature_category_rel(Feature_category_rel product_category_featuretype);

    Integer addfeature_category_rel(Feature_category_rel product_category_featuretype);


    Integer deletefeature_category_relByName(String name);

    List<Feature_category_rel> findfeature_category_relByName(String name);

    List<String> findFeaturetypeByCategory(String categoryCode);

    List<String> findFeatureByCategory(@Param("categoryCode") String categoryDesc , @Param("featuretypeCode")String featuretypeDesc );

}


















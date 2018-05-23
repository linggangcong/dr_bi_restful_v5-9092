package com.spring.mapper.main;

import com.spring.model.Parent_brand;
import com.spring.model.Parent_brandTrimed;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by SAM on 2017/10/11.
 */
@Mapper
public interface Parent_brandMapper {

    Integer addParent_brand(Parent_brand parent_brand);

    Integer updateParent_brand( Parent_brand parent_brand);

    Integer deleteParent_brandByName( String name);

    Parent_brand findParent_brandByName( String name);


    List<Parent_brandTrimed> categoryToParentBrand(String code);

    List<Parent_brandTrimed> brandOfClient(String clientName);


}



































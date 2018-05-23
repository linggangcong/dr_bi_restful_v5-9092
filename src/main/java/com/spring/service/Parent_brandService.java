package com.spring.service;

import com.spring.model.Parent_brand;
import com.spring.model.Parent_brandTrimed;

import java.util.List;

/**
 * Created by SAM on 2017/10/13.
 */

public interface Parent_brandService {

    Integer add(Parent_brand parent_brand);

    Integer update(Parent_brand parent_brand);

    Integer deleteByName(String name);

    Parent_brand findByName(String name);

    List<Parent_brandTrimed> categoryToParentBrand(String categoryCode);

    List<Parent_brandTrimed> brandOfClient(String categoryCode);

}

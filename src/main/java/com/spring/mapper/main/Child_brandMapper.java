package com.spring.mapper.main;

import com.spring.model.Child_brand;

public interface Child_brandMapper {

    Integer insertChild_brand( Child_brand childBrand);

    Integer updateChild_brandByName( Child_brand childBrand);

    Integer deleteChild_brandByName( String child_brand_name);

    Child_brand getChild_brand( String child_brand_name);

}

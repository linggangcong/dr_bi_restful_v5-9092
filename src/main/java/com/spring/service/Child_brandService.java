package com.spring.service;

import com.spring.model.Child_brand;
import com.spring.model.City;

/**
 * Created by SAM on 2017/10/13.
 */

public interface Child_brandService {

    Integer add(Child_brand child_brand);

    Integer update(Child_brand child_brand);

    Integer deleteByName(String name);

    Child_brand findByName(String name);

}

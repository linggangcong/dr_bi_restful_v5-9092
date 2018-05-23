package com.spring.service;

import com.spring.model.District;

/**
 * Created by SAM on 2017/10/13.
 */

public interface DistrictService {

    Integer add(District district);

    Integer update(District district);

    Integer deleteByName(String name);

    District findByName(String name);

}

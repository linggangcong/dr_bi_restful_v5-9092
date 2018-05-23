package com.spring.service;

import com.spring.model.City;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SAM on 2017/10/13.
 */
@Service
public interface CityService {

    Integer addCity(City city);

    Integer update(City city);

    Integer deleteByName(String name);

    City findByName(String name);

    List<String> findByTier(String cityLevel);

    List<String> citiesInProvince(String name);

    List<String> citiesOfClient(String name);

}

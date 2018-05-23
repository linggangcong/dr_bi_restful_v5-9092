package com.spring.service.impl;

import com.spring.mapper.main.CountryMapper;
import com.spring.model.Country;
import com.spring.model.ProvincesOneCountry;
import com.spring.service.CountryService;
import com.spring.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SAM on 2017/10/10.
 */
@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    CountryMapper countryMapper;
    @Override
    public Integer  addCountry(Country country) {

        return countryMapper.addCountry(country);
    }
    @Override
    public Integer update(Country country){
        return countryMapper.updateCountry(country);
    }

    @Override
    public Integer deleteByName(String name) {
        return countryMapper.deleteCountryByName(name);
    }

    @Override
    public Country findByName(String countryName) {

        return countryMapper.findCountryByName(countryName);
    }

    @Override
    public List<Country> allCountry() {
        return countryMapper.selectAll();
    }

    @Override
    public ProvincesOneCountry selectProvincesOneCountry() {
        return countryMapper.selectProvincesOneCountry();
    }
}

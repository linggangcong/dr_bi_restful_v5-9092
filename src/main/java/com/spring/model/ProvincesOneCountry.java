package com.spring.model;

import java.util.List;

/**
 * Created by SAM on 2017/10/27.
 */
public class ProvincesOneCountry {
    private int countryId;
    private String  countryName;
    private List<Province> provinces;

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }



    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<Province> getProvinces() {
        return provinces;
    }

    public void setProvinces(List<Province> provinces) {
        this.provinces = provinces;
    }
}

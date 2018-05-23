package com.spring.model;

import java.util.List;

/**
 * Created by SAM on 2017/10/13.
 */
public class Province {
    private int provinceId;
    private int countryId;
    private String provinceDistrictCode;
    private String province;
    private String provinceName;
    private List<City> cities;

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getProvinceDistrictCode() {
        return provinceDistrictCode;
    }

    public void setProvinceDistrictCode(String provinceDistrictCode) {
        this.provinceDistrictCode = provinceDistrictCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}

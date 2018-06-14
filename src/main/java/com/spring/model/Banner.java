package com.spring.model;

/**
 * Created by SAM on 2017/10/12.
 */
public class Banner {
    private String banner_id;
    private String city_name;
    private String banner_code;
    private  String banner_name;
    //private  Date banner_open_day;
    //private  String banner_scale;
    private  String banner_type;
    private  String country_name;
    private  String province_name;

    public String getBanner_id() {
        return banner_id;
    }

    public void setBanner_id(String banner_id) {
        this.banner_id = banner_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getBanner_code() {
        return banner_code;
    }

    public void setBanner_code(String banner_code) {
        this.banner_code = banner_code;
    }

    public String getBanner_name() {
        return banner_name;
    }

    public void setBanner_name(String banner_name) {
        this.banner_name = banner_name;
    }

    public String getBanner_type() {
        return banner_type;
    }

    public void setBanner_type(String banner_type) {
        this.banner_type = banner_type;
    }


    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getProvince_name() {
        return province_name;
    }

    public void setProvince_name(String province_name) {
        this.province_name = province_name;
    }
}

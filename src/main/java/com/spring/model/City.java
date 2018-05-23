package com.spring.model;

/**
 * Created by SAM on 2017/10/11.
 */
public class City {

    private String city_id;
    private String city_code;
    private String province_id;
    private String province_code;
    private String city;
    private  String city_name;
    private  String city_level;


    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getCity_code() {
        return city_code;
    }

    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }

    public String getProvince_id() {
        return province_id;
    }

    public void setProvince_id(String province_id) {
        this.province_id = province_id;
    }

    public String getProvince_code() {
        return province_code;
    }

    public void setProvince_code(String province_code) {
        this.province_code = province_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getCity_level() {
        return city_level;
    }

    public void setCity_level(String city_level) {
        this.city_level = city_level;
    }
}

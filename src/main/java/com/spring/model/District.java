package com.spring.model;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by SAM on 2017/10/12.
 */
public class District {
    private int district_id;
    private int city_id;
    private String district_name;
    private int data_source;
    private Timestamp cre_date;
    private String cre_user;
    private Timestamp upd_date;
    private String upd_user;


    public int getData_source() {
        return data_source;
    }

    public void setData_source(int data_source) {
        this.data_source = data_source;
    }

    public Timestamp getCre_date() {
        return cre_date;
    }

    public void setCre_date(Timestamp cre_date) {
        this.cre_date = cre_date;
    }

    public Timestamp getUpd_date() {
        return upd_date;
    }

    public void setUpd_date(Timestamp upd_date) {
        this.upd_date = upd_date;
    }

    public String getCre_user() {
        return cre_user;
    }

    public void setCre_user(String cre_user) {
        this.cre_user = cre_user;
    }



    public String getUpd_user() {
        return upd_user;
    }

    public void setUpd_user(String upd_user) {
        this.upd_user = upd_user;
    }

    public int getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(int district_id) {
        this.district_id = district_id;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getDistrict_name() {
        return district_name;
    }

    public void setDistrict_name(String district_name) {
        this.district_name = district_name;
    }
}

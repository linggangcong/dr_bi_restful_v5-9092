package com.spring.model;

import java.sql.Timestamp;
import java.sql.Date;

/**
 * Created by SAM on 2017/10/12.
 */
public class Banner {
    private int banner_id;
    private String city_id;
    private String banner_code;
    private  String banner_name;
    private  Date banner_open_day;
    private  String banner_scale;
    private  String banner_type;
    private  String data_source;
    private  Timestamp cre_date;
    private  Timestamp upd_date;
    private  String upd_user;
    private  String cre_user;

    public int getBanner_id() {
        return banner_id;
    }

    public void setBanner_id(int banner_id) {
        this.banner_id = banner_id;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
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

    public Date getBanner_open_day() {
        return banner_open_day;
    }

    public void setBanner_open_day(Date banner_open_day) {
        this.banner_open_day = banner_open_day;
    }

    public String getBanner_scale() {
        return banner_scale;
    }

    public void setBanner_scale(String banner_scale) {
        this.banner_scale = banner_scale;
    }

    public String getBanner_type() {
        return banner_type;
    }

    public void setBanner_type(String banner_type) {
        this.banner_type = banner_type;
    }

    public String getData_source() {
        return data_source;
    }

    public void setData_source(String data_source) {
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

    public String getUpd_user() {
        return upd_user;
    }

    public void setUpd_user(String upd_user) {
        this.upd_user = upd_user;
    }

    public String getCre_user() {
        return cre_user;
    }

    public void setCre_user(String cre_user) {
        this.cre_user = cre_user;
    }
}

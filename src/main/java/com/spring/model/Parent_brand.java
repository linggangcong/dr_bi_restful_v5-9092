package com.spring.model;

import java.sql.Timestamp;

/**
 * Created by SAM on 2017/10/12.
 */
public class Parent_brand {
        private int parent_brand_id;
        private String parent_brand_code;
        private String parent_brand_name;
        private int data_source;
        private Timestamp cre_date;
        private String cre_user;
        private String upd_user;
        private Timestamp upd_date;

    public int getParent_brand_id() {
        return parent_brand_id;
    }

    public void setParent_brand_id(int parent_brand_id) {
        this.parent_brand_id = parent_brand_id;
    }

    public String getParent_brand_code() {
        return parent_brand_code;
    }

    public void setParent_brand_code(String parent_brand_code) {
        this.parent_brand_code = parent_brand_code;
    }

    public String getParent_brand_name() {
        return parent_brand_name;
    }

    public void setParent_brand_name(String parent_brand_name) {
        this.parent_brand_name = parent_brand_name;
    }

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

    public Timestamp getUpd_date() {
        return upd_date;
    }

    public void setUpd_date(Timestamp upd_date) {
        this.upd_date = upd_date;
    }
}

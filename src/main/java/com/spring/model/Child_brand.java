package com.spring.model;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by SAM on 2017/10/12.
 */
public class Child_brand {
    private  int    child_brand_id;
    private  String child_brand_code;
    private  String child_brand_name;
    private  int data_source;
    private Timestamp cre_date;
    private  String cre_user;
    private  String upd_user;
    private  Timestamp   upd_date;

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

    public int getChild_brand_id() {
        return child_brand_id;
    }

    public void setChild_brand_id(int child_brand_id) {
        this.child_brand_id = child_brand_id;
    }

    public String getChild_brand_code() {
        return child_brand_code;
    }

    public void setChild_brand_code(String child_brand_code) {
        this.child_brand_code = child_brand_code;
    }

    public String getChild_brand_name() {
        return child_brand_name;
    }

    public void setChild_brand_name(String child_brand_name) {
        this.child_brand_name = child_brand_name;
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


}

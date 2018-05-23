package com.spring.model;

import java.sql.Timestamp;

/**
 * Created by SAM on 2017/10/13.
 */
public class Supplier {
    private int id;
    private int cityId;
    private String code;
    private String name;
    private String address;
    private String geo;
    private int dataSource;
    private Timestamp creDate;
    private Timestamp updDate;
    private String creUser;
    private String updUser;

    public int getDataSource() {
        return dataSource;
    }

    public String getCreUser() {
        return creUser;
    }

    public String getUpdUser() {
        return updUser;
    }

    public Timestamp getCreDate() {
        return creDate;
    }

    public void setCreDate(Timestamp creDate) {
        this.creDate = creDate;
    }

    public Timestamp getUpdDate() {
        return updDate;
    }

    public void setUpdDate(Timestamp updDate) {
        this.updDate = updDate;
    }


    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDataSource(int dataSource) {
        this.dataSource = dataSource;
    }

    public void setCreUser(String creUser) {
        this.creUser = creUser;
    }

    public void setUpdUser(String updUser) {
        this.updUser = updUser;
    }
}

package com.spring.model;

/**
 * Created by SAM on 2017/10/13.
 */
public class Category {
    private String id;
    private String code;
    private  String desc;
    private  String descEn;
    private  String drCategory;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescEn() {
        return descEn;
    }

    public void setDescEn(String descEn) {
        this.descEn = descEn;
    }

    public String getDrCategory() {
        return drCategory;
    }

    public void setDrCategory(String drCategory) {
        this.drCategory = drCategory;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

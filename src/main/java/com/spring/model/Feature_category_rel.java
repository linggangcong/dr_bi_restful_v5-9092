package com.spring.model;

/**
 * Created by SAM on 2017/10/13.
 */
public class Feature_category_rel {
    private String categoryCode;
    private String categoryId;
    private String featureTypeCode;
    private String featureTypeDesc;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getFeatureTypeCode() {
        return featureTypeCode;
    }

    public void setFeatureTypeCode(String featureTypeCode) {
        this.featureTypeCode = featureTypeCode;
    }

    public String getFeatureTypeDesc() {
        return featureTypeDesc;
    }

    public void setFeatureTypeDesc(String featureTypeDesc) {
        this.featureTypeDesc = featureTypeDesc;
    }
}

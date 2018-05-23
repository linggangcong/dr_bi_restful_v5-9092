package com.spring.model;

/**
 * Created by SAM on 2017/10/13.
 */
public class Product_feature_type {
    private String featureTypeId;
    private String featureTypeCode;
    private String featureTypeDesc;
    private String featureTypeDescEn;

    public String getFeatureTypeId() {
        return featureTypeId;
    }

    public void setFeatureTypeId(String featureTypeId) {
        this.featureTypeId = featureTypeId;
    }

    public String getFeatureTypeDescEn() {
        return featureTypeDescEn;
    }

    public void setFeatureTypeDescEn(String featureTypeDescEn) {
        this.featureTypeDescEn = featureTypeDescEn;
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

package com.spring.model;

/**
 * Created by SAM on 2017/10/13.
 */
public class Product_feature_type_rel {
    private int productId;
    private String featureTypeCode;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getFeatureTypeCode() {
        return featureTypeCode;
    }

    public void setFeatureTypeCode(String featureTypeCode) {
        this.featureTypeCode = featureTypeCode;
    }
}

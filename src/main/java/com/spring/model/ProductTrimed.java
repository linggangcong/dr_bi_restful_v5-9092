package com.spring.model;


import java.sql.Timestamp;

/**
 * Created by SAM on 2017/10/9.
 */
public class ProductTrimed {
    private  int productId;

    private  String productName;


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


}

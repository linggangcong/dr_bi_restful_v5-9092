package com.spring.model;

/**
 * Created by SAM on 2017/10/19.
 */
public class Client_brand_rel {
    private int clientId;
    private int  brandId;


    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }
}

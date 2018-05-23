package com.spring.model;

/**
 * Created by SAM on 2017/10/19.
 */
public class Client_category_rel {
    private  String  clientId;
    private  String categoryCode;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }
}

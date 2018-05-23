package com.spring.model;

/**
 * Created by SAM on 2017/10/13.
 */
public class Client_province_rel {
    private int clientId;
    private String  provinceName;

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}

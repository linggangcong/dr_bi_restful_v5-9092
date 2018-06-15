package com.spring.model;

/**
 * Created by SAM on 2017/10/13.
 */
public class Client_city_rel {

    private int clientId;
    private int id;
    private String cityId;

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

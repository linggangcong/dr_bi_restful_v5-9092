package com.spring.model;

import java.util.Date;

/**
 * Created by SAM on 2017/10/13.
 */
public class Client_city_rel {
    private int clientId;
    private int cityId;

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}

package com.spring.model;

/**
 * Created by SAM on 2017/10/19.
 */
public class Client_banner_rel {
    private int Id;
    private int  clientId;
    private String  clientName;
    private String  bannerCode;
    private String  bannerDesc;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getBannerCode() {
        return bannerCode;
    }

    public void setBannerCode(String bannerCode) {
        this.bannerCode = bannerCode;
    }

    public String getBannerDesc() {
        return bannerDesc;
    }

    public void setBannerDesc(String bannerDesc) {
        this.bannerDesc = bannerDesc;
    }
}

package com.spring.model;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by SAM on 2017/10/13.
 */
public class Shop {
    private int shopId;
    private int bannerId;
    private int cityId;
    private  int shopFranchiseId;
    private String shopCode;
    private String shopNo;
    private String shopName;
    private String shopAddress;
    private String shopGeo;
    private String shopOpenday;
    private String newShop;
    private String distributionStatus;
    private int dataSource;
    private Timestamp creDate;
    private Timestamp updDate;
    private String updUser;
    private String creUser;

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public int getBannerId() {
        return bannerId;
    }

    public void setBannerId(int bannerId) {
        this.bannerId = bannerId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getShopFranchiseId() {
        return shopFranchiseId;
    }

    public void setShopFranchiseId(int shopFranchiseId) {
        this.shopFranchiseId = shopFranchiseId;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getShopGeo() {
        return shopGeo;
    }

    public void setShopGeo(String shopGeo) {
        this.shopGeo = shopGeo;
    }

    public String getShopOpenday() {
        return shopOpenday;
    }

    public void setShopOpenday(String shopOpenday) {
        this.shopOpenday = shopOpenday;
    }

    public String getNewShop() {
        return newShop;
    }

    public void setNewShop(String newShop) {
        this.newShop = newShop;
    }

    public String getDistributionStatus() {
        return distributionStatus;
    }

    public void setDistributionStatus(String distributionStatus) {
        this.distributionStatus = distributionStatus;
    }

    public int getDataSource() {
        return dataSource;
    }

    public void setDataSource(int dataSource) {
        this.dataSource = dataSource;
    }

    public Timestamp getCreDate() {
        return creDate;
    }

    public void setCreDate(Timestamp creDate) {
        this.creDate = creDate;
    }

    public Timestamp getUpdDate() {
        return updDate;
    }

    public void setUpdDate(Timestamp updDate) {
        this.updDate = updDate;
    }

    public String getUpdUser() {
        return updUser;
    }

    public void setUpdUser(String updUser) {
        this.updUser = updUser;
    }

    public String getCreUser() {
        return creUser;
    }

    public void setCreUser(String creUser) {
        this.creUser = creUser;
    }
}

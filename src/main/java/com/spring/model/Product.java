package com.spring.model;


import java.sql.Timestamp;

/**
 * Created by SAM on 2017/10/9.
 */
public class Product {
    private  int productId;
    private  int bannerId;
    private  int supplierId;
    private  int specificationId;
    private  int saleCountryId;
    private  int parentBrandId;
    private  int chilidBrandId;
    private  int gid;
    private  String deliveryCompany;
    private  String barCode;
    private  String productCode;
    private  String productName;
    private  String productDetailDesc;
    private  String productShortDesc;
    private  String manufacturer;
    private  String productOrigin;
    private  Double sellFrequency;
    private  Double retailPrice;
    private  Double purchasePrice;
    private  String wholesalePrice;
    private  String packSpecification;
    private  String deliveryUnit;
    private  String productStartTime;
    private  String productEndTime;
    private  int dataSource;
    private Timestamp creDate;
    private Timestamp updDate;
    private String updUser;
    private String creUser;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getBannerId() {
        return bannerId;
    }

    public void setBannerId(int bannerId) {
        this.bannerId = bannerId;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getSpecificationId() {
        return specificationId;
    }

    public void setSpecificationId(int specificationId) {
        this.specificationId = specificationId;
    }

    public int getSaleCountryId() {
        return saleCountryId;
    }

    public void setSaleCountryId(int saleCountryId) {
        this.saleCountryId = saleCountryId;
    }

    public int getParentBrandId() {
        return parentBrandId;
    }

    public void setParentBrandId(int parentBrandId) {
        this.parentBrandId = parentBrandId;
    }

    public int getChilidBrandId() {
        return chilidBrandId;
    }

    public void setChilidBrandId(int chilidBrandId) {
        this.chilidBrandId = chilidBrandId;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getDeliveryCompany() {
        return deliveryCompany;
    }

    public void setDeliveryCompany(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDetailDesc() {
        return productDetailDesc;
    }

    public void setProductDetailDesc(String productDetailDesc) {
        this.productDetailDesc = productDetailDesc;
    }

    public String getProductShortDesc() {
        return productShortDesc;
    }

    public void setProductShortDesc(String productShortDesc) {
        this.productShortDesc = productShortDesc;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProductOrigin() {
        return productOrigin;
    }

    public void setProductOrigin(String productOrigin) {
        this.productOrigin = productOrigin;
    }

    public Double getSellFrequency() {
        return sellFrequency;
    }

    public void setSellFrequency(Double sellFrequency) {
        this.sellFrequency = sellFrequency;
    }

    public Double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(String wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public String getPackSpecification() {
        return packSpecification;
    }

    public void setPackSpecification(String packSpecification) {
        this.packSpecification = packSpecification;
    }

    public String getDeliveryUnit() {
        return deliveryUnit;
    }

    public void setDeliveryUnit(String deliveryUnit) {
        this.deliveryUnit = deliveryUnit;
    }

    public String getProductStartTime() {
        return productStartTime;
    }

    public void setProductStartTime(String productStartTime) {
        this.productStartTime = productStartTime;
    }

    public String getProductEndTime() {
        return productEndTime;
    }

    public void setProductEndTime(String productEndTime) {
        this.productEndTime = productEndTime;
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

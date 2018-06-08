package com.spring.model;

import com.spring.util.Md5Util;

import java.io.Serializable;
import java.util.List;

/**
 * Created by SAM on 2017/10/19.
 */
public class ClientPO implements Serializable {
    private static final long serialVersionUID = 1L;
    //private int    id;
    private  String name;
    private String password;
    private String phoneNum;
    private String companyName;
    //private String role;
    private String industry;
   // private String headshot;
    //private String  gender;
    //private  String emailAddress;
    private  String bannerCode;
    private  String idy;
    private String endDate;
    private String  startDataDate;
    private String  publishType;
    private String  dayOfMonth;
    private String  dayOfWeek;
    //private String[] bannerCodeList;
    private List<String> bannerCodeList;

    public Client getClient() {
        Client client  =new Client();
        client.setBannerCode(this.bannerCode);
        client.setCompanyName(this.companyName);
        client.setDayOfMonth(this.dayOfMonth);
        client.setDayOfWeek(this.dayOfWeek);
        //client.setEmailAddress(this.emailAddress);
        //client.setEmailAddress("null");
        client.setEndDate(this.endDate);
        //client.setGender(this.gender);
        //client.setGender("null");
        //client.setHeadshot("null");
        //client.setIndustry("null");
        //client.setHeadshot(this.headshot);
        //client.setId(this.id);
        client.setIdy(this.idy);
        client.setIndustry(this.industry);
        client.setName(this.name);
        //加密用户密码
        client.setPassword(Md5Util.parseStrToMd5L32(this.password));
        client.setPhoneNum(this.phoneNum);
        client.setPublishType(this.publishType);
        //client.setRole(this.role);
        //client.setRole("null");
        client.setStartDataDate(this.startDataDate);
        return client;
    }

    /*public String[] getBannerCodeList() {
        return bannerCodeList;
    }

    public void setBannerCodeList(String[] bannerCodeList) {
        this.bannerCodeList = bannerCodeList;
    }*/

    public List<String> getBannerCodeList() {
        return bannerCodeList;
    }

    public void setBannerCodeList(List<String> bannerCodeList) {
        this.bannerCodeList = bannerCodeList;
    }

    public String getPublishType() {
        return publishType;
    }

    public void setPublishType(String publishType) {
        this.publishType = publishType;
    }

    public String getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /*public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }*/

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /*public String getHeadshot() {
        return headshot;
    }

    public void setHeadshot(String headshot) {
        this.headshot = headshot;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }*/

    public String getBannerCode() {
        return bannerCode;
    }

    public void setBannerCode(String bannerCode) {
        this.bannerCode = bannerCode;
    }

    public String getIdy() {
        return idy;
    }

    public void setIdy(String idy) {
        this.idy = idy;
    }



    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartDataDate() {
        return startDataDate;
    }

    public void setStartDataDate(String startDataDate) {
        this.startDataDate = startDataDate;
    }


}

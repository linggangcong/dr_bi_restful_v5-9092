package com.spring.model;

/**
 * Created by SAM on 2017/10/19.
 */
public class ClientE {
    private String  id;
    private  String name;
    private String password;
    private String phoneNum;
    private String companyName;
    private String role;
    private String industry;
    private String headshot;
    private String  gender;
    private  String emailAddress;
    private  String bannerCode;
    private  String idy;
   // private String startDate;
    private String endDate;
    private String  startDataDate;
    private String  publishType;
    private String  dayOfMonth;
    private String  dayOfWeek;
    private String[] bannerCodeList;
    //private String endDataDate;


    public Client getClient() {
        Client client  =new Client();
        client.setBannerCode(this.bannerCode);
        client.setCompanyName(this.bannerCode);
        client.setDayOfMonth(this.bannerCode);
        client.setDayOfWeek(this.bannerCode);
        client.setEmailAddress(this.bannerCode);
        client.setEndDate(this.bannerCode);
        client.setGender(this.bannerCode);
        client.setHeadshot(this.bannerCode);
        client.setId(this.bannerCode);
        client.setIdy(this.bannerCode);
        client.setIndustry(this.bannerCode);
        client.setName(this.bannerCode);
        client.setPassword(this.bannerCode);
        client.setPhoneNum(this.bannerCode);
        client.setPublishType(this.bannerCode);
        client.setRole(this.bannerCode);
        client.setStartDataDate(this.bannerCode);
        return client;
    }

    public String[] getBannerCodeList() {
        return bannerCodeList;
    }

    public void setBannerCodeList(String[] bannerCodeList) {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getHeadshot() {
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
    }

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

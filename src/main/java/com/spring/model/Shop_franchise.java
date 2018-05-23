package com.spring.model;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by SAM on 2017/10/13.
 */
public class Shop_franchise {
    private int franchiseId;
    private String franchiseCode;
    private String franchiseDesc;
    private String dataSource;
    private Timestamp creDate;
    private Timestamp updDate;
    private String updUser;
    private String creUser;


    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }


    public int getFranchiseId() {
        return franchiseId;
    }

    public void setFranchiseId(int franchiseId) {
        this.franchiseId = franchiseId;
    }

    public String getFranchiseCode() {
        return franchiseCode;
    }

    public void setFranchiseCode(String franchiseCode) {
        this.franchiseCode = franchiseCode;
    }

    public String getFranchiseDesc() {
        return franchiseDesc;
    }

    public void setFranchiseDesc(String franchiseDesc) {
        this.franchiseDesc = franchiseDesc;
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

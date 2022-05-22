package com.javabootcamp.project3.sportyshoes.entity;

import java.sql.Date;

public class Report {
    private Date purchaseDate;
    private String userName;
    private String productName;
    private String productCategory;

    public Report() {
    }

    public Report(Date purchaseDate, String userName, String productName, String productCategory) {
        this.purchaseDate = purchaseDate;
        this.userName = userName;
        this.productName = productName;
        this.productCategory = productCategory;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
}

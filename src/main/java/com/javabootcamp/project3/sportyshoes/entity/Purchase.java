package com.javabootcamp.project3.sportyshoes.entity;

import java.sql.Date;

public class Purchase {
    private int userId;
    private int bagId;
    private Date purchaseDate;

    public Purchase() {
    }

    public Purchase(int userId, int bagId, Date purchaseDate) {
        this.userId = userId;
        this.bagId = bagId;
        this.purchaseDate = purchaseDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBagId() {
        return bagId;
    }

    public void setBagId(int bagId) {
        this.bagId = bagId;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}

package com.javabootcamp.project3.sportyshoes.entity;

public class Product {
    private int ProductId;
    private String ProductName;
    private String ProductCategory;

    public Product() {
    }

    public Product(int productId, String productName, String productCategory) {
        ProductId = productId;
        ProductName = productName;
        ProductCategory = productCategory;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductCategory() {
        return ProductCategory;
    }

    public void setProductCategory(String productCategory) {
        ProductCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductId=" + ProductId +
                ", ProductName='" + ProductName + '\'' +
                ", ProductCategory=" + ProductCategory +
                '}';
    }
}

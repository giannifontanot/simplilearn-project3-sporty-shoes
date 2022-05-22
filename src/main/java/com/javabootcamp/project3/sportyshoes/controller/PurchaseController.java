package com.javabootcamp.project3.sportyshoes.controller;

import com.javabootcamp.project3.sportyshoes.entity.Product;
import com.javabootcamp.project3.sportyshoes.entity.Purchase;
import com.javabootcamp.project3.sportyshoes.entity.Report;
import com.javabootcamp.project3.sportyshoes.jdbc.ProductDao;
import com.javabootcamp.project3.sportyshoes.jdbc.PurchaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

@RestController
public class PurchaseController {

    public PurchaseController() {

    }

    @Autowired
    PurchaseDao purchaseDao;

    @GetMapping("/getAllPurchases")
    public List<Purchase> getAllPurchases() {
        return purchaseDao.getAllPurchases();
    }

    // Filter purchase reports by date and category
    @GetMapping("/getPurchaseByDate")
    public List<Report> getPurchaseByDate(@RequestParam String purchaseDate) {
        return purchaseDao.getPurchaseByDate(purchaseDate);
    }
    // Filter purchase reports by date and category
    @GetMapping("/getPurchaseByCategory")
    public List<Report> getPurchaseByCategory(@RequestParam String category) {
        return purchaseDao.getPurchaseByCategory(category);
    }


}
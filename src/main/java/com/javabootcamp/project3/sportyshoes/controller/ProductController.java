package com.javabootcamp.project3.sportyshoes.controller;

import com.javabootcamp.project3.sportyshoes.entity.Product;
import com.javabootcamp.project3.sportyshoes.entity.User;
import com.javabootcamp.project3.sportyshoes.jdbc.ProductDao;
import com.javabootcamp.project3.sportyshoes.jdbc.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {


    public ProductController(){

    }

    @Autowired
    ProductDao productDao;

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return productDao.getAllProducts();
    }

    @GetMapping("/updateCategory")
    public void updateProduct(@RequestParam int productId, String category){
        productDao.updateCategory(productId, category);
    }

}
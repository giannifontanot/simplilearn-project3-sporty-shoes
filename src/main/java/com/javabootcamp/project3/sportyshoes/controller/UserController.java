package com.javabootcamp.project3.sportyshoes.controller;

import com.javabootcamp.project3.sportyshoes.entity.Product;
import com.javabootcamp.project3.sportyshoes.entity.User;
import com.javabootcamp.project3.sportyshoes.jdbc.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {


    public UserController() {

    }

    @Autowired
    UserDao userDao;

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @GetMapping("/getString")
    public String getString() {
        return userDao.getString();
    }

    @GetMapping("/getUserById")
    public User getUser(@RequestParam String userId) {
        return userDao.getUserById(userId);
    }

    @GetMapping("/getUserByName")
    public User getUserByName(@RequestParam String userName) {
        return userDao.getUserByName(userName);
    }

    @GetMapping("/login")
    public String login(@RequestParam String username, String password) {
        try {
            if (userDao.login(username, password) instanceof User) {
                return "OK";
            }
        } catch (Exception e) {
            return "no user";
        }
        return "no user";
    }
    @GetMapping("/updatePassword")
    public void updatePassword(@RequestParam String username, String oldPassword, String newPassword){
        userDao.updatePassword(username, oldPassword, newPassword);
    }

}
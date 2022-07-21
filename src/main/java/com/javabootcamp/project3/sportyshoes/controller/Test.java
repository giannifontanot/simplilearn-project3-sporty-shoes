package com.javabootcamp.project3.sportyshoes.controller;

public class Test{
    int calculateDatesBetweenDates(String startDate, String endDate){
        endDate = endDate.substring(0,10);
        startDate = startDate.substring(0,10);
        return Integer.parseInt(endDate) - Integer.parseInt(startDate);

    }
}

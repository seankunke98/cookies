package com.example.demo.model;

public class SugarCookies implements Product {

    private String productName = "Pumpkin Spice Toffee Cookies";
    private double price = 2.5;
    private String description = "";
    private int minQuantity = 12;


    @Override
    public String name() {
        return null;
    }

    @Override
    public double price() {
        return 0;
    }

    @Override
    public int minQuantity() {
        return minQuantity;
    }

    @Override
    public String description() {
        return description;
    }
}

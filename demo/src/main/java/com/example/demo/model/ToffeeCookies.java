package com.example.demo.model;

public class ToffeeCookies implements Product {

    private String productName = "Pumpkin Spice Toffee Cookies";
    private double price = 2.5;
    private String description = "";


    @Override
    public String name() {
        return productName;
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public int productId() {
        return 0;
    }

    @Override
    public String description() {
        return description;
    }
}

package com.example.demo.model;

public class ToffeeCookies implements Product {

    private String productName = "Pumpkin Spice Toffee Cookies";
    private double price = 2.5;
    private String description = "";
    private int minQuantity = 12;

    @Override
    public String name() {
        return productName;
    }

    @Override
    public double price() {
        return price;
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

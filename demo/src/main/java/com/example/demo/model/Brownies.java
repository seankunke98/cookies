package com.example.demo.model;

public class Brownies implements Product {



    private String productName = "Brownies w/ Cream Cheese Icing";
    private double price = 3;
    private String description = "";
    private int minQuantity = 6;


    public Brownies(String productName, double price, String description, int minQuantity) {
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.minQuantity = minQuantity;
    }

    public Brownies() {

    }

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

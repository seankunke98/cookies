package com.example.demo.model;

public class RiceKrispieTreats implements Product {

    private String productName = "Pumpkin Spice Toffee Cookies";
    private double price = 2.5;
    private String description = "";

    private int productId;

    public RiceKrispieTreats(String productName, double price, String description, int productId) {
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.productId = productId;
    }

    public RiceKrispieTreats() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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
    public int productId() {
        return this.productId;
    }

    @Override
    public String description() {
        return description;
    }
}

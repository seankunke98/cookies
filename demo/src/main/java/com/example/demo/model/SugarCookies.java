package com.example.demo.model;

public class SugarCookies implements Product {

    private String productName = "Pumpkin Spice Toffee Cookies";
    private double price = 2.5;
    private String description = "";
    private int productId;

    public int getProductId() {
        return productId;
    }

    public SugarCookies() {
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public SugarCookies(String productName, double price, String description, int productId) {
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.productId = productId;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public double price() {
        return 0;
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

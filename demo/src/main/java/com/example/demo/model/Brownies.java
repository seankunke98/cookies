package com.example.demo.model;

public class Brownies implements Product {



    private String productName = "Brownies w/ Cream Cheese Icing";
    private double price = 3;
    private String description = "";
    private int productId;



    public Brownies(int productId, String productName, double price, String description, int quantity) {
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.productId = productId;

    }

    public Brownies() {

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

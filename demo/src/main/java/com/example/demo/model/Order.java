package com.example.demo.model;

public class Order {

    private int orderId;
    private String customerName;
    private String orderDescription;
    private String orderSpecialNotes;
    private boolean allergyFreeOrder;
    private String orderStatus;
    private int quantity;
    private double orderAmount;

    public Order() {
    }

    public Order(int orderId, String customerName, String orderDescription, String orderSpecialNotes, boolean allergyFreeOrder, String orderStatus, int quantity, double orderAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDescription = orderDescription;
        this.orderSpecialNotes = orderSpecialNotes;
        this.allergyFreeOrder = allergyFreeOrder;
        this.orderStatus = orderStatus;
        this.quantity = quantity;
        this.orderAmount = orderAmount;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public String getOrderSpecialNotes() {
        return orderSpecialNotes;
    }

    public void setOrderSpecialNotes(String orderSpecialNotes) {
        this.orderSpecialNotes = orderSpecialNotes;
    }

    public boolean isAllergyFreeOrder() {
        return allergyFreeOrder;
    }

    public void setAllergyFreeOrder(boolean allergyFreeOrder) {
        this.allergyFreeOrder = allergyFreeOrder;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}

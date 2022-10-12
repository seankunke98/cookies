package com.example.demo.dao;

import com.example.demo.model.Order;

import java.util.List;

public interface OrderDao {

    public List<Order> getOrders();
    public Order getOrder(int id);
    public void addOrder(Order order);
}

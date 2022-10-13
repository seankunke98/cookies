package com.example.demo.controller;

import com.example.demo.dao.OrderDao;
import com.example.demo.dao.UserDao;
import com.example.demo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("http://localhost:8080")
public class OrderController {


    private OrderDao orderDao;
    private UserDao userDao;

    public OrderController(OrderDao orderDao, UserDao userDao) {
        this.orderDao = orderDao;
        this.userDao = userDao;
    }

    @RequestMapping(path= "/", method = RequestMethod.GET)
    public List<Order> getOrders() {
        return orderDao.getOrders();
    }

}

package com.example.demo.dao;

import com.example.demo.model.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcOrderDao implements OrderDao {


    private JdbcTemplate jdbcTemplate;
    Order order;

    public JdbcOrderDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public List<Order> getOrders() {
        List<Order> orders = new ArrayList<>();
        String sql = "SELECT order_id, customer_name, order_amount, order_details, order_quantity FROM orders";
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql, Order.class, );

        return null;
    }

    @Override
    public Order getOrder(int id) {
        return null;
    }

    @Override
    public void addOrder(Order order) {

    }

    private Order mapRowToOrder(SqlRowSet rowSet) {
        Order order = new Order();
    }
}

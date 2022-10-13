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
        String sql = "SELECT order_id, customer_name, order_amount, order_description, order_quantity FROM orders";
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql);
        while(rowSet.next()){
            orders.add(mapRowToOrder(rowSet));
        }

        return orders;
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
        order.setOrderId(rowSet.getInt("order_id"));
        order.setAllergyFreeOrder(rowSet.getBoolean("allergy_free"));
        order.setOrderStatus(rowSet.getString("order_status"));
        order.setOrderDescription(rowSet.getString("order_description"));
        order.setOrderSpecialNotes(rowSet.getString("special_notes"));
        order.setQuantity(rowSet.getInt("order_quantity"));
        order.setCustomerName(rowSet.getString("customer_name"));
        return order;
    }
}

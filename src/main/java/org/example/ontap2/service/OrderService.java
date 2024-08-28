package org.example.ontap2.service;

import org.example.ontap2.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService {
    @Override
    public List<Order> getAllOrders() {
        return List.of();
    }

    @Override
    public Order getOrderById(Long id) {
        return null;
    }

    @Override
    public Order saveOrder(Order order) {
        return null;
    }

    @Override
    public boolean deleteOrder(Long id) {

        return false;
    }
}

package org.example.ontap2.service;

import org.example.ontap2.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IOrderService {
    List<Order> getAllOrders();
    Order getOrderById(Long id);
    Order saveOrder(Order order);
    boolean deleteOrder(Long id);
}

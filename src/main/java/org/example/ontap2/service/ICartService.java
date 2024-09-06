package org.example.ontap2.service;

import org.example.ontap2.model.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICartService {
    List<Cart> getAllCarts();
    Cart getCartById(Long id);
    Cart saveCart(Cart cart);
    boolean deleteCart(Long id);
}

package org.example.ontap2.service;

import org.example.ontap2.model.Cart;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartService implements ICartService{
    @Override
    public List<Cart> getAllCarts() {
        return List.of();
    }

    @Override
    public Cart getCartById(Long id) {
        return null;
    }

    @Override
    public Cart saveCart(Cart cart) {
        return null;
    }

    @Override
    public boolean deleteCart(Long id) {

        return false;
    }
}

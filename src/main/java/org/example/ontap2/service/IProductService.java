package org.example.ontap2.service;

import org.example.ontap2.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product saveProduct(Product product);
    boolean deleteProduct(Long id);
}

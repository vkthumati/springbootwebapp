package com.thumati.springframework.services;


import com.thumati.springframework.domain.Product;

public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);
}

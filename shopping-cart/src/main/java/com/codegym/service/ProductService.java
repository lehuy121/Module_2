package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface ProductService {
    void save(Product product);
    List<Product> findAll();
    Product findById(Integer id);
}

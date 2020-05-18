package com.huy.services;

import com.huy.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> displayAll();
    void add(Product product);
    void edit(int id,Product product);
    void delete(int id);
    Product searchById(int id);
    List<Product> searchByName(String search);
    List<Product> displayByName();
    List<Product> displayByPrice();
}

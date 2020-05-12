package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> displayAll();
    void add(Product product);
    void edit(int id,Product product);
    void delete(int id);
    Product searchById(int id);
    List<Product> searchByName(String search);

}

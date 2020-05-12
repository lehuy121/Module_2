package com.codegym.service;

import com.codegym.model.Product;

import java.util.*;

public class ProductServiceImpl implements ProductService {
    static Map<Integer, Product> productMap;
    static{
        productMap = new HashMap<>();
        productMap.put(1,new Product(1, "SamSung", 20.1f, "SamSung Galaxy 2020", "FPT"));
        productMap.put(2,new Product(2, "Nokia", 10.1f, "Nokia 2020", "Viettel"));
        productMap.put(3,new Product(3, "Iphone", 25.9f, "Iphone 10", "TGDD"));
        productMap.put(4,new Product(4, "Xiaomi", 10.99f, "Xiaomi  2020", "FPT"));
        productMap.put(5,new Product(5, "Bphone", 20.33f, "Bphone KaBoom 2020", "TGDD"));
        productMap.put(6,new Product(6, "Nokia", 20.33f, "Nokia ComeBack 2020", "HuyLe"));
    }
    @Override
    public List<Product> displayAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void add(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public void edit(int id, Product product) {
        productMap.put(id,product);
    }

    @Override
    public void delete(int id) {
        productMap.remove(id);
    }

    @Override
    public Product searchById(int id) {
        return productMap.get(id);
    }

    @Override
    public List<Product> searchByName(String search) {
        Product product;
        List<Product> listResults = new ArrayList<>();
        for(Map.Entry<Integer, Product> entry : productMap.entrySet()) {
             product = entry.getValue();
            if(product.getName().equals(search)){
                listResults.add(product);
            }
        }
        return listResults;
    }

//    public static void main(String[] args) {
//        List<Product> listProducts = searchByName("Nokia");
//        for(Product product:listProducts){
//            System.out.println(product.getDescription());
//        }
//    }

}

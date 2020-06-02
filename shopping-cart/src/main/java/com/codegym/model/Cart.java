package com.codegym.model;

public class Cart {
    private Product product;
    private Integer quantity;

    public Cart() {
    }

    public Cart(Product product, Integer quantity) {
        this.product = product;
        this.quantity=quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}

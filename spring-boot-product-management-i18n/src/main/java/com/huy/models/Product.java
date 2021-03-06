package com.huy.models;

public class Product {
    private int id;
    private String name;
    private float price;
    private String description;
    private String provider;

    public Product(){

    }

    public Product(String name, float price, String description, String provider) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.provider = provider;
    }
    public Product(int id, String name, float price, String description, String provider) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.provider = provider;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}

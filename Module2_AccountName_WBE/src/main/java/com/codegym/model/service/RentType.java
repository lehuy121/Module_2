package com.codegym.model.service;

import javax.persistence.*;

@Entity
@Table(name="rent_type")
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_rent_type")
    private Integer id_rent_type;

    @Column(name="name")
    private String name;

    @Column(name="price")
    private Double price;

    public RentType(){}

    public Integer getId_rent_type() {
        return id_rent_type;
    }

    public void setId_rent_type(Integer id_rent_type) {
        this.id_rent_type = id_rent_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

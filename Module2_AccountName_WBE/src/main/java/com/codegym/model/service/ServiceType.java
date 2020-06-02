package com.codegym.model.service;

import javax.persistence.*;

@Entity
@Table(name = "service_type")
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_service_type")
    private Integer id_service_type;

    @Column(name = "name")
    private String name;

    public ServiceType() {
    }

    public Integer getId_service_type() {
        return id_service_type;
    }

    public void setId_service_type(Integer id_service_type) {
        this.id_service_type = id_service_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

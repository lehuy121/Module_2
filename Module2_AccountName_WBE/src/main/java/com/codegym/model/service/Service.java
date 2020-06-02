package com.codegym.model.service;

import com.codegym.validation.PositiveNumbers;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
@Table(name="service")
public class Service {
    @Id
    @Column(name="id_service")
    @GenericGenerator(name="ser_id", strategy = "com.codegym.generator.ServiceID")
    @GeneratedValue(generator = "ser_id")
    private String id;

    @Column(name="name")
    private String name;

    @Column(name="area")
    @DecimalMin("1.0")
    @NotNull
    private Double area;

    @Column(name="number_of_floor")
    @PositiveNumbers
    private Integer number_of_floor;

    @Column(name="number_of_people")
    @PositiveNumbers
    private Integer number_of_people;

    @Column(name="rent_cost")
    @DecimalMin("1.0")
    @NotNull
    private Double rent_cost;

    @Column(name="status")
    private String status;
    @ManyToOne
    @JoinColumn(name="id_service_type")
    private ServiceType serviceType;

    @ManyToOne
    @JoinColumn(name="id_rent_type")
    private RentType rentType;

    public Service(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Integer getNumber_of_floor() {
        return number_of_floor;
    }

    public void setNumber_of_floor(Integer number_of_floor) {
        this.number_of_floor = number_of_floor;
    }

    public Integer getNumber_of_people() {
        return number_of_people;
    }

    public void setNumber_of_people(Integer number_of_people) {
        this.number_of_people = number_of_people;
    }

    public Double getRent_cost() {
        return rent_cost;
    }

    public void setRent_cost(Double rent_cost) {
        this.rent_cost = rent_cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }
}

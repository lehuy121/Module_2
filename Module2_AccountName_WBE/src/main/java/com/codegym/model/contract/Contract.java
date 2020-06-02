package com.codegym.model.contract;

import com.codegym.model.customer.Customer;
import com.codegym.model.service.Service;

import javax.persistence.*;

@Entity
@Table(name="contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_contract")
    private Integer id_contract;

    @Column(name="start_day")
    private String start_day;

    @Column(name="end_day")
    private String end_day;

    @Column(name="deposits")
    private Double deposits;

    @Column(name="total_money")
    private Double total_money;

    @ManyToOne
    @JoinColumn(name="id_customer")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="id_service")
    private Service service;

    public Contract (){}

    public Integer getId_contract() {
        return id_contract;
    }

    public void setId_contract(Integer id_contract) {
        this.id_contract = id_contract;
    }

    public String getStart_day() {
        return start_day;
    }

    public void setStart_day(String start_day) {
        this.start_day = start_day;
    }

    public String getEnd_day() {
        return end_day;
    }

    public void setEnd_day(String end_day) {
        this.end_day = end_day;
    }

    public Double getDeposits() {
        return deposits;
    }

    public void setDeposits(Double deposits) {
        this.deposits = deposits;
    }

    public Double getTotal_money() {
        return total_money;
    }

    public void setTotal_money(Double total_money) {
        this.total_money = total_money;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void totalMoney(){
        double startDay = Double.parseDouble(getStart_day().substring(8));
        double endDay = Double.parseDouble(getEnd_day().substring(8));
        double numberOfRentDay = endDay - startDay;
        double totalMoney = service.getRent_cost() * numberOfRentDay - getDeposits();
        setTotal_money(totalMoney);
    }
}

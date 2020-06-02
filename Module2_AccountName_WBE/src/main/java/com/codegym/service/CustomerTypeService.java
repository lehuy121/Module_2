package com.codegym.service;

import com.codegym.model.customer.CustomerType;

import java.util.List;

public interface CustomerTypeService {
    List<CustomerType> getAll();
    void save(CustomerType customerType);
}

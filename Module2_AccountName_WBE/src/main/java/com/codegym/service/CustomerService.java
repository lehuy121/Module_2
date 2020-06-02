package com.codegym.service;

import com.codegym.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Page<Customer> getAll (Pageable pageable);
    List<Customer> getAll ();
    void create (Customer customer);
    Customer findById(String id);
    void delete(String id);
}

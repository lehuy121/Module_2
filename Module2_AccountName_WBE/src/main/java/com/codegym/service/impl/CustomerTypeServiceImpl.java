package com.codegym.service.impl;

import com.codegym.model.customer.CustomerType;
import com.codegym.repository.CustomerTypeRepository;
import com.codegym.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {
    @Autowired
    CustomerTypeRepository customerTypeRepository;
    @Override
    public List<CustomerType> getAll() {
        return customerTypeRepository.findAll();
    }

    @Override
    public void save(CustomerType customerType) {
        customerTypeRepository.save(customerType);
    }
}

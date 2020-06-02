package com.codegym.service.impl;

import com.codegym.model.service.Service;
import com.codegym.repository.ServiceRepository;
import com.codegym.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@org.springframework.stereotype.Service
public class ServicesServiceImpl implements ServicesService {
    @Autowired
    ServiceRepository serviceRepository;
    @Override
    public Page<com.codegym.model.service.Service> getAll(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public List<Service> getAll() {
        return serviceRepository.findAll();
    }

    @Override
    public void save(com.codegym.model.service.Service service) {
        serviceRepository.save(service);
    }
}

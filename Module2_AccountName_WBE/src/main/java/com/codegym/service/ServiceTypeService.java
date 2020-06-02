package com.codegym.service;

import com.codegym.model.service.ServiceType;

import java.util.List;

public interface ServiceTypeService {
    List<ServiceType> getAll();

    void save(ServiceType customerType);
}

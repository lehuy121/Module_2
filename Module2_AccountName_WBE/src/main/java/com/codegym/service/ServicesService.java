package com.codegym.service;

import com.codegym.model.service.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServicesService {
    Page<com.codegym.model.service.Service> getAll(Pageable pageable);
    List<Service> getAll();
    void save(com.codegym.model.service.Service service);
}

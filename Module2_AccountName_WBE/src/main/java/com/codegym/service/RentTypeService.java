package com.codegym.service;

import com.codegym.model.service.RentType;

import java.util.List;

public interface RentTypeService {
    List<RentType> getAll();

    void save(RentType rentType);
}

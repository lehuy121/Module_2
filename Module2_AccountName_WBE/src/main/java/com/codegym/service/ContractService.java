package com.codegym.service;

import com.codegym.model.contract.Contract;

import java.util.List;

public interface ContractService {
    List<Contract> getAll();
    void save (Contract contract);
}

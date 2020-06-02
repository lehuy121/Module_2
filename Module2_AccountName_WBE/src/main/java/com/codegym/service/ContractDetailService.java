package com.codegym.service;

import com.codegym.model.contract.ContractDetail;

import java.util.List;

public interface ContractDetailService {
    List<ContractDetail> getAll();
    void save (ContractDetail contractDetail);
}

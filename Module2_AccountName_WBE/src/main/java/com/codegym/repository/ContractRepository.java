package com.codegym.repository;

import com.codegym.model.contract.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract,Integer> {
}

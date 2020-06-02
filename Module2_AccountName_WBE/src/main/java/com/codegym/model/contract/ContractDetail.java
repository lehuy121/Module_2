package com.codegym.model.contract;

import javax.persistence.*;

@Entity
@Table(name="contract_detail")
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_contract_detail")
    private int id_contract_detail;

    @Column(name="quantity")
    private String quantity;

    @ManyToOne
    @JoinColumn(name="id_contract")
    private Contract contract;

    public ContractDetail (){}

    public int getId_contract_detail() {
        return id_contract_detail;
    }

    public void setId_contract_detail(int id_contract_detail) {
        this.id_contract_detail = id_contract_detail;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}

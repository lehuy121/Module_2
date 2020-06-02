package com.codegym.model.customer;
import javax.persistence.*;

@Entity
@Table(name="customer_type")
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_customer_type")
    private Integer id;
    @Column(name="type")
    private String type;

    public CustomerType(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String name) {
        this.type = name;
    }
}

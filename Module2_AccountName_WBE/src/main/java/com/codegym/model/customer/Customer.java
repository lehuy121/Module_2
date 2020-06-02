package com.codegym.model.customer;

import com.codegym.validation.DateFormat;
import com.codegym.validation.Email;
import com.codegym.validation.IdentityCard;
import com.codegym.validation.PhoneNumber;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GenericGenerator(name="cus_id", strategy = "com.codegym.generator.CustomerID")
    @GeneratedValue(generator = "cus_id")
    @Column(name = "id_customer")
    private String id;

    @Column(name="name")
    private String name;

    @Column(name="birth")
    @DateFormat
    private String birth;

    @Column(name="identity_card")
    @IdentityCard
    private String identity_card;

    @Column(name="phone")
    @PhoneNumber
    private String phone;

    @Column(name="email")
    @Email
    private String email;

    @Column(name="address")
    private String address;

    @ManyToOne
    @JoinColumn(name="id_customer_type")
    private CustomerType customerType;

    public Customer(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String dayOfBirth) {
        this.birth = dayOfBirth;
    }

    public String getIdentity_card() {
        return identity_card;
    }

    public void setIdentity_card(String idNumber) {
        this.identity_card = idNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phoneNumber) {
        this.phone = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}

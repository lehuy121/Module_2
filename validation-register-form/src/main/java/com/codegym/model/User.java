package com.codegym.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Size(min = 2, max = 45, message = "FirstName phải có độ dài tối thiểu 2 và tối đa 45 ký tự")
    private String firstName;

    @Size(min = 2, max = 45, message = "LastName phải có độ dài tối thiểu 2 và tối đa 45 ký tự")
    private String lastName;

    //@NotEmpty(message = "PhoneNumber Không được để trống")
    @Pattern(regexp = "^(0[0-9])([0-9]{8})$", message = "PhoneNumber bắt đầu bằng số 0 và có 10 số")
    private String phoneNumber;

    @Min(value = 18, message = "Age phải lớn hơn hoặc bằng 18")
    private String age;

    @Pattern(regexp = "^([a-z]{0,20})@([a-z]{0,20})\\.(com)$", message = "Email định dạng là xxx@xxx.com")
    private String email;

    public User() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

package com.example.adaccarservices.models;

import com.example.adaccarservices.Constants.UserBenefits;
import lombok.Data;

import javax.persistence.*;


@Entity
@Data

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "first_name", nullable = false, length = 50, unique = false, updatable = true, insertable = true)
    private String firstName;
    @Column(name = "last_name", nullable = false, length = 50, unique = false, updatable = true, insertable = true)
    private String lastName;
    private char sex;
    @Column(name = "email")
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String country;
    private UserBenefits userBenefits;
}

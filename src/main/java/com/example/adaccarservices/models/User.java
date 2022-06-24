package com.example.adaccarservices.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "first_name", nullable = false, length = 50, unique = false, updatable = true, insertable = true)
    private String firstName;
    private String lastName;
    private char sex;
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String zip;
}

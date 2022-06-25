package com.example.adaccarservices.service;

import com.example.adaccarservices.models.UserEntity;
import com.example.adaccarservices.repo.UserRepositories;

import java.util.Optional;

public class UserEntityServices {

    private final UserRepositories userRepositories;

    public UserEntityServices(UserRepositories userRepositories) {
        this.userRepositories = userRepositories;
    }

    Optional<UserEntity> findByEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException("email cannot be null");
        }
        return userRepositories.findByEmail(email);
    }


    void validateUserEntity(UserEntity userEntity, String email, String password) {
        if (userEntity == null) {
            throw new IllegalArgumentException("userEntity cannot be null");
        }
        if (email == null) {
            throw new IllegalArgumentException("email cannot be null");
        }
        if (password == null) {
            throw new IllegalArgumentException("password cannot be null");
        }
    }

    void validateUserEntity(UserEntity userEntity, String email, String password, String firstName, String lastName, String phoneNumber, String address, String city, String state, String zip) {
        if (userEntity == null) {
            throw new IllegalArgumentException("userEntity cannot be null");
        }
        if (email == null) {
            throw new IllegalArgumentException("email cannot be null");
        }
        if (password == null) {
            throw new IllegalArgumentException("password cannot be null");
        }
        if (firstName == null) {
            throw new IllegalArgumentException("firstName cannot be null");
        }
        if (lastName == null) {
            throw new IllegalArgumentException("lastName cannot be null");
        }
        if (phoneNumber == null) {
            throw new IllegalArgumentException("phoneNumber cannot be null");
        }
        if (address == null) {
            throw new IllegalArgumentException("address cannot be null");
        }
        if (city == null) {
            throw new IllegalArgumentException("city cannot be null");
        }
        if (state == null) {
            throw new IllegalArgumentException("state cannot be null");
        }

    }
}


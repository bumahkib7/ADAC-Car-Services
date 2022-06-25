package com.example.adaccarservices.repo;

import com.example.adaccarservices.models.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepositories extends CrudRepository<UserEntity, Long> {

    Optional<UserEntity> findUser(UserEntity userEntity);



}

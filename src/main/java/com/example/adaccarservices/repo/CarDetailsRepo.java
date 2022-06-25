package com.example.adaccarservices.repo;

import com.example.adaccarservices.models.CarDetails;
import org.springframework.data.repository.CrudRepository;

public interface CarDetailsRepo extends CrudRepository<CarDetails, Long> {


    CarDetails findByNumberPlate(String numberPlate);
}

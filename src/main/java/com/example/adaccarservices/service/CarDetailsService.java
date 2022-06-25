package com.example.adaccarservices.service;

import com.example.adaccarservices.models.CarDetails;
import com.example.adaccarservices.repo.CarDetailsRepo;

public class CarDetailsService {

    private final CarDetailsRepo carDetailsRepo;

    public CarDetailsService(CarDetailsRepo carDetailsRepo) {
        this.carDetailsRepo = carDetailsRepo;
    }

    public CarDetails findByNumberPlate(String numberPlate) {
        if (numberPlate == null) {
            throw new IllegalArgumentException("numberPlate cannot be null");
        }
        return carDetailsRepo.findByNumberPlate(numberPlate);
    }

    public CarDetails save(CarDetails carDetails) {
        if (carDetails == null) {
            throw new IllegalArgumentException("carDetails cannot be null");
        }
        return carDetailsRepo.save(carDetails);
    }

    public void delete(CarDetails carDetails) {
        if (carDetails == null) {
            throw new IllegalArgumentException("carDetails cannot be null");
        }
        carDetailsRepo.delete(carDetails);
    }


}

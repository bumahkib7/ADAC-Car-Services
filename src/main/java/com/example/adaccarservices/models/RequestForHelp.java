package com.example.adaccarservices.models;

import com.example.adaccarservices.Constants.HelpType;
import com.example.adaccarservices.Constants.UserBenefits;
import lombok.Data;
import lombok.Value;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Value
public class RequestForHelp {

    String description;
    UserEntity userEntity;
    CarDetails carDetails;
    HelpType helpType;
    UserBenefits userBenefits;

}

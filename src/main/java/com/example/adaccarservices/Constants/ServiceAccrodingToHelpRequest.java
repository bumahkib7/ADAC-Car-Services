package com.example.adaccarservices.Constants;

public enum ServiceAccrodingToHelpRequest {
FLAT_TIRE("Flat Tire", "Flat Tire", "Flat Tire"),
    ENGINE_DAMAGE("Engine Damage", "Engine Damage", "Engine Damage"),
    ACCIDENT("Accident", "Accident", "Accident"),
    OTHER("Other", "Other", "Other");

    private final String serviceName;
    private final String serviceDescription;
    private final String serviceType;

    private ServiceAccrodingToHelpRequest(String serviceName, String serviceDescription, String serviceType) {
        this.serviceName = serviceName;
        this.serviceDescription = serviceDescription;
        this.serviceType = serviceType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public String getServiceType() {
        return serviceType;
    }


    public static ServiceAccrodingToHelpRequest getServiceAccrodingToHelpRequest(String serviceName, String serviceDescription, String serviceType) {
        for (ServiceAccrodingToHelpRequest serviceAccrodingToHelpRequest : ServiceAccrodingToHelpRequest.values()) {
            if (serviceAccrodingToHelpRequest.getServiceName().equals(serviceName) && serviceAccrodingToHelpRequest.getServiceDescription().equals(serviceDescription) && serviceAccrodingToHelpRequest.getServiceType().equals(serviceType)) {
                return serviceAccrodingToHelpRequest;
            }
        }
        return null;

    }


}

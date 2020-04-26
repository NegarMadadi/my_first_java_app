package org.example;

public class Car {
    String brand;
    String ownerName;
    String registrationNumber;
    int maxSpeed;

    public String getCarInformation() {
        return "The car brand is " + brand + ".\nOwner of the car is " + ownerName + ".\nRegistration number for the car is " +
                registrationNumber + ".\nThe cars max speed is " + maxSpeed + ".";
    }
}
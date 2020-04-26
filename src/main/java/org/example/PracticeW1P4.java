package org.example;

//Create a class called Car. The class should contain the following
//information. Car brand, registration number, max speed and owner
//name. Instantiate an Object of the class and assign values to the
//object.

public class PracticeW1P4 {
    public static void main(String[] args) {

        Car car = new Car();

        car.brand = "Volvo";
        car.maxSpeed = 240;
        car.ownerName = "Negar";
        car.registrationNumber = "XRM686";

        System.out.println(car.getCarInformation());
    }
}





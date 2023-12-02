package org.example;
public class Car {
    String make;
    String model;
    int year;
    public void startEngine() {
        System.out.println("Engine start");
    }

    public void stopEngine() {

        System.out.println("Engine stop");
    }

    public void displayCarInfo() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.make = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2022;
        System.out.println("Car Make: " + myCar.make);
        System.out.println("Car Model: " + myCar.model);
        System.out.println("Car Year: " + myCar.year);
        myCar.startEngine();
        myCar.stopEngine();
        myCar.displayCarInfo();
    }
}

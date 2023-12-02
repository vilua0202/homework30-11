package org.example;

interface Drivable {
    void drive();
}
public class Vehicle {
    private String brand;
    private int year;
    public void displayCarInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Year: " + year);
    }
    public Vehicle(String brand, int year) {
        this.brand = brand;
        setYear(year);
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setYear(int year){
        if (year > 0 && year <= 2023) {
            this.year = year;
        } else {
            System.out.println("Invalid year. Please enter a valid year.");
        }
    }
    public String getBrand() {
        return brand;
    }
    public int getYear() {
        return year;
    }
    static void driveVehicle(Drivable vehicle) {
        vehicle.drive();
    }
    public static void main(String[] args) {
        NewCar car = new NewCar("Toyota", 2025, 4, 4);
        Bike bike= new Bike("Honda", 2023,2);
        car.displayCarInfo();
        bike.displayCarInfo();
        car.drive();
        bike.drive();
        driveVehicle(car);
        driveVehicle(bike);
    }
}
 class NewCar extends Vehicle implements Drivable {
    int door;
    int wheel;
    public void introduce() {
        System.out.println("have " + wheel + " wheels");
    }
    public NewCar(String brand, int year, int door, int wheel) {
        super(brand, year);
        this.door = door;
        this.wheel = wheel;
    }
    @Override
    public void displayCarInfo() {
        System.out.println("Car Brand: " + getBrand());
        System.out.println("Car Year: " + getYear());
        System.out.println("Car wheel: " + wheel);
        System.out.println("Car door: " + door);
    }
    @Override
    public void drive() {
        System.out.println("Car is being driven");
    }
}
class Bike extends Vehicle implements Drivable {
    int wheel;
    public void introduce() {
        System.out.println("Bike has " + wheel + " wheel(s)");
    }
    public Bike(String brand, int year, int wheel) {
        super(brand, year);
        this.wheel = wheel;
    }
    @Override
    public void displayCarInfo() {
        System.out.println("Bike Brand: " + getBrand());
        System.out.println("Bike Year: " + getYear());
        System.out.println("Bike wheel: " + wheel);
    }
    @Override
    public void drive() {
        System.out.println("Bike is being driven");
    }
}

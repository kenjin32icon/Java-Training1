//package VehicleManagementSystem;
//
////Your team is building a vehicle management system with different types of vehicles: cars, trucks, and motorcycles.
////
////Write Java classes for a vehicle rental system:
////
////An abstract class Vehicle with fields: make, model, year, and an abstract method rentCost().
////        Subclasses Car, Truck, and Motorcycle that implement rentCost() differently based on type.
////Write a method printRentalDetails(Vehicle v) that works polymorphically with any vehicle type.
//public class Vehicle {
//    private String make;
//    private String model;
//    private int year;
//
//    public Vehicle(String make, String model, int year){
//        this.make = make;
//        this.model = model;
//        this.year = year;
//    }
//
//    // Abstract method to calculate rental cost
//    public abstract double rentCost();
//
//    //Method of getting the vehicles details
//    public  String getDetails() {
//        return year + " " + make + " " + model;
//    }
//
//}

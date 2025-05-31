package Inheritance;

public class Vehicle {
    private String name;  
    private int year;
    private String color;
    private double price;


    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public  Vehicle (String name, int year, String  color, double price){
        this.name = name;
        this.year = year;
        this.color = color;
        this. price = price;
    }

}

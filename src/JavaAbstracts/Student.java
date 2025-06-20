package JavaAbstracts;

// Define an interface DataOperations
// Create an abstract class Person
// Implement a concrete class Student
// Handle exceptions during file operations
// Read/ Write student data from/to a file

// Import necessary classes for input/output and collections
import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Interface defining operations for saving/loading data to/from files
interface DataOperations{
    void saveToFile(String filename) throws IOException;  //Saves data to file
    List<String> loadFromFile(String filename) throws IOException; //Loads data from a file as list of strings
}

//Abstract class representing a generic person
abstract class Person{
    String name;

    //Abstract method to display information about the person
    abstract void displayinfo();
}

//Concrete student class extending person and implementing DataOperations
public class Student extends Person implements DataOperations {
    int rollNumber;

    //Constructor to initialize student with name and roll number
    Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    //Implementation of abstract method to display student info
    @Override
    void displayinfo(){
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber);
    }

    // Method to save student data to a file
    @Override
    public void saveToFile(String filename) throws IOException {
        // Using try-with-resources to automatically close writer
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            //Writing name and roll number separated by comma
            writer.write(name + "," + rollNumber);
        }
    }

    // Method to load student data from a file
    @Override
    public List<String> loadFromFile(String filename) throws IOException {
        List<String> records = new ArrayList<>();  // To store loaded records

        // Using try-with-resources to automatically close reader
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            // Read file line by line and add each line to the list
            while ((line = reader.readLine()) != null) {
                records.add(line);
            }
        }

        return records;  // Return the list of records
    }
}


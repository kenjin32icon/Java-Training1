package StudentManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StudentRegistration extends Student {
    public StudentRegistration(String name, String IDno, String Course, char Grade) {
        super(name, IDno, Course, Grade);
    }


    //inputData; a boolean class for prompting user to input their data
    public boolean inputData(Scanner scanner) {
        System.out.println("    Student Management System");


        System.out.println("Student Name: ");
        String name = scanner.nextLine();
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return false;
        }

        System.out.println("Student ID Number: ");
        String IDno = scanner.nextLine();
        if (IDno.isEmpty()) {
            System.out.println("ID Number cannot be empty.");
            return false;
        }

        System.out.println("Student Course: ");
        String Course = scanner.nextLine();
        if (Course.isEmpty()) {
            System.out.println("Course cannot be empty.");
            return false;
        }

        //Grade input with the respective grade calculation
        System.out.println("Given that Grade(A =>70, B=>60, C=>50, D=> 40 Fail<40)");
        //Initialize variables
        float totalmarks = 0;
        int numberofunits = 8; // 8 units

        //loops to input total number of units
        for (int i = 1; i <= numberofunits; i++) {
            System.out.println("Enter marks of unit " + i + ":");
            float marks = scanner.nextFloat();
            totalmarks += marks; //Accumulate totalmarks
        }

        // If all validations pass, set values
        setName(name);
        setIDno(IDno);
        setCourse(Course);

        //Calculate average
        float average = totalmarks / numberofunits;
        System.out.println("Average marks: " + average);

        //Determine grade based on the average
        char grade;
        if (average >= 70) {
            grade = 'A';
        } else if (average >= 60) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else {
            grade = 'F'; //Fail
        }

        // Display all data for user to confirm
        public void displayData() {
            System.out.println("\nPlease review the entered student data:");
            System.out.println("-------------------------------------");
            System.out.println("Name   : " + getName());
            System.out.println("ID     : " + getIDno());
            System.out.println("Course : " + getCourse());
            System.out.println("Average marks: " + average);
            System.out.println("Grade  : " + getGrade());
            System.out.println("-------------------------------------");
        }
    }
}

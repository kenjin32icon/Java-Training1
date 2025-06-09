package StudentManagementSystem;

import java.util.Scanner;
public class StudentGrades {


    public static void main(String[] args){
        System.out.println("       Student Management System");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Name: ");
        String name = scanner.next();

        System.out.println("Student ID Number: ");
        int IDno = scanner.nextInt();

        System.out.println("Student Course: ");
        String Course = scanner.next();

        //Grade calculation
        System.out.println("Given that Grade(A =>70, B=>60, C=>50, D=> 40 Fail<40)");
        //Initialize variables
        float totalmarks = 0;
        int numberofsubjects = 8;

        //loops to input total number of subjects
        for(int i=1; i <= numberofsubjects; i++){
            System.out.println("Enter marks of unit " + i + ":" );
            float marks = scanner.nextFloat();
            totalmarks += marks; //Accumulate totalmarks
        }

        //Calculate average
        float average = totalmarks / numberofsubjects;
        System.out.println("Average marks: " + average);

        //Determine grade based on the average
        char grade;
        if (average >= 70) {
            grade = 'A';
        } else if (average >= 60) {
            grade = 'B';
        } else if (average >= 50){
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else{
            grade = 'F'; //Fail
        }

        // print result
        System.out.println("Grade " + grade);
        scanner.close();


    }


}

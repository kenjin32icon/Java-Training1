package classasigmnts;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Grade Calculator");

        System.out.println("Given that Grade(A =>70, B=>60, C=>50, D=> 40 Fail<40)");

        // my version 1
//        //Subject 1
//        //Subject input
//        System.out.print("Enter Subject 1: ");
//        String subject = scanner.next();
//
//        //subject repective Grade
//        System.out.print("Enter Subjects 1 Marks : ");
//        float marks = scanner.nextFloat();
//
////        //Subject 2
////        //Subject input
////        System.out.print("Enter Subject 2: ");
////        String subject2 = scanner.next();
////
////        //subject repective Grade
////        System.out.print("Enter Subjects 2 Marks : ");
////        float grade2 = scanner.nextFloat();
//
//        char result = 0;
//        boolean validOperation = true;
//
//        switch (marks) {
//            case 'A' :
//                if (marks >= 70);
//                 System.out.println("Grade A ");
//            break;
//
//            case 'B' :
//                if (marks >= 60 && marks < 69);
//                 System.out.println("Grade B");
//            break;
//
//            case 'C' :
//                if (marks >= 50 && marks < 59);
//                 System.out.println("Grade C");
//            break;
//
//            case 'D':
//            if (marks >= 40 && marks < 49) {
//                System.out.println("Grade D");
//            } else {
//                System.out.println("Grade F");
//            }
//                break;
//
//            default:
//                System.out.println("Error: Invalid operator entered.");
//                validOperation = false;
//
//                 //Print result if operation was valid
//                        if (validOperation) {
//        System.out.println("Result: " + subject + " " + marks + " = " + result);
//        }
//        }
//        scanner.close();

        // Verson 2

      //Initialize variables
        float totalmarks = 0;
        int numberofsubjects = 5;

        //loops to input total number of subjects
        for(int i=1; i <= numberofsubjects; i++){
            System.out.println("Enter marks" + i + ":" );
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
        System.out.println("Grade" + grade);
        scanner.close();


    }
}

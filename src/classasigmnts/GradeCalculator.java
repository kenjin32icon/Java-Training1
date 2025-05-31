package classasigmnts;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Grade Calculator");

        System.out.println("Given that Grade(A =>70, B=>60, C=>50, D=> 40 Fail<40): ");
        char grade = scanner.next().charAt(0);


        //Subject 1
        //Subject input
        System.out.print("Enter Subject 1: ");
        String subject = scanner.next();

        //subject repective Grade
        System.out.print("Enter Subjects 1 Marks : ");
        float marks = scanner.nextFloat();

//        //Subject 2
//        //Subject input
//        System.out.print("Enter Subject 2: ");
//        String subject2 = scanner.next();
//
//        //subject repective Grade
//        System.out.print("Enter Subjects 2 Marks : ");
//        float grade2 = scanner.nextFloat();

        float result = 0;
        boolean validOperation = true;

//        switch (grade) {
//            case marks:
//            if (marks >= 70) {
//                System.out.println("Grade A ");
//            } else if (marks >= 60 && marks < 69) {
//                System.out.println("Grade B");
//            } else if (marks >= 50 && marks < 59) {
//                System.out.println("Grade C");
//            } else if (marks >= 40 && marks < 49) {
//                System.out.println("Grade D");
//            } else {
//                System.out.println("Grade F");
//            }
//            default:
//                System.out.println("Error: Invalid operator entered.");
//                validOperation = false;
//        }
    }
}

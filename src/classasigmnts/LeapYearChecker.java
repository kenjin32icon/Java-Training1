package  classasigmnts;

import java.util.Scanner; //imports the Scanner class from the java.util tool kit
public class LeapYearChecker{
    public static void main(String[] args){
    System.out.println("Enter an year: ");

    Scanner scanner = new Scanner(System.in);
    int year;

    try {
        year = scanner.nextInt();

        if (year % 4 == 0) {
            System.out.println("The entered " + year + " is a leap year.");
        } else {
            System.out.println("The entered year" + year + "is not a leap year.");
        }
    } catch (Exception e){
            System.out.println("Invalid input! Please enter a valid year.");
        } finally{
            scanner.close();
        }
    }
}
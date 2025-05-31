package classasigmnts;

import java.util.Scanner; // Importing Scanner class for input operations
public class OddorEven {
    public static void main(String[] args) {
        System.out.println("Enter an integer:");

        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read user inputs
        int number;

        try {
            number = scanner.nextInt(); // Reading the input as an integer

            if (number % 2 == 0) {
                System.out.println("The entered " + number + " is Even.");
            } else {
                System.out.println("The entered " + number + " is Odd.");
            }
        } catch (Exception e) { // Handling the exception if input is not an integer
            System.out.println("Invalid Input! Please enter a valid integer.");
        } finally {
            scanner.close(); // Closing the Scanner object to prevent resource leakage
        }
    }
}

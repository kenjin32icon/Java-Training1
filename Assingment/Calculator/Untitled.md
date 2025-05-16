```java
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Simple Calculator");
        
        // Input first operand
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        // Input operator
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        // Input second operand
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        boolean validOperation = true;
        
        // Perform calculation based on operator
        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            
            case '-':
                result = num1 - num2;
                break;
            
            case '*':
                result = num1 * num2;
                break;
            
            case '/':
                if(num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            
            default:
                System.out.println("Error: Invalid operator entered.");
                validOperation = false;
        }
        
        // Print result if operation was valid
        if (validOperation) {
            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        }
        
        scanner.close();
    }
}


```

package JavaAbstracts;

import java.util.Scanner;
public class triangle {
    //Method to calculate the perimeter of the triangle
    public static double calculatePerimeter(double side1, double side2, double base){
        return side1 + side2 + base;
    }

    public static double calculateArea(double base, double height){
        return 0.5 * base * height;
    }

    public static void main (String[] args){
        //Input lengths of the sides of the triangle
        try (Scanner scanner = new Scanner(System.in)){
            // Input lengths of the sides of the triangle
            System.out.print("Enter the length of side 1: ");
            double side1 = scanner.nextDouble();

            System.out.print("Enter the length of side 2: ");
            double side2 = scanner.nextDouble();

            System.out.print("Enter the base of the triangle: ");
            double base = scanner.nextDouble();

            // Input height of the triangle
            System.out.print("Enter the height of the triangle: ");
            double height = scanner.nextDouble();

            // Calculate perimeter
            double perimeter = calculatePerimeter( side1,  side2,  base);

            // Calculate area using side1 as the base
            double area = calculateArea(base, height);

            System.out.printf("The perimeter of the triangle is: %.2f%n", perimeter);
            System.out.printf("The area of the triangle is: %.2f%n", area);

        }
    }
}

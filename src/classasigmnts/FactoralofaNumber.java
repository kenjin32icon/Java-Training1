package classasigmnts;

import java.util.Scanner;
public class FactoralofaNumber {
    //- Input a number and compute its factorial using a loop.
            // Factorial(n!) Formula
        //n! = n * (n-1) * (n-2) * ... * 1
    // ------------------------------------------------
        // 1! = 1
        // 2! = 2 * 1 = 2
        // 3! = 3 * 2 * 1 = 6
        // 4! = 4 * 3 * 2 * 1 = 24
        // 5! = 5 * 4 * 3 * 2 * 1 =120

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i, fact=1;
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        for(i=1; i<=num; i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial of " + num + " is : " + fact);
    }

}

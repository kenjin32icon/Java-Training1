package classasigmnts;

import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    //- Generate a random number and let the user guess it in a loop until correct.

    public static void main(String[] args){
        generateRandom();
    } // end of method

    public static void generateRandom(){
        //Creating object of Random Class
        Random randomNum=new Random();

        //Generating  = random number between 0-10
        int randomNumValue = randomNum.nextInt(11);

        //Calling guest method
        guess(randomNumValue);
    }//end of generate method

    public static void guess(int randomNum){
        // Creating an object of Scanner Class
        Scanner scanner = new Scanner(System.in);

        //welcome message
        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 0-10: ");
        int guess = scanner.nextInt();

        //Input validation
        while(guess<0 || guess>10){
            System.out.print("Guess a number between 0-10 ");
            guess=scanner.nextInt();
        }
        //try again until you guess the correct number
        int tries = 0;
        while(guess!=randomNum){
            tries++;
            System.out.println("Wrong Guess!");
            System.out.print("Guess again: ");
            guess=scanner.nextInt();
            System.out.println("");

            //Input validation
            while(guess<0 || guess>10){
                System.out.print("Guess a number between 0-10 ");
                guess=scanner.nextInt();
                System.out.println("");
            }
        }
        //Game won
        System.out.println("Correct Answer. You won! ");
        System.out.println("Wrong Tries: "+tries);
        System.out.println("");

        //Play again or exit?
        System.out.println("Press 1 to play again.");
        System.out.println("Press 0 to play exit.");
        int choice=scanner.nextInt();

        if(choice==1)
            generateRandom();
        else
            return;



    }
}

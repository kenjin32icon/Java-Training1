package Multithreading;

// Multithreading enables a program to do multiple different things at the same time.
// The ability to execute multiple different paths of code at the same time.
// in java usually use only one path but using multithreading you can bypass this.
public class Multithreading {
    public static void main (String[] args){

        // TO create more 2 threads use a for loop
        for( int i = 0; i < 5; i++){
            //creating an object
            Multithreadthing myThing = new Multithreadthing();
            Multithreadthing myThing2 = new Multithreadthing();

//Using start instead run java will branch of a new thread.
            // Using run it would complete the first thread then goes to the second thread
            myThing.start();
            myThing2.start(); // After adding the second myThing 2  it would the 2 different threads would be running at the same time.
        }

    }
}

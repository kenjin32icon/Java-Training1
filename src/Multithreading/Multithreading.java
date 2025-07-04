package Multithreading;

// Multithreading enables a program to do multiple different things at the same time.
// The ability to execute multiple different paths of code at the same time.
// in java usually use only one path but using multithreading you can bypass this.
// If one of the threads blow up with some kind of exception it doesn't impact the other threads. THey keep performing as business a usual ,
public class Multithreading {
    public static void main(String[] args) {

        // TO create more 2 threads use a for loop
        for (int i = 0; i < 5; i++) {
            //creating an object
            Multithreadthing myThing = new Multithreadthing(i);
            Thread myThread = new Thread(myThing);

//Using start instead run java will branch of a new thread.
            // Using run it would complete the first thread then goes to the second thread
            myThread.start();

            //.join method to ensure that one thread completes processing for another one to complete
//            try {
//                myThread.join(); // Stops the program and wait that thread to complete
//            } catch (InterruptedException e) {
//            }
//            throw new RuntimeException();
//        }

            //.isAlive() when called when the threads are running it would return true
            // If the thread completes it would return false
//            try {
//                myThread.isAlive();
//            } catch (RuntimeException e) {
//            }
//
//        }
        }
    }
}


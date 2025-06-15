package Multithreading;

//Ways of creating a multithread class 1, extending a Thread class which in java only allows one instance of inheritance. Cant extend any other class.
// Second way is to implement the Runnable interface
public class Multithreadthing implements Runnable {
    // To make it mutithreadable is to override the thread classes run method.

    //  Create a new constructor
    private int threadnumber;
    public Multithreadthing(int threadnumber){
        this.threadnumber = threadnumber;
    }


    @Override // Good practice
    // using start instead of run each threadnumber outputs the looped number sequentially instead of the random threadnumber when using run
    public void run(){
        for (int  i = 1; i<= 5; i++) {
            System.out.println(i + "from thread" + threadnumber);
            //To make thread number 3 blow up
            if (threadnumber == 3) {
             }
            }
            try {
                Thread.sleep(1000);//1000 mill seconds = 1 sec
            } catch (InterruptedException e) {
            }
        }

        }




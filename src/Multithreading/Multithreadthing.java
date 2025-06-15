package Multithreading;

public class Multithreadthing extends Thread{
    // To make it mutithreadable is to override the thread classes run method.

    //  Create a new constructor
    private int threadnumber;
    public Multithreadthing(int threadnumber){
        this.threadnumber = threadnumber;
    }


    @Override // Good practice
    // using start instead of run each threadnumber outputs the looped number sequentially instead of the random threadnumber when using run
    public void start(){
        for (int  i = 1; i<= 5; i++) {
            System.out.println(i + "from thread" + threadnumber);

            try {
                Thread.sleep(1000);//1000 mill seconds = 1 sec
            } catch (InterruptedException e) {
            }
        }

        }

    }


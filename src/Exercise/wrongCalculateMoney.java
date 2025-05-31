package Exercise;

public class wrongCalculateMoney {
    public static void main(String[] args) {
        int numDimes = 7;
        int numQuarters = 3;
        int numNickels = 8;
        // Corrected calculation for total amount in cents
        int total = numDimes * 10 + numQuarters * 25 + numNickels * 5;
         System.out.println("Total = " + total);
    }
}

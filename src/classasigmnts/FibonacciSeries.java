package classasigmnts;

public class FibonacciSeries {
    // The Fibonacci series ia a series where the next term is the sum of the previous two terms.
    // The first two terms is the Fibonacci sequence are followed by 1.
    // Fibonacci Series : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.
        // This program - Print the first N numbers of the Fibonacci sequence.
    public static void main(String[] args){
        int n = 10, firstNum = 0, secondNum = 1;
        int nextNum;

        for(int i=1; i<=n;i++){
            System.out.print(firstNum + " , ");
            nextNum = firstNum + secondNum;
                // example 0,1,1 nextNum = 1 so 0 + 1 = 1, result first,second,next = 0,1,1
            firstNum = secondNum;
            secondNum = nextNum;

        }
    }
}

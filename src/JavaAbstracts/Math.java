package JavaAbstracts;

// Error handling
public class Math {
    int value1;
    int value2;

    public Math(int value1, int value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public int divide(){
        return value1 / value2;
    }
    public static void main(String[] args){
        try{
            Math maths = new Math(10, 0);
            System.out.println(maths.divide());
        } catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }finally {
            System.out.println("This is the end of the program");
        }
    }
}

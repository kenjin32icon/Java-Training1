package Polymorphisim;

public class overloading {
    int number;
    int number2;
    int number3;

    public overloading(int number, int number2, int number3){
        this.number = number;
        this.number2 = number2;
        this.number3 = number3;
    }

    public int add(int number, int number2){
        return number + number2;
    }
    public int add(int number, int number2, int number3){
        return number + number2;
    }

    public static void main(String[] args){
        overloading obj = new overloading(1,2, 3);
        overloading obj2 = new overloading(1 , 2, 3);
        System.out.println(obj.add(1,2,3));
        System.out.println(obj2.add(1,2,3));
            }
}

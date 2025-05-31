package class2;

public class logicaloperatorsinjava {
    int age = 20;
    int weight = 80;
    boolean canRide =  (age > 18 && weight > 50);
    public static void main (String[] args) {
        logicaloperatorsinjava obj =  new logicaloperatorsinjava();
        System.out.println(obj.canRide);
    }
}
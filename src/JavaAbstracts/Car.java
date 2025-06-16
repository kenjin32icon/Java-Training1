package JavaAbstracts;

public class Car  implements/*interface*/ Drivable1{

    public void drive() {
        System.out.println("Car is driving");
    }
    public static void main(String[] args){
        Car c = new Car();
        c.drive();
    }
}

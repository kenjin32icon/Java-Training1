package JavaAbstracts;

public interface Drivable1 {
    void drive();
    default void stop(){
        System.out.println("Stopping the vehicle");
    }

}

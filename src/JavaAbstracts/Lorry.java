    package JavaAbstracts;

    public class Lorry implements Drivable1{
        @Override
        public void drive() {
            System.out.println("Driving a lorry");
        }
        public static void main(String[] args) {
            Lorry lorry = new Lorry();
            lorry.drive();
        }
    }

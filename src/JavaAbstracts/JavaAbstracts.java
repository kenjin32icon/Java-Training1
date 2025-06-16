package JavaAbstracts;

abstract class Animal {
//Abstract method (does not have a body)
        public abstract void animalSound();
        // Regular method
        public void sleep() {
            System.out.println("Zzzz");
        }
    }

    public class JavaAbstracts extends Animal{

        public void animalSound() {

        }
    }


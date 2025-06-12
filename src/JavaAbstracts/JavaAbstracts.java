package JavaAbstracts;

abstract class Animal {

        public abstract void animalSound();
        // Regula method
        public void sleep() {
            System.out.println("Zzzz");
        }
    }

    public class JavaAbstracts extends Animal{

        public void animalSound() {

        }
    }


package Polymorphisim;

public class Dog extends Animal {
   @Override
    public void makeSound(){
        System.out.println("The dog barks: Woof! Woof!");
    }

    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.makeSound();
    }
}

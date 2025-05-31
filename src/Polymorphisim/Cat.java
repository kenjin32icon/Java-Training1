package Polymorphisim;

public class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meow");
    }

    public static void main(String[] args){
        Animal myCat = new Cat();
        myCat.makeSound();
    }

}

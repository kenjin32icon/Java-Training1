package Polymorphisim;

public class lion extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Lion roars!!!");
    }

    public static void main(String[] args){
        Animal lion = new lion();
        lion.makeSound();

    }
}

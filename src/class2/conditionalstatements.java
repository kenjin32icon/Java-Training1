package class2;

public class conditionalstatements {
 String name ;
 int age;
    public static void main (String[] args) {
        conditionalstatements obj = new conditionalstatements();
        obj.name = "John";
        obj.age = 20;
        if (obj.age > 18) {
            System.out.println("Eligible for voting");
        }
        else {
            System.out.println("Not eligible for voting");

        }
    }
}

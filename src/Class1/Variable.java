package Class1;

public class Variable {
    int age = 20;
    String name = "Jphn";
    double height = 1.75;
    boolean isStudent = true;
    char grade = 'A';
    float length = 1.75f;
    long populatation = 70000000000000l;
    byte b = 127;
    short s = 32767;

    public static void main (String[] args){
        Variable v = new Variable();
        System.out.println(v.age);
        System.out.println(v.name);
        System.out.println(v.height);
        System.out.println(v.isStudent);
        System.out.println(v.length);
        System.out.println(v.populatation);
        System.out.println(v.b);
        System.out.println(v.s);
    }


}

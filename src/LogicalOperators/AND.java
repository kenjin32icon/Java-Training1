package LogicalOperators;

//The AND Operator && –> a&&b : This operator returns false if at least one of the operands is false.
// Think of it as, "both a and b must be true to make this statement true.
// If one of them is false, the whole thing is false–it has to be 'and'".
public class AND {
    int age = 16;
    int weight = 40;
    boolean donateblood = (age >= 16 && weight >= 50);
    public static void main(String[] arg){
        AND obj = new AND();
        System.out.println(obj.donateblood);
    }
}

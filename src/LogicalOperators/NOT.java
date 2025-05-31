package LogicalOperators;

// The not Operator ! –> !a : This unary operator returns the reverse of the operand.
// Rather than asking if something is equal to something else, you can be exclusionary with the ! and say,
// "the following should happen as long as this variable is not a."
public class NOT {
    int Mike = 21;
    int John = 21;
    boolean isNotLess = ! (John < Mike);
    public static void main(String[] arg) {
        NOT obj = new NOT();
        System.out.println(obj.isNotLess);
    }
}

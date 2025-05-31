package LogicalOperators;

// The or Operator || –> a||b : This operator returns true if at least one of the operands is true. Think of it as,
// "if a or b is true, the whole thing is true."
public class OR {
    int programming = 60;
    int languages = 30;
    boolean entrance = (languages >= 40 || programming >= 50);
    public static void main (String[] arg){
        OR obj = new OR();
        System.out.println(obj.entrance);
    }

}

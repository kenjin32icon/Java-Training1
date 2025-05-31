package Exercise;

public class correctCalculateMoney {
    int numDimes = 7;
    int numQuarters = 3;
    int numNickels = 8;
    int total = numDimes * 10 + numQuarters * 25 + numNickels * 5;
    public static void main(String[] arg){
        correctCalculateMoney obj = new correctCalculateMoney();
        System.out.println(obj.total);

    }

}

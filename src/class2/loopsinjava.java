package class2;

public class loopsinjava {
    int marks = 0;

    public void forloop() {
        for (int i = 0; i < 10; i++) {
            marks = marks + 10;
            System.out.println(marks);
        }
    }

    public static void main(String[] args) {
        loopsinjava obj = new loopsinjava();
        obj.forloop();
    }
}

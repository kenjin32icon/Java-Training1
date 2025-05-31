package classasigmnts;

import java.util.Scanner;
public class MultplicationTable {
    public static void main(String[] args){
        int num;
        System.out.print("Enter number for multiplication table:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(int i=1;i<=10; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    }



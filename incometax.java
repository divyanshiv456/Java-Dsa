import java.util.*;

public class incometax {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int income = sc.nextInt();
        // int tax;

        // if (income < 500000) {
        // tax = 0;
        // } else if (income >= 500000 && income <= 100000) {
        // tax = (int) (income * 0.2);
        // } else {
        // tax = (int) (income * 0.3);
        // }

        // System.out.print("your tax is : " + tax);

        // largest in 3 numbers
        int a = 2;
        int b = 5;
        int c = 4;

        if (a >= b && a >= c) {
            System.out.println("largest number is : " + a);
        } else if (b >= c) {
            System.out.println("largest number is : " + b);
        } else {
            System.out.println("largest number is : " + c);
        }
    }
}
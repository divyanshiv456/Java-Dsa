import java.util.*;

public class practise2 {
    public static void main(String[] args) {

        // q1
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // if (n < 0) {
        // System.out.println("your number is negative");
        // } else {
        // System.out.println("your number is positive");
        // }

        // q2
        // double temp = 103.5;
        // if (temp >= 100) {
        // System.out.println("you got fever");
        // } else {
        // System.out.println("you are doing well");
        // }

        // q3
        // int num = 4;
        // switch (num) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // case 7:
        // System.out.println("Sunday");
        // break;
        // default: System.out.println(" you are on holidays ")
        // break;
        // }

        // q5
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean x = (year % 4 == 0);
        boolean y = (year % 100 != 0);
        boolean z = (year % 100 == 0 && year % 400 == 0);

        if (x && (y || z)) {
            System.out.println("it is a leap year");
        } else {
            System.out.println("it is not a leap year");
        }
    }
}

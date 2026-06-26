import java.util.*;

public class dowhile {
    public static void main(String[] args) {
        int n = 5;
        int counter = 1;
        do {
            System.out.println("fuck off");
            counter++;
        } while (counter <= n);

        // break statment
        for (int i = 0; i <= 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);

        }
        System.out.println("i'm out of the loop");

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("enter your number");
            int num = sc.nextInt();

            if (num % 10 == 0) {
                break;
            }
            System.out.println(num);
        } while (true);

        // continue statement
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        do {
            System.out.print("user enter you number : ");
            int user = sc.nextInt();
            if (user % 10 == 0) {
                continue;
            }
            System.out.println(user);
        } while (true);
    }
}

import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // q3
        // int num = sc.nextInt();
        // int fact = 1;

        // for (int i = 1; i <= num; i++) {
        // fact = fact * i;
        // }
        // System.out.println("Factorial of number " + num + " is : " + fact);

        // q4
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        int ans = 0;

        for (int i = 1; i <= 10; i++) {
            ans = n * i;
            System.out.println(n + "X" + i + "=" + ans);
        }
    }
}

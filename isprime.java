import java.util.Scanner;

public class isprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) { // n is mulptile of i (i not equal to 1 or n)
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
            }
        }

        // find the sum of even number or odd

        int number;
        int choice;
        int evensum = 0;
        int oddsum = 0;

        do {
            System.out.println("enter the number");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evensum += number;
            } else {
                oddsum += number;
            }

            System.out.println("do you want continue press 1 or press 2");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("sum of even numbers : " + evensum);
        System.out.println("sum of odd numbers : " + oddsum);

    }
}

import java.util.*;

public class func {

    public static int calculatesum(int num1, int num2) { // prameters or formal parameters

        int sum = num1 + num2;
        return sum;
    };

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int bin_coff(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n - r);

        int result = n_fact / (r_fact * nmr_fact);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculatesum(a, b); // arguments or actual parameters
        // System.out.println("sum : " + sum);
        // System.out.println("product of a and b is : " + multiply(a, b));

        System.out.println("fatorial : " + factorial(4));

        int n = 5;
        int r = 2;

        // Binomial coefficient

        int result = bin_coff(n, r);
        System.out.println("Binomial coefficent is : " + result);

    }
}

public class funcovl {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static boolean isPrime(int n) {

        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeRange(int n) {

        for (int i = 2; i <= n; i++) {
            isPrime(i);
            if (isPrime(i) == true) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {

        // function overloading using parameters
        System.out.println(sum(5, 4));
        System.out.println(sum(12, 4, 6));

        // function overloading using data type
        System.out.println(sum(2.3f, 4.6f));

        // check if number is prime
        System.out.println(isPrime(8));

        primeRange(10);
    }
}

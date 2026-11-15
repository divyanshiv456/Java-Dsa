public class Recursion {

    public static void PrintDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        PrintDec(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        PrintDec(n);
        PrintInc(n);

        System.out.println();

        int m = 5;
        System.out.print(fact(m));

        System.out.println();

        System.out.print(fib(m));

        System.out.println();

        System.out.print(sumofn(m));

        System.out.println();

        System.out.println(fib(24));
        System.out.println(fib(25));
        System.out.println(fib(26));
        System.out.println(fib(27));
        System.out.println(fib(28));

        int arr[] = { 1, 2, 3, 5, 4 };
        System.out.println(isSorted(arr, 0));

    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }

        return (n * fact(n - 1));
    }

    public static void PrintInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        PrintInc(n - 1);
        System.out.print(n + " ");
    }

    public static int sumofn(int n) {
        int sum = 0;
        if (n == 1) {
            return n;
        }
        sum = n + sumofn(n - 1);
        return sum;
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

}

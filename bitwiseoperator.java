public class bitwiseoperator {

    public static void oddoreven(int n) {
        int bitmask = 1;
        if ((bitmask & n) == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }

    public static int getithbit(int n, int i) {
        int bitmask = (1 << i);
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setithbit(int n, int i) {
        int bitmask = (1 << i);
        return n | bitmask;
    }

    public static int clearithbit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int updateithbit(int n, int i, int newbit) {
        if (newbit == 0) {
            return clearithbit(n, i);
        } else {
            return setithbit(n, i);
        }

        // n = clearithbit(n, i);
        // int bitmask = newbit << i;
        // return n | bitmask;
    }

    public static int clearlstbit(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    public static int clearitojthbit(int n, int i, int j) {
        int a = (~(0) << j + 1);
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static boolean isPowerOfTow(int n) {
        return (n & (n - 1)) == 0;
    }

    // count set bit in a number - means count how many one is present
    public static int countsetbit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++; // check our LSB
            }

            n = n >> 1;

        }
        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;

        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }

            a = a * a;
            n = n >> 1;
        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println("fast expo : " + fastExpo(3, 5));

        System.out.println("count of set bit : " + countsetbit(15));

        System.out.println("is power o two : " + isPowerOfTow(8));

        System.out.println(clearithbit(5, 2));

        System.out.println("getbit : " + getithbit(5, 1));

        System.out.println("setithbit : " + setithbit(10, 2));

        System.out.println("update : " + updateithbit(10, 3, 0));

        System.out.println("clearlstbit : " + clearlstbit(15, 2));

        System.out.println("clearrangebit : " + clearitojthbit(10, 2, 4));

        oddoreven(3);
        oddoreven(6);

        // AND operator
        System.out.println((5 & 6));

        // OR operator
        System.out.println((5 | 6));

        // XOR operator
        System.out.println((5 ^ 6));

        // binary's one complement operator (NOT operator)
        System.out.println((~5));

        // left shift opretor
        System.out.println((5 << 2));

        // right shift opretor
        System.out.println((6 >> 1));
    }
}

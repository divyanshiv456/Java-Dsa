public class swap {

    public static int bitmanupadd(int n) {
        int result = -~n;

        return result;
    }

    public static void main(String[] args) {

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            char cht = (char) (ch | ' ');
            System.out.print(Character.toUpperCase(cht));
        }

        System.out.println();

        System.out.println(bitmanupadd(3));

        int x = 3, y = 4;
        System.out.println("Before swap : x = " + x + " y = " + y);
        // swap using xor
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swap : x = " + x + " y = " + y);
    }
}

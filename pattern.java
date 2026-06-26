public class pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                // count++;
            }
            System.out.println();
            // count = 1;
        }

        // print character pattern
        char ch = 'A';
        for (int i = 1; i < n; i++) {
            for (int j = 'A'; j < i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

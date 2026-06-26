import java.util.*;

public class loops {
    public static void main(String[] args) {
        // int counter = 0;
        // while (counter < 10) {
        // System.out.println("DON'T GIVE UP");
        // counter++;
        // }

        // int count = 1;
        // while (count <= 10) {
        // System.out.println(count);
        // count++;
        // }

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}

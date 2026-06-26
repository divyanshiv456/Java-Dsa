import javax.sound.midi.SysexMessage;

public class parttern {
    public static void main(String[] args) {
        // int n = 5;
        // for (int i = 0; i < n; i++) {
        // System.out.println(" * * * * * ");
        // }

        // reverse the number
        // int n = 234665;
        // while (n > 0) {
        // int lastdigit = n % 10;
        // System.out.print(lastdigit);
        // n /= 10;
        // }
        // System.out.println();

        int n = 4589345;
        int rev = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n /= 10;
        }
        System.out.println(rev);

    }
}

import java.util.*;

public class string {

    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c', 'd' };
        // strings are immutable
        String str = "abcd";
        String str2 = new String("xyz");

        // input string
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println(name);

        // String in length
        String fullName = "Divyanshi verma";
        System.out.println(fullName.length());

        // String concatniation
        String firstName = "Divyanshi";
        String lastName = "Verma";
        String compName = firstName + " " + lastName;
        System.out.println(compName);

        // String charAt()

        System.out.println(compName.charAt(0));

    }
}

public class ispalindrom {
    public static boolean ispalindrom(String str) {

        int n = str.length();

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;

    }

    public static float getshortestpath(String str) {

        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);

            if (dir == 'N') {
                x++;
            } else if (dir == 'S') {
                x--;
            } else if (dir == 'E') {
                y++;
            } else {
                y--;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) (Math.sqrt(X2 + Y2));
    }

    public static String Substring(String str, int si, int ei) {
        String substring = "";
        for (int i = si; i < ei; i++) {
            substring += str.charAt(i);
        }
        return substring;
    }

    public static void main(String[] args) {
        String str = "Divya";

        System.out.println(ispalindrom(str));

        String str2 = "WNEENESENNN";

        System.out.println(getshortestpath(str2));

        // String comparision

        String s1 = "Tony"; // s1 and s2 same object ko point karenge
        String s2 = "Tony";
        String s3 = new String("Tony"); // but s3 k case s3 new string create karega

        if (s1 == s2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("String are not equal");
        }

        if (s1 == s3) {
            System.out.println("Striings are equal");
        } else {
            System.out.println("String are not equal");
        }

        if (s1.equals(s3)) { // equals value ko compare karte hai
            System.out.println("String are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // Substrings
        String stri = "HelloWorld";

        System.out.println(Substring(stri, 0, 5));
        System.out.println(stri.substring(0, 5));

        // print largest string

        String fruits[] = { "apple", "orange", "banana" }; // Lexciograhy = 'aabcd' > 'aabce' beacause 'd' is greater
                                                           // than 'e'

        String largest = fruits[0];

        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        System.out.println(largest);

    }
}

import java.util.*;

public class stringcompress {

    public static StringBuilder compress(String str) {
        StringBuilder sb = new StringBuilder("");
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
                count = 0;
            }
        }
        return sb;
    }

    public static int strCount(String str) {
        int count = 0;
        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (str.charAt(i) == vowels[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }

    public static boolean Anagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        // Sort both arrays
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        // Compare sorted arrays
        return Arrays.equals(sArr, tArr);
    }

    public static void main(String[] args) {
        String str = "aaabbcccddd";
        System.out.println(compress(str));

        String str1 = "ApnaCollege".replace("l", " ");
        System.out.println(str1);

        String str2 = "adgjeisIAfsdjkef";

        strCount(str2);

        String s3 = "race";
        String s4 = "care";
        System.out.println(Anagram(s3, s4));

    }
}

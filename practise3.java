public class practise3 {

    public static int averageNum(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void palindrom(int Num) {
        int rev = 0;
        int ogNum = Num;

        while (Num > 0) {
            int lastdigit = Num % 10;
            rev = (rev * 10) + lastdigit;
            Num /= 10;
        }

        if (rev == ogNum) {
            System.out.println("the number is " + ogNum + " Palindrom ");
        } else {
            System.out.println("the number is not " + ogNum + " Palindrom ");
        }
    }

    public static int sumOfdigit(int num) {
        int sum = 0;
        while (num > 0) {
            int lastdigit = num % 10;
            sum = sum + lastdigit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(averageNum(3, 4, 5));
        System.out.println(isEven(2));
        palindrom(1234);
        System.out.println(sumOfdigit(123));
    }
}

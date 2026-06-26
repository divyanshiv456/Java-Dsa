public class conver {

    // conversion from binary to decimal
    public static void BinNumToDeci(int binNum) {
        int num = binNum;
        int pow = 0;
        int decimal = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decimal = decimal + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of " + num + " is " + decimal);
    }

    // conversion of Decimal to binary
    public static void decTobin(int decimal) {
        int pow = 0;
        int binNum = 0;
        int mynum = decimal;

        while (decimal > 0) {
            int rem = decimal % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            decimal = decimal / 2;
        }
        System.out.println("binary of " + mynum + " is " + binNum);
    }

    public static void main(String[] args) {
        int n = 101;
        BinNumToDeci(n);
        decTobin(8);
    }
}

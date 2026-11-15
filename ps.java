
public class ps {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 7, 8, 9, 5, 2 };
        System.out.println(firstOccurence(arr, 5, 0));

        System.out.println(lastOccurence(arr, 5, 0));

        System.out.println(power(2, 10));

        System.out.println(optimizedPower(2, 5));
    }

    // WAP to find the first occurrence of an element in an array
    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }

    // WAP to find the last occurrence of an element in an array
    public static int lastOccurence(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }

        int isFound = lastOccurence(arr, key, i + 1);

        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int optimizedPower(int a, int n) { // O(logn)
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        // if n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }
}
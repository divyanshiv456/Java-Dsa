import java.util.*;

public class reversearry {

    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void pairsInArray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
            }
            System.out.println();
        }
    }

    public static void printSubarray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void MaxSubarray(int numbers[]) {
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    // Sum of numbers of subarray
                    currSum += numbers[k];
                }
                if (MaxSum < currSum) {
                    MaxSum = currSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.print(MaxSum);
    }

    public static void prefixSubarray(int numbers[]) {
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // calclate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (MaxSum < currSum) {
                    MaxSum = currSum;
                }
            }
        }
        System.out.print("max sum : " + MaxSum);
    }

    public static void KadanesAlgo(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < numbers.length; i++) {

            currSum = currSum + numbers[i];

            if (currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Max sum of subarray is : " + maxSum);
    }

    public static void main(String[] args) {
        // int numbers[] = { 2, 4, 6, 8, 10 };
        // reverse(numbers);

        // for (int i = 0; i < numbers.length; i++) {
        // System.out.print(numbers[i] + " ");
        // }

        // System.out.println();

        // pairsInArray(numbers);

        // printSubarray(numbers);

        // MaxSubarray(numbers);

        // System.out.println();

        // prefixSubarray(numbers);

        int nums[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

        KadanesAlgo(nums);
    }
}

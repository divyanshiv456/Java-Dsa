public class linearsearch {

    public static int linearsearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                System.out.println("target key is : " + i);
                return i;
            }
        }
        return -1;
    }

    public static int largestnumber(int numbers[]) {

        int largestnumber = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= largestnumber) {
                largestnumber = numbers[i];
            } else {
                return -1;
            }
        }
        return largestnumber;
    }

    public static int smallestnumber(int numbers[]) {

        int smallestnumber = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallestnumber) {
                smallestnumber = numbers[i];
            }
        }
        return smallestnumber;
    }

    public static void main(String[] args) {
        int numbers[] = { 0, 2, 4, 6, 8, 9, 10, 12, 13, 16 };

        // linear Search
        // int key = 4;
        // int index = linearsearch(numbers, key);
        // if (index == -1) {
        // System.out.print("NOT FOUND");
        // } else {
        // System.out.println("key found : " + index);
        // }

        // largestnumber
        int num = largestnumber(numbers);
        System.out.println("largest number is : " + num);
        int nums = smallestnumber(numbers);
        System.out.println("smallest number is : " + nums);
    }
}

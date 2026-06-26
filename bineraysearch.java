public class bineraysearch {

    public static int binearySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) { // right
                start = mid + 1;
            } else {
                end = mid - 1; // left
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 0, 2, 4, 6, 8, 9, 10, 12, 13, 16 };
        int key = 12;
        int target = binearySearch(numbers, key);
        System.out.println(" the target is : " + target);
    }
}

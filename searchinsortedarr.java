public class searchinsortedarr {

    public static boolean staircaseSearh(int matrix[][], int key) {
        int row = 0, col = matrix.length - 1;
        while (col >= 0 && row < matrix.length) {
            if (matrix[row][col] == key) {
                System.out.println("found key at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("key not found!");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        int matrix2[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };

        int target = 3;

        int key = 100;
        staircaseSearh(matrix, key);

        staircaseSearh(matrix2, target);

    }
}

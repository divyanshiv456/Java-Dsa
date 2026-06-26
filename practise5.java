public class practise5 {
    public static int countof7s(int matrix[][]) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println("count of 7 : " + count);
        return count;
    }

    public static int sumofrow(int matrix[][]) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == 1) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("sum of second row : " + sum);
        return sum;
    }

    public static void Transpose(int matrix[][]) {
        int row = 2, col = 3;
        int transpose[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        printmatrix(transpose);
    }

    public static void printmatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 4, 4, 7 },
                { 8, 5, 7 } };

        countof7s(matrix);

        int nums[][] = { { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 } };

        sumofrow(nums);

        int mat[][] = { { 2, 3, 8 },
                { 4, 5, 7 }
        };

        printmatrix(mat);

        System.out.println();

        Transpose(mat);

    }
}

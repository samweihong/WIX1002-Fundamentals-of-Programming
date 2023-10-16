package lab05;

public class Q4InPlaceGeneral {
    public static void main(String[] args) {
        // Assume the matrix is a square matrix.
        int[][] matrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int N = matrix.length;
        System.out.printf("%1$d by %1$d Matrix\n", N);
        for (int[] row : matrix) {
            for (int i : row)
                System.out.printf("%2d ", i);
            System.out.println();
        }

        System.out.println("After rotates 90 degrees clockwise");
        for (int i = 0; i < (N + 1) / 2; i++)
            for (int j = 0; j < N / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[N - 1 - j][i];
                matrix[N - 1 - j][i] = matrix[N - 1 - i][N - 1 - j];
                matrix[N - 1 - i][N - 1 - j] = matrix[j][N - 1 - i];
                matrix[j][N - 1 - i] = temp;
            }

        for (int[] row : matrix) {
            for (int i : row)
                System.out.printf("%2d ", i);
            System.out.println();
        }
    }
}

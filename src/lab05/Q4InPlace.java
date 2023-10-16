package lab05;

public class Q4InPlace {
    public static void main(String[] args) {
        // Assume the matrix is a square matrix.
        int[][] matrix = {{1, 5, 7}, {3, 6, 9}, {5, 3, 8}};
        System.out.println("3 by 3 Matrix");
        for (int[] row : matrix) {
            for (int i : row)
                System.out.print(i + " ");
            System.out.println();
        }

        System.out.println("After rotates 90 degrees clockwise");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[2 - j][i];
                matrix[2 - j][i] = matrix[2 - i][2 - j];
                matrix[2 - i][2 - j] = matrix[j][2 - i];
                matrix[j][2 - i] = temp;
            }

        for (int[] row : matrix) {
            for (int i : row)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}

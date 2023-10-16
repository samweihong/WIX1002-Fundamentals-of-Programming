package lab05;

public class Q4General {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        int M = matrix.length;
        int N = matrix[0].length;

        System.out.printf("%d by %d Matrix\n", M, N);
        for (int[] row : matrix) {
            for (int i : row)
                System.out.printf("%2d ", i);
            System.out.println();
        }

        System.out.println("After rotates 90 degrees clockwise");
        int[][] rotatedMatrix = new int[N][M];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                rotatedMatrix[i][j] = matrix[M - 1 - j][i];

        for (int[] row : rotatedMatrix) {
            for (int i : row)
                System.out.printf("%2d ", i);
            System.out.println();
        }
    }
}

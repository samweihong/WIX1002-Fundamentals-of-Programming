package lab05;

import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        int N = 20;
        int maxLength = String.valueOf(N).length();

        Random random = new Random();
        int[][] workHours = new int[N][7];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < 7; j++)
                workHours[i][j] = random.nextInt(8) + 1;

        System.out.print(" ".repeat(maxLength + 2));
        System.out.println("S M T W T F S Total");
        for (int i = 0; i < N; i++) {
            System.out.printf("%" + maxLength + "d. ", i + 1);
            int totalHours = 0;
            for (int j = 0; j < 7; j++) {
                int hours = workHours[i][j];
                System.out.print(hours + " ");
                totalHours += hours;
            }
            System.out.printf("%5d\n", totalHours);
        }
    }
}

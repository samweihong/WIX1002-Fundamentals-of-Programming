package lab04;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int N = 0;
        int sum = 0;
        int sumSquared = 0;

        while (true) {
            System.out.print("Enter a score [negative score to quit]:");
            score = scanner.nextInt();
            if (score < 0) break;

            if (score < min) min = score;
            if (score > max) max = score;
            // Alternatives:
            // min = Math.min(min, score);
            // max = Math.max(max, score);
            N++;
            sum += score;
            sumSquared += score * score;
        }
        double s2 = (sumSquared - 1.0 * sum * sum / N) / (N - 1);
        System.out.println(s2);
        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);
        System.out.printf("Average Score: %.2f\n", 1.0 * sum / N);
        System.out.printf("Standard Deviation: %.2f\n", Math.sqrt(s2));
    }
}

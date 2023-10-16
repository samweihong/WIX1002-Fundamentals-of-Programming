package lab04;

import java.util.Random;

public class Q5 {
    public static void main(String[] args) {
        Random random = new Random();
        int dice;
        int sum1 = 0;
        int sum2 = 0;

        for (int round = 1; ; round++) {
            System.out.println("Round " + round);
            do {
                sum1 += dice = random.nextInt(6) + 1;
                System.out.println("Player 1 rolls a " + dice + ", total score " + sum1);
                if (sum1 > 100) break;
            } while (dice == 6);

            if (sum1 > 100) break;

            do {
                sum2 += dice = random.nextInt(6) + 1;
                System.out.println("Player 2 rolls a " + dice + ", total score " + sum2);
            } while (dice == 6);

            if (sum2 > 100) break;
            System.out.println();
        }
        System.out.println();
        System.out.println("Player 1 Score: " + sum1);
        System.out.println("Player 2 Score: " + sum2);
        System.out.println("Player " + (sum1 > 100 ? 1 : 2) + " wins!");
    }
}

package lab03;

import java.util.Random;

public class Q4 {
    public static void main(String[] args) {
        Random random = new Random();
        int dice;
        System.out.println("Round 1");
        int sum1 = dice = random.nextInt(6) + 1;
        System.out.println("Player 1: " + dice);
        int sum2 = dice = random.nextInt(6) + 1;
        System.out.println("Player 2: " + dice);

        System.out.println();

        System.out.println("Round 2");
        sum1 += dice = random.nextInt(6) + 1;
        System.out.println("Player 1: " + dice);
        sum2 += dice = random.nextInt(6) + 1;
        System.out.println("Player 2: " + dice);

        System.out.println();

        System.out.println("Player 1 Total Score: " + sum1);
        System.out.println("Player 2 Total Score: " + sum2);
        if (sum1 == sum2) System.out.println("Tie.");
        else System.out.println("Player " + (sum1 > sum2 ? 1 : 2) + " wins the game!");
    }
}

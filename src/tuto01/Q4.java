package tuto1;

import java.util.Random;

public class Q4 {

    public static void main(String[] arg) {
        Random random = new Random();
        int p1 = random.nextInt(6) + 1;
        int p2 = random.nextInt(6) + 1;

        System.out.println("Player 1 : " + p1);
        System.out.println("Player 2 : " + p2);

        if      (p1 == p2) System.out.println("Tie.");
        else if (p1 >  p2) System.out.println("Player 1 wins.");
        else               System.out.println("Player 2 wins.");
    }
}

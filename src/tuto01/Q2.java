package tuto1;

import java.util.Random;

public class Q2 {

    public static void main(String[] arg) {
        Random random = new Random();
        int x = random.nextInt(100);

        if (x > 50) System.out.println("True");
        else        System.out.println("False");
    }
}

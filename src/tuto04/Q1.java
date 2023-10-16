package tuto4;

import java.util.Random;

public class Q1 {

    public static void main(String[] args) {
        // a
        for (int n = 0; true; n++)
            if (Math.pow(n, 3) >= 2000) {
                System.out.println(--n);
                break;
            }

        // b
        for (int i = 1; i <= 12; i++)
            System.out.print(i*i + " ");
        System.out.println();

        // c
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++)
                System.out.printf("%3d\s", random.nextInt(101));
            System.out.println();
        }

        // d
        int givenNumber = 100, sum = 0;
        for (int i = 1; i <= givenNumber; i++)
            sum += i;
        System.out.println(sum);

        // Or, without repetition
        System.out.println(givenNumber * (givenNumber+1) / 2);

        // e
        double total = 0;
        for (int p = 1; p <= 25; p++)
            total += p / (26.0 - p);
        System.out.println(total);
    }
}

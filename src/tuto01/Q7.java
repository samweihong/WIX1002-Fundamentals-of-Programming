package tuto1;

import java.util.Random;

public class Q7 {

    public static void main(String[] args) {
        int odd = 0, even = 0;
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int num = 10 + random.nextInt(91);
            if (num % 2 == 1) odd++;
            else              even++;
        }
        System.out.println("Number of odd numbers: " + odd);
        System.out.println("Number of even numbers: " + even);
    }
}

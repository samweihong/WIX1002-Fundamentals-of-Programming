package tuto1;

import java.util.Random;

public class Q6 {

    public static void main(String[] args) {
        Random random = new Random();
        int min = random.nextInt(100);

        for (int i = 0; i < 9; i++) {
            int num = random.nextInt(100);
            if (num < min) min = num;
        }
        System.out.println(min);
    }
}

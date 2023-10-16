package tuto5;

import java.util.Random;

public class Q6 {

    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(256);
        System.out.println("Decimal Number: " + num);

        int[] array = new int[8];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = num % 2;
            num /= 2;
        }

        System.out.print("Binary Number: ");
        for (int i : array)
            System.out.print(i);

        // Dr's answer
        /*
        Random random = new Random();
        int r = random.nextInt(256);
        System.out.println(r);
        boolean[] bits = new boolean[8];

        for (int i = 0; i < 8; i++) {
            int num = 128;
            num = num >> i;
            bits[i] = (r & num) != 0;
        }

        for (boolean bit : bits)
            if (bit) System.out.print(1);
            else System.out.print(0);
         */
    }
}

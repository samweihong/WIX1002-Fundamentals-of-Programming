package lab02;

import java.util.Random;

public class Q5Back {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10001);
        System.out.println("Number: " + num);

        // Use a, b, ... to denote digits of the number edcba.
        int a = num % 10;
        num /= 10;
        int b = num % 10;
        num /= 10;
        int c = num % 10;
        num /= 10;
        int d = num % 10;
        num /= 10;
        int e = num % 10;
        System.out.println("Sum of digits in the number: " + (a + b + c + d + e));
    }
}

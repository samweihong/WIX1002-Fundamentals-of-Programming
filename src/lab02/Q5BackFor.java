package lab02;

import java.util.Random;

public class Q5BackFor {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10001);
        System.out.println("Number: " + num);

        // Convert the number to a string and access each digit using charAt.
        int sum = 0;
        for (; num > 0; num /= 10) sum += num % 10; // You may also create a new variable to preserve the value of num.
        System.out.println("Sum of digits in the number: " + sum);
    }
}

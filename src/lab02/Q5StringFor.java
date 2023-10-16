package lab02;

import java.util.Random;

public class Q5StringFor {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10001);
        System.out.println("Number: " + num);

        // Convert the number to a string and access each digit using charAt.
        int sum = 0;
        String numString = "" + num;
        for (int i = 0; i < numString.length(); i++)
            sum += numString.charAt(i) - '0';
        System.out.println("Sum of digits in the number: " + sum);
    }
}

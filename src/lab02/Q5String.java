package lab02;

import java.util.Random;

public class Q5String {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10001);
        System.out.println("Number: " + num);

        // Convert the number to a string and access each digit using charAt.
        String numString = "" + num;
        int sum = numString.charAt(0) - '0';
        if (numString.length() > 1) sum += numString.charAt(1) - '0';
        if (numString.length() > 2) sum += numString.charAt(2) - '0';
        if (numString.length() > 3) sum += numString.charAt(3) - '0';
        if (numString.length() > 4) sum += numString.charAt(4) - '0';
        System.out.println("Sum of digits in the number: " + sum);
    }
}

package finalexam.Q1;

import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10000) + 1;
        int reverse = reverse(num);
        int sumOfDigits = numberOfDigits(num) + numberOfDigits(reverse);
        System.out.println("Generated number: " + num);
        System.out.println("Number in reverse order: " + reverse);
        System.out.println("The sum of all integers: " + sumOfDigits);
    }

    public static int reverse(int num) {
        int res = 0;
        while (num > 0) {
            res = 10 * res + num % 10;
            num /= 10;
        }
        return res;
    }

    public static int numberOfDigits(int num) {
        if (num == 0) return 1;
        int res = 0;
        while (num > 0) {
            ++res;
            num /= 10;
        }
        return res;
    }
}

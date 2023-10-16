package lab04;

import java.util.Random;

public class Q8 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(101);
        System.out.println("The first " + n + " prime numbers:");
        
        // Generate first n prime number.
        // i : Number of prime numbers generated.
        // num : Current integer.
        for (int i = 0, num = 2; i < n; num++) {
            boolean isPrime = true;

            // Check if num is a prime.
            // A number is not prime if it has factor other than 1 and itself.
            for (int x = 2; x * x <= num; x++) {
                if (num % x == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                i++;
            }
        }
    }
}

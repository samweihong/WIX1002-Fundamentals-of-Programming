package lab04;

import java.util.Random;

public class Q8Label {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(101);
        System.out.println("The first " + n + " prime numbers:");

        // Generate first n prime number.
        // i : Number of prime numbers generated.
        // num : Current integer.
        outer:
        for (int i = 0, num = 2; i < n; num++) {
            // Check if num is a prime.
            // A number is not prime if it has factor other than 1 and itself.
            for (int x = 2; x * x <= num; x++)
                if (num % x == 0)
                    continue outer;
            
            System.out.print(num + " ");
            i++;
        }
    }
}

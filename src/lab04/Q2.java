package lab04;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        // total : output required
        // sum : sum of integers from 1 to i
        int total = 0;
        for (int i = 1, sum = 0; i <= n; i++) {
            sum += i;
            total += sum;
        }
        System.out.println(total);
    }
}

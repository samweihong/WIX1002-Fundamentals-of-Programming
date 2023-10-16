package lab04;

import java.util.Scanner;

public class Q2Formula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        System.out.println(n * (n + 1) * (n + 2) / 6);
    }
}

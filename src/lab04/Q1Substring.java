package lab04;

import java.util.Scanner;

public class Q1Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int num = scanner.nextInt();

        System.out.print("The factors are: ");
        String factors = "";
        for (int i = 1; i <= num; i++)
            if (num % i == 0) factors += i + ", ";
        System.out.println(factors.substring(0, factors.length() - 2));
    }
}

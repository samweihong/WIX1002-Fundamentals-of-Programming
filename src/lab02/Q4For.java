package lab02;

import java.util.Scanner;

public class Q4For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int total = scanner.nextInt();

        // Inefficient solution
        int temp = total;
        int hour = 0;
        for (; temp >= 3600; temp -= 3600, hour++) ;
        int minute = 0;
        for (; temp >= 60; temp -= 60, minute++) ;
        int second = temp;

        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds\n", total, hour, minute, second);
    }
}

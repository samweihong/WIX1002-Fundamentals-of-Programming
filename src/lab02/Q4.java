package lab02;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int total = scanner.nextInt();

        int hour = total / 3600;
        int minute = (total % 3600) / 60;
        int second = total % 60;

        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds\n", total, hour, minute, second);
    }
}

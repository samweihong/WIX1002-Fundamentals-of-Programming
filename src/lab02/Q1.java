package lab02;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a temperature in degree Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.printf("The temperature in degree Celsius: %.2f\n", celsius);
    }
}

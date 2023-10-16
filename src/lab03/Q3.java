package lab03;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sales volume: ");
        double salesVolume = scanner.nextDouble();

        double commissionPercentage;
        if (salesVolume <= 100) commissionPercentage = .05;
        else if (salesVolume > 100 && salesVolume <= 500) commissionPercentage = .075;
        else if (salesVolume <= 1000) commissionPercentage = 0.1;
        else commissionPercentage = 0.125;

        System.out.printf("Commission: %.2f\n", commissionPercentage * salesVolume);
    }
}

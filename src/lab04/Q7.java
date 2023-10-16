package lab04;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double P = scanner.nextDouble();
        System.out.print("Enter interest in %: ");
        double i = scanner.nextDouble();
        System.out.print("Enter total number of month(s): ");
        double N = scanner.nextInt();
        System.out.printf("Month%1$sMonthly Payment%1$sPrincipal%1$sInterest%1$sUnpaid Balance%1$sTotal Interest\n", " ".repeat(6));

        double M = (P * i / 1200) / (1 - Math.pow(1 + i / 1200, -N));
        double totalInterest = 0;

        for (int n = 1; n <= N; n++) {
            double C = M * Math.pow(1 + i / 1200, -1 - N + n);
            double L = M - C;
            double R = 1200 * L / i - C;
            totalInterest += L;
            System.out.printf("%-5d%21.2f%15.2f%14.2f%20.2f%20.2f\n", n, M, C, L, R, totalInterest);
        }
    }
}

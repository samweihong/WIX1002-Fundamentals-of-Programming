package lab03;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        int det = a * d - b * c;
        if (det == 0)
            System.out.println("The equation has no solution");
        else {
            double x = 1.0 * (e * d - b * f) / det;
            double y = 1.0 * (a * f - e * c) / det;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}

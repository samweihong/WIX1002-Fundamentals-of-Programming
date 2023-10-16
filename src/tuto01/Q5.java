package tuto1;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length : ");
        double length = scanner.nextDouble();
        System.out.print("Width : ");
        double width  = scanner.nextDouble();
        double perimeter = 2 * (length + width);

        System.out.println(perimeter);
    }
}

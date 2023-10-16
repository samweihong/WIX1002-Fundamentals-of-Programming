package lab03;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int radius = scanner.nextInt();
        System.out.print("Enter the coordinate point (x, y): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        double distance = Math.sqrt(x * x + y * y);
        if (distance == radius)
            System.out.println("The point is on the circle.");
        else
            System.out.println("The point is " + (distance < radius ? "inside" : "outside") + " the circle.");
    }
}

package lab03;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.print("Enter the operand: ");
        char op = scanner.next().charAt(0);

        System.out.printf("%d %c %d = ", x, op, y);
        switch (op) {
            case '+' -> System.out.println(x + y);
            case '-' -> System.out.println(x - y);
            case '*' -> System.out.println(x * y);
            case '/' -> System.out.println(x / y);
            case '%' -> System.out.println(x % y);
        }
    }
}

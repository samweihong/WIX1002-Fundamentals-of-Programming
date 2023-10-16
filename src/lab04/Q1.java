package lab04;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int num = scanner.nextInt();

        System.out.print("The factors are: ");
        for (int i = 1; i <= num / 2; i++)
            if (num % i == 0)
                System.out.print(i + ", ");
        System.out.println(num);
    }
}

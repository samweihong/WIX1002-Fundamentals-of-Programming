package lab08.Q7;

import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        Random random = new Random();
        double money1 = random.nextDouble() * 100;
        money1 = Math.round(money1 * 100) / 100.0;
        System.out.printf("Money 1: %.2f\n", money1);
        Money first = new Money(money1);
        System.out.println("First Money:");
        System.out.println(first);
        System.out.println();

        double money2 = random.nextDouble() * 100;
        money2 = Math.round(money2 * 100) / 100.0;
        System.out.printf("Money 2: %.2f\n", money2);
        Money second = new Money(money2);
        System.out.println("Second Money:");
        System.out.println(second);
        System.out.println();

        System.out.println("Second Money Subtract First Money:");
        second.subtract(first);
        System.out.println(second);
        System.out.println();

        System.out.println("First Money Add Second Money:");
        first.add(second);
        System.out.println(first);
    }
}

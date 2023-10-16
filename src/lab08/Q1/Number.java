package lab08.Q1;

import java.util.Random;

public class Number {
    private int[] numbers;

    public Number() {
        this(10);
    }

    public Number(int N) {
        this(N, 100);
    }

    public Number(int N, int max) {
        Random random = new Random();
        numbers = new int[N];
        for (int i = 0; i < N; i++)
            numbers[i] = random.nextInt(max + 1);
    }

    public void displayAll() {
        displayAllNumbers();
        displayEvenNumbers();
        displayPrimeNumbers();
        displayMaximumNumber();
        displayMinimumNumber();
        displayAverageNumber();
        displaySquareNumber();
    }

    public void displayAllNumbers() {
        System.out.print("All numbers: ");
        for (int num : numbers)
            System.out.print(num + " ");
        System.out.println();
    }

    public void displayEvenNumbers() {
        System.out.print("Even numbers: ");
        for (int num : numbers)
            if (num % 2 == 0)
                System.out.print(num + " ");
        System.out.println();
    }

    public void displayPrimeNumbers() {
        System.out.print("Prime numbers: ");
        arrayLoop:
        for (int num : numbers) {
            if (num < 2) continue;
            for (int i = 2; i * i <= num; i++)
                if (num % i == 0)
                    continue arrayLoop;
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void displayMaximumNumber() {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++)
            max = Math.max(max, numbers[i]);
        System.out.println("Maximum number: " + max);
    }

    public void displayMinimumNumber() {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++)
            min = Math.min(min, numbers[i]);
        System.out.println("Minimum number: " + min);
    }

    public void displayAverageNumber() {
        int sum = 0;
        for (int num : numbers)
            sum += num;
        System.out.println("Average number: " + (1.0 * sum / numbers.length));
    }

    public void displaySquareNumber() {
        System.out.print("Square number: ");
        for (int num : numbers) {
            double root = Math.sqrt(num);
            if (root == (int) root)
                System.out.print(num + " ");
        }
        System.out.println();
    }
}

package tuto2;

import java.util.Random;
import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        Random random = new Random();
        int randNum = random.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess the number: ");
        int num = scanner.nextInt();

        while(num != randNum) {
            System.out.println("Wrong Guess");
            System.out.print("Guess the number: ");
            num = scanner.nextInt();
        }
        System.out.println("Correct Guess");
    }
}

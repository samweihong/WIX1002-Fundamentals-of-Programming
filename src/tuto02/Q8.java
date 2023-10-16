package tuto2;

import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String sentence = scanner.nextLine();

        int count = 0;

        for (char i : sentence.toCharArray())
            if (i == 'U' || i == 'u' || i == 'M' || i == 'm')
                count++;

        System.out.println("Number of alphabet U and M: " + count);
    }
}

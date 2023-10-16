package lab03;

import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(6);
        String word = switch (num) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            default -> "";
        };
        System.out.printf("%d is %s.\n", num, word);
    }
}

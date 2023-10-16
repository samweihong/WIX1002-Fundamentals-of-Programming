package lab04;

import java.util.Random;

public class Q6String {
    public static void main(String[] args) {
        Random random = new Random();
        int num = Math.abs(random.nextInt());
        System.out.println(num);
        System.out.println("Number of digits: " + String.valueOf(num).length());
    }
}

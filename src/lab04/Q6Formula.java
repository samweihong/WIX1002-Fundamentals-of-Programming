package lab04;

import java.util.Random;

public class Q6Formula {
    public static void main(String[] args) {
        Random random = new Random();
        int num = Math.abs(random.nextInt());
        System.out.println(num);

        if (num == 0)
            System.out.println("Number of digits: 1");
        else
            System.out.println("Number of digits: " + (int) (Math.log10(num) + 1));
    }
}

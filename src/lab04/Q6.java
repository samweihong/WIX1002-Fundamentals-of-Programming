package lab04;

import java.util.Random;

public class Q6 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = Math.abs(random.nextInt());
        System.out.println(num);

        if (num == 0)
            System.out.println("Number of digits: 1");
        else {
            int length = 0;
            for (int n = num; n > 0; n /= 10) length++;
            System.out.println("Number of digits: " + length);
        }
    }
}

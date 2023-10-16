package tuto2;

import java.util.Random;

public class Q11 {

    public static void main(String[] args) {
        Random random = new Random();

        int[] num = new int[5];
        for (int i = 0; i < 5; i++)
            num[i] = random.nextInt(20);

        for (int i = 0; i < 5; i++) {
            int max = i;
            for (int j = i+1; j < 5; j++)
                if (num[j] > num[max])
                    max = j;
            int temp = num[i];
            num[i] = num[max];
            num[max] = temp;
        }

        for (int i = 0; i < 5; i++)
            System.out.print(num[i] + " ");
    }
}

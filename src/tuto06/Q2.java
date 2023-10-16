package tuto6;

import java.util.Random;

public class Q2 {

    public static void main(String[] args) {
        Random random = new Random();
        int max = 10;
        int length = 15;
//        for (int i = 0; i < 10; i++) {
//            displayDescending(random.nextInt(max), random.nextInt(max), random.nextInt(max));
//            System.out.println();
//        }

        for (int i = 0; i < 10; i++) {
            int[] a = new int[length];
            for (int j = 0; j < length; j++)
                a[j] = random.nextInt(max);
            descendingBS(a);

            for (int j : a)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    public static void descendingBS(int[] a) {
        for (int pass = 1; pass < a.length; pass++)
            for (int i = 0; i < a.length-1; i++)
                if (a[i] < a[i+1]) {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
    }

    public static void displayDescending(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.print(a + " ");
            displayDescending(b, c);
        }
        else if (b >= a && b >= c) {
            System.out.print(b + " ");
            displayDescending(a, c);
        }
        else {
            System.out.print(c + " ");
            displayDescending(a, b);
        }
    }

    public static void displayDescending(int a, int b) {
        if (a >= b) System.out.print(a + " " + b);
        else System.out.print(b + " " + a);
    }
}

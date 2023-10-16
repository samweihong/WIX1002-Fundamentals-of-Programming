package tuto6;

import java.util.Random;

public class Q1 {

    public static void main(String[] args) {
        System.out.println(max(5,5, 2));

        for (int i = 0; i < 100; i++) {
            if (isSquare(i)) System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(C(125,30));

        for (int i = 0; i < 500; i++) {
            if (isPentagonal(i)) System.out.print(i + " ");
        }
        System.out.println();

        String s = "Wawasan 2020";
        System.out.println(lettersAndDigitsCount(s)[0]);
        System.out.println(lettersAndDigitsCount(s)[1]);

        int[] a = new int[10];
        generateRandom(a);
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();

        int radius = 10;
        System.out.println(areaCircumference(radius)[0]);
        System.out.println(areaCircumference(radius)[1]);

        System.out.println(generatedTwice());
    }

    // a.
    public static int max(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= a && b >= c) return b;
        return c;
    }

    // b.
    public static boolean isSquare(int i) {
        double root = Math.sqrt(i);
        return root == (int) root;
    }

    // c.
    public static double C(int n, int k) {
        return factorial(n)/(factorial(k) * factorial(n-k));
    }

    public static double factorial(int i) {
        double num = 1;
        while (i > 0)
            num *= i--;
        return num;
    }

    // d.
    public static boolean isPentagonal(int num) {
        double root = (1 + Math.sqrt(1 + 24 * num)) / 6;
        return (int) root == root;
    }

    // e.
    public static int[] lettersAndDigitsCount(String s) {
        int[] letterDigit = new int[2];
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) letterDigit[0]++;
            else if (Character.isDigit(c)) letterDigit[1]++;
        }
        return letterDigit;
    }

    // f.
    public static void generateRandom(int[] a) {
        Random random = new Random();
        for (int i = 0; i < 10; i++)
            a[i] = random.nextInt(101);
    }

    // g.
    public static double[] areaCircumference(int radius) {
        return new double[]{
                Math.PI * radius * radius,
                2 * Math.PI * radius};
    }

    // h.
    public static int generatedTwice() {
        Random random = new Random();
        boolean[] generated = new boolean[11];

        while (true) {
            int i = random.nextInt(11);
            // System.out.print(i + " ");
            if (generated[i]) return i;
            generated[i] = true;
        }
    }



}

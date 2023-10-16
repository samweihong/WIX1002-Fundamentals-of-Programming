package lab06;

public class Q2 {
    public static void main(String[] args) {
        int row = 7;

        System.out.println("Triangle 1");
        for (int i = 1; i <= row; i++) {
            multiPrint(i, '*');
            System.out.println();
        }
        System.out.println();

        System.out.println("Triangle 2");
        for (int i = 1; i <= row; i++) {
            multiPrint(row - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }
        System.out.println();

        System.out.println("Triangle 3");
        for (int i = 1; i <= row; i++) {
            multiPrint(Math.min(i, row + 1 - i), '*');
            System.out.println();
        }
        System.out.println();

        System.out.println("Diamond");
        for (int i = 1; i <= row; i++) {
            int min = Math.min(i, row + 1 - i);
            multiPrint(row / 2 - min + 1, ' ');
            multiPrint(2 * min - 1, '*');
            System.out.println();
        }
        System.out.println();
    }

    public static void multiPrint(int n, char c) {
        for (int i = 0; i < n; i++)
            System.out.print(c);
    }

    // Alternative
//    public static void multiPrint(int n, char c) {
//        System.out.print(String.valueOf(c).repeat(n));
//    }
}

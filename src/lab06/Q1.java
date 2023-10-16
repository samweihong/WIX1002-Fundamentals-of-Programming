package lab06;

public class Q1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++)
            System.out.print(triangularNumber(i) + " ");
        System.out.println();
    }

    // Return the nth triangular number.
    public static int triangularNumber(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++)
            res += i;
        return res;
    }

    // Alternative
//    public static int triangularNum(int n) {
//        return n * (n + 1) / 2;
//    }
}

package lab06;

public class Q4Recursion {
    public static void main(String[] args) {
        System.out.println(gcd(24, 8));
        System.out.println(gcd(200, 625));
    }

    public static int gcd(int i, int j) {
        return j == 0 ? i : gcd(j, i % j);
    }
}

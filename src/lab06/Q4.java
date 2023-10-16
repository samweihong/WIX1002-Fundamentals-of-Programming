package lab06;

public class Q4 {
    public static void main(String[] args) {
        System.out.println(gcd(24, 8));
        System.out.println(gcd(200, 625));
    }

    public static int gcd(int i, int j) {
        while (j > 0) {
            int temp = i % j;
            i = j;
            j = temp;
        }
        return i;
    }
}

package lab06;

public class Q6 {
    public static void main(String[] args) {
        System.out.println("First 20 palindromic prime: ");
        for (int count = 0, i = 0; count < 20; i++) {
            if (isPalindromicPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();

        System.out.println("First 20 emirp: ");
        for (int count = 0, i = 0; count < 20; i++) {
            if (isEmirp(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++)
            if (num % i == 0) return false;
        return true;
    }

    public static int reverse(int num) {
        int reverse = 0;
        for (; num > 0; num /= 10)
            reverse = (10 * reverse) + (num % 10);
        return reverse;
    }

    public static boolean isPalindrome(int num) {
        return num == reverse(num);
    }

    public static boolean isPalindromicPrime(int num) {
        return isPrime(num) && isPalindrome(num);
    }

    public static boolean isEmirp(int num) {
        return isPrime(num) && isPrime(reverse(num)) && !isPalindrome(num);
    }
}

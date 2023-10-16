package tuto4;

public class Q3 {

    public static void main(String[] args) {
        int prev = 0;
        int current = 1;

        for (int i = 0; i < 10; i++) {
            System.out.print(current + " ");

            int newValue = prev + current;
            prev = current;
            current = newValue;
        }
    }
}

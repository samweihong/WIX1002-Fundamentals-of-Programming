package tuto8;

public class Q2 {

    public static void main(String[] args) {
        // f.
        Digit digit = new Digit(4567);
        digit.displayDigitMultiplication();
    }
}

// a.
class Digit {

    // b.
    private int number;

    // c.
    public Digit(int number) {
        this.number = number;
    }

    // d.
    public int digitMultiplication() {
        int product = 1;
        String s = "" + number;
        for (int i = 0; i < s.length(); i++)
            product *= Character.getNumericValue(s.charAt(i));
        return product;
    }

    // e.
    public void displayDigitMultiplication() {
        System.out.println(digitMultiplication());
    }
}

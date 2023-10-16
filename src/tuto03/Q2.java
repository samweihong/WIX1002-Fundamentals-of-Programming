package tuto3;

public class Q2 {

    public static void main(String[] args) {
        // a
        int num1 = 5, num2 = 5; // For testing purposes.

        if (num1 == num2) // = is used for assignment; == is used for comparison.
            System.out.println("Number 1 is equal to number 2.");

        // b
        int x = 3, y = 2, z = 1; // For testing purposes.

        if (x > y && y > z) // && is used for combining two comparison expressions.
            System.out.println("x is the largest number");

        // c
        String s1 = "S1", s2 = "s1"; // The strings should be initialised before comparison.
        if (s1.equals(s2)) // equals() is used for string comparison.
            System.out.println("They are equal strings.");
        else // No condition required after else.
            System.out.println("They are not equal strings.");

        // d
        // The condition should be in a bracket, also without followed by semicolon.
        // || is used as the or operator.
        if (x>0 || y>0)
            System.out.println("Either x or y is positive");
    }
}

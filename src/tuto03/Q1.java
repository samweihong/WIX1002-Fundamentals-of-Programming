package tuto3;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        // a
        if (3 * 8 == 27) System.out.println("3x8=27");
        else             System.out.println("3x8≠27");

        // b
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 1 || num % 2 == -1) // Including negative numbers.
            System.out.println("The input integer is an odd number");
        else
            System.out.println("The input integer is an even number");

        // c
        char ch = 'C';
        if (Character.isUpperCase(ch))
            System.out.println("The character is a capital letter");
        else
            System.out.println("The character is not a capital letter");

        // d
        String s1 = "University";
        String s2 = "universiti";

        if (s1.compareToIgnoreCase(s2) > 0)
            System.out.println(s2 + " " + s1);
        else
            // Including the case where both strings are equal.
            System.out.println(s1 + " " + s2);

        // e
        Scanner s = new Scanner(System.in);
        int dayNum = s.nextInt();

        String day = "";
        switch (dayNum) {
            case 0: day = "Sunday";    break;
            case 1: day = "Monday";    break;
            case 2: day = "Tuesday";   break;
            case 3: day = "Wednesday"; break;
            case 4: day = "Thursday";  break;
            case 5: day = "Friday";    break;
            case 6: day = "Saturday";
        }
        System.out.println(day);
    }
}

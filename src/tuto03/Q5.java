package tuto3;

public class Q5 {

    public static void main(String[] args) {
        int year = 2021;

        if (year % 400 == 0)
            System.out.println(year + " is a leap year.");
        else if (year % 100 == 0)
            System.out.println(year + " is not a leap year.");
        else if (year % 4 == 0)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");

        // Alternative solution
        boolean isLeapYear = false;
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) isLeapYear = true;

        if(isLeapYear) System.out.println(year + " is a leap year.");
        else           System.out.println(year + " is not a leap year.");
    }
}

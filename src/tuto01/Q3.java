package tuto1;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        int mark;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            try {
                System.out.print("Enter the mark : ");
                mark = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
            }
        }

        if(mark >= 40) System.out.println("Pass");
        else           System.out.println("Fail");
    }
}

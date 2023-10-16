package tuto1;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        double num1, num2;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            try {
                System.out.print("Enter Number 1 : ");
                num1 = Double.parseDouble(scanner.next());
                if(Double.isNaN(num1)) throw new NumberFormatException();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
            }
        }

        while(true) {
            try {
                System.out.print("Enter Number 2 : ");
                num2 = Double.parseDouble(scanner.next());
                if(Double.isNaN(num2)) throw new NumberFormatException();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
            }
        }
        System.out.println("Multiplication of Number 1 and Number 2 : " + num1 * num2);
    }
}

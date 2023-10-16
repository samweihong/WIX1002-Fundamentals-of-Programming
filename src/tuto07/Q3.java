package tuto7;

import java.io.*;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        String s = "FSKTM, University of Malaya";

        try {
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("src/tuto7/data.txt"));

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
//                outputStream.print(Integer.toBinaryString(c) + " ");
                outputStream.print(toBinaryString(c) + " ");
            }
            outputStream.close();

        } catch (IOException e) {
            System.out.println("Error in reading file.");
        }

        try {
            Scanner inputStream = new Scanner(new FileInputStream("src/tuto7/data.txt"));

            while (inputStream.hasNext()) {
                String binaryNumber = inputStream.next();
//                System.out.print((char) Integer.parseInt(binaryNumber, 2));
                System.out.print(toChar(binaryNumber));
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
    }

    public static String toBinaryString(char c) {
        String s = "";
        for (int shift = 1; shift <= c; shift <<= 1)
            s = ((c & shift) != 0 ? 1 : 0) + s;
        return s;
    }

    public static char toChar(String binaryNumber) {
        char c = 0;
        for (int i = binaryNumber.length()-1, power = 1; i >= 0; i--, power *= 2)
            if (binaryNumber.charAt(i) == '1')
                c += power;
        return c;
    }
}

package lab07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        try {
            Scanner inputStream = new Scanner(new FileInputStream("src/lab07/Q3.txt"));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("src/lab07/reverse.txt"));

            while (inputStream.hasNextLine()) {
                String line = inputStream.nextLine();
                String reverse = "";
                for (int i = line.length() - 1; i >= 0; i--)
                    reverse += line.charAt(i);
                outputStream.println(reverse);
            }

            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Error in reading / writing file.");
        }
    }
}

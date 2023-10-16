package lab07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int charNum = 0;
        int wordNum = 0;
        int lineNum = 0;

        try {
            Scanner inputStream = new Scanner(new FileInputStream("src/lab07/Q4.txt"));
            while (inputStream.hasNextLine()) {
                String line = inputStream.nextLine();
                charNum += line.length();
                wordNum += line.split(" ").length;
                lineNum++;
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found.");
        }

        System.out.println("Number of characters: " + charNum);
        System.out.println("Number of words: " + wordNum);
        System.out.println("Number of lines: " + lineNum);
    }
}

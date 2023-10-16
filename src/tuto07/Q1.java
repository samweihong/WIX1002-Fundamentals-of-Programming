package tuto7;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        // a.
        try {
            Random random = new Random();
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("src/tuto7/integer.txt"));

            for (int i = 0; i < 10; i++)
                outputStream.println(random.nextInt(1001));
            outputStream.close();

        } catch (IOException e) {
            System.out.println("Error in writing file.");
        }

        // b.
        try {
            Scanner inputStream = new Scanner(new FileInputStream("src/tuto7/integer.txt"));
            int max = 0;
            while (inputStream.hasNextInt()) {
                int i = inputStream.nextInt();
                System.out.print(i + " ");
                if (i > max) max = i;
            }
            inputStream.close();
            System.out.println();
            System.out.println("Largest integer: " + max);

        } catch (FileNotFoundException e) {
            System.out.println("File was not found.");
        }

        try {
            BufferedReader inputStream = new BufferedReader(new FileReader("src/tuto7/integer.txt"));
            String input;
            int max = 0;
            while ((input = inputStream.readLine()) != null) {
                int i = Integer.parseInt(input);
                System.out.print(i + " ");
                if (i > max) max = i;
            }
            inputStream.close();
            System.out.println();
            System.out.println("Largest integer: " + max);

        } catch (FileNotFoundException e) {
            System.out.println("File was not found.");
        } catch (IOException e) {
            System.out.println("Error in reading file.");
        }

        // c.
        try {
            Random random = new Random();
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/tuto7/integer.dat"));

            for (int i = 0; i < 10; i++)
                outputStream.writeInt(random.nextInt(1001));
            outputStream.close();

        } catch (IOException e) {
            System.out.println("Error in writing file.");
        }

        // d.
        int count = 0, sum = 0;
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/tuto7/integer.dat"));
            while (true) {
                int i = inputStream.readInt();
                System.out.print(i + " ");
                count++;
                sum += i;
            }
        } catch (EOFException e) {
            System.out.println();
            System.out.println("Average: " + (1.0 * sum / count));
        } catch (FileNotFoundException e) {
            System.out.println("File was not found.");
        } catch (IOException e) {
            System.out.println("Error in reading file.");
        }
    }
}

package tuto7;

import java.io.*;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        // a.
        // "/" is used instead of "\" to specify directory
        // PrintWriter out = new PrintWriter(new FileOutputStream("d:/data/matrix.txt"));

        // b.
        // IOException is used instead of FileNotFoundException
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));
            out.close();
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }

        // c.
        // ObjectInputStream should be used for reading binary file.
        try {
            int num;
            ObjectInputStream a = new ObjectInputStream(new FileInputStream("data.dat"));
            num = a.readInt();
            a.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found.");
        } catch (IOException e) {
            System.out.println("Error in reading file.");
        }

        // d.
        // writeChar() should be used for writing binary file.
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("data.dat"));
            o.writeChar('A');
            o.close();
        } catch (IOException e) {
            System.out.println("Error in writing file.");
        }
    }
}

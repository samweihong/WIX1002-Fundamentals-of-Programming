package lab07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Q5ArrayBubbleSort {
    public static void main(String[] args) {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/lab07/person.dat"));
            int N = inputStream.readInt();

            String[][] person = new String[N][3];
            for (int i = 0; i < N; i++) {
                person[i][0] = inputStream.readUTF();
                person[i][1] = String.valueOf(inputStream.readInt());
                person[i][2] = String.valueOf(inputStream.readChar());
            }

            for (int pass = 1; pass < N; pass++)
                for (int i = 0; i < N - pass; i++)
                    if (person[i][0].compareTo(person[i + 1][0]) > 0) {
                        String[] temp = person[i];
                        person[i] = person[i + 1];
                        person[i + 1] = temp;
                    }

            for (int i = 0; i < N; i++)
                System.out.printf("%s %s %s\n", person[i][0], person[i][1], person[i][2]);
        } catch (FileNotFoundException e) {
            System.out.println("File was not found.");
        } catch (IOException e) {
            System.out.println("Error in file reading.");
        }
    }
}

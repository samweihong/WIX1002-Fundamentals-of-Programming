package lab07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Comparator;

public class Q5ArrayJavaSort {
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

            Arrays.sort(person, Comparator.comparing(p -> p[0]));

            for (int i = 0; i < N; i++)
                System.out.printf("%s %s %s\n", person[i][0], person[i][1], person[i][2]);
        } catch (FileNotFoundException e) {
            System.out.println("File was not found.");
        } catch (IOException e) {
            System.out.println("Error in file reading.");
        }
    }
}

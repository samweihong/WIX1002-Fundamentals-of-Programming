package lab07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Q5Index {
    public static void main(String[] args) {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/lab07/person.dat"));
            int N = inputStream.readInt();

            int[] index = new int[N];
            String[] name = new String[N];
            int[] age = new int[N];
            char[] gender = new char[N];

            for (int i = 0; i < N; i++) {
                index[i] = i;
                name[i] = inputStream.readUTF();
                age[i] = inputStream.readInt();
                gender[i] = inputStream.readChar();
            }

            for (int pass = 1; pass < N; pass++)
                for (int i = 0; i < N - pass; i++)
                    if (name[index[i]].compareTo(name[index[i + 1]]) > 0) {
                        int temp = index[i];
                        index[i] = index[i + 1];
                        index[i + 1] = temp;
                    }

            for (int i = 0; i < N; i++)
                System.out.printf("%s %d %c\n", name[index[i]], age[index[i]], gender[index[i]]);
        } catch (FileNotFoundException e) {
            System.out.println("File was not found.");
        } catch (IOException e) {
            System.out.println("Error in file reading.");
        }
    }
}

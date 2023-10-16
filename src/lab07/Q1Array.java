package lab07;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Q1Array {
    public static void main(String[] args) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/lab07/coursename.dat"));
            String[][] courses = {
                    {"WXES1116", "Programming I"},
                    {"WXES1115", "Data Structure"},
                    {"WXES1110", "Operating System"},
                    {"WXES1112", "Computing Mathematics I"}
            };
            for (String[] course : courses)
                for (String courseInfo : course)
                    outputStream.writeUTF(courseInfo);
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Error in writing file.");
        }

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a course code: ");
        String courseCode = userInput.nextLine();
        String[][] courses;
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/lab07/coursename.dat"));
            int N = 0;
            try {
                while (true) {
                    inputStream.readUTF();
                    inputStream.readUTF();
                    N++;
                }
            } catch (EOFException e) {
            }
            inputStream.close();

            inputStream = new ObjectInputStream(new FileInputStream("src/lab07/coursename.dat"));
            courses = new String[N][2];
            for (int i = 0; i < N; i++) {
                courses[i][0] = inputStream.readUTF();
                courses[i][1] = inputStream.readUTF();
            }
            inputStream.close();

            boolean found = false;
            for (String[] course : courses) {
                if (course[0].equals(courseCode)) {
                    System.out.println("Course Name: " + course[1]);
                    found = true;
                    break;
                }
            }
            if (!found) System.out.println("Course code is not found.");

        } catch (FileNotFoundException e) {
            System.out.println("File is not found.");
        } catch (IOException e) {
            System.out.println("Error in reading file.");
        }
    }
}

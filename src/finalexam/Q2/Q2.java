package finalexam.Q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents;
        do {
            System.out.print("Enter the number of students: ");
            numberOfStudents = sc.nextInt();
        } while (isOutOfBounds(0, numberOfStudents, 10));

        int[][] marks = new int[numberOfStudents][];
        for (int i = 1; i <= numberOfStudents; i++) {
            int numberOfSubjects;
            do {
                System.out.printf("Enter the number of subjects for student %d:", i);
                numberOfSubjects = sc.nextInt();
            } while (isOutOfBounds(0, numberOfSubjects, 10));

            int[] studentMarks = new int[numberOfSubjects];
            for (int j = 1; j <= numberOfSubjects; j++) {
                int mark;
                do {
                    System.out.printf("Student (%d) Enter mark for Subject %d:", i, j);
                    mark = sc.nextInt();
                } while (isOutOfBounds(0, mark, 100));
                studentMarks[j - 1] = mark;
            }
            marks[i - 1] = studentMarks;
        }

        int max = -1;
        int maxIndex = 0;
        System.out.printf("List of Student%s (%d student%1$s)\n", (numberOfStudents > 1 ? "s" : ""), numberOfStudents);
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.printf("Student %d\n", i);
            int sum = 0;
            int numberOfSubjects = marks[i - 1].length;
            for (int j = 1; j <= numberOfSubjects; j++) {
                int mark = marks[i - 1][j - 1];
                System.out.printf(" Subject %d:%d\n", j, mark);
                sum += mark;
            }
            if (numberOfSubjects > 0) {
                int average = sum / numberOfSubjects;
                System.out.printf("Average Marks: %d\n", average);
                if (average > max) {
                    max = average;
                    maxIndex = i;
                }
            }
        }
        if (numberOfStudents > 0 && max > -1)
            System.out.printf("Student %d has the highest average, with %d marks", maxIndex, max);
    }

    public static boolean isOutOfBounds(int min, int num, int max) {
        if (num < min || num > max) {
            System.out.print("Error !!! ");
            return true;
        }
        return false;
    }
}

package lab09.Q2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Student extends PersonProfile {
    private String[] courseName;
    private String[] courseCode;
    private int[] semester;
    private int[] session;
    private int[] mark;
    private String filename;

    public Student(String name, String gender, String dateOfBirth, String filename) {
        super(name, gender, dateOfBirth);
        this.filename = filename;

        try {
            Scanner inputStream = new Scanner(new FileInputStream(filename));
            // get the number of courses
            int lines = 0;
            while (inputStream.hasNextLine()) {
                inputStream.nextLine();
                lines++;
            }
            inputStream.close();

            int numberOfCourses = lines / 5;
            courseName = new String[numberOfCourses];
            courseCode = new String[numberOfCourses];
            semester = new int[numberOfCourses];
            session = new int[numberOfCourses];
            mark = new int[numberOfCourses];

            inputStream = new Scanner(new FileInputStream(filename));
            // get the course details and store in the respective arrays.
            for (int i = 0; inputStream.hasNextLine(); i++) {
                courseCode[i] = inputStream.nextLine();
                courseName[i] = inputStream.nextLine();
                semester[i] = inputStream.nextInt();
                session[i] = inputStream.nextInt();
                mark[i] = inputStream.nextInt();
                if (inputStream.hasNextLine()) inputStream.nextLine();
            }
            inputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String getGrade(int mark) {
        if (mark >= 85) return "A";
        if (mark >= 75) return "A-";
        if (mark >= 70) return "B+";
        if (mark >= 65) return "B";
        if (mark >= 60) return "B-";
        if (mark >= 55) return "C+";
        if (mark >= 50) return "C";
        if (mark >= 45) return "D";
        if (mark >= 35) return "E";
        return "F";
    }

    @Override
    public String toString() {
        String s = super.toString() + "\n";
        for (int i = 0; i < courseCode.length; i++) {
            s += "\nCourse name: " + courseName[i] +
                    "\nCourse code: " + courseCode[i] +
                    "\nSemester: " + semester[i] +
                    "\nMark: " + mark[i] +
                    "\nGrade: " + getGrade(mark[i]) + "\n";
        }
        return s.substring(0, s.length() - 1); // remove the last newline character
    }
}

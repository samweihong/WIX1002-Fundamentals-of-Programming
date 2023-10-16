package lab09.Q3;

import lab09.Q2.PersonProfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lecturer extends PersonProfile {
    private String[] courseName;
    private String[] courseCode;
    private int[] semester;
    private int[] session;
    private int[] creditHour;
    private int[] registeredStudents;

    public Lecturer(String name, String gender, String dateOfBirth) {
        super(name, gender, dateOfBirth);

        try {
            Scanner inputStream = new Scanner(new FileInputStream("src/lab09/Q3/lecturer.txt"));
            // get the number of courses
            int lines = 0;
            while (inputStream.hasNextLine()) {
                inputStream.nextLine();
                lines++;
            }
            inputStream.close();

            int numberOfCourses = lines / 6;
            courseName = new String[numberOfCourses];
            courseCode = new String[numberOfCourses];
            semester = new int[numberOfCourses];
            session = new int[numberOfCourses];
            creditHour = new int[numberOfCourses];
            registeredStudents = new int[numberOfCourses];

            inputStream = new Scanner(new FileInputStream("src/lab09/Q3/lecturer.txt"));
            // get the course details and store in the respective arrays
            for (int i = 0; inputStream.hasNextLine(); i++) {
                courseCode[i] = inputStream.nextLine();
                courseName[i] = inputStream.nextLine();
                semester[i] = inputStream.nextInt();
                session[i] = inputStream.nextInt();
                creditHour[i] = inputStream.nextInt();
                registeredStudents[i] = inputStream.nextInt();
                if (inputStream.hasNextLine()) inputStream.nextLine();
            }
            inputStream.close();
            computeCreditHour();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void computeCreditHour() {
        for (int i = 0; i < creditHour.length; i++) {
            int numOfStudents = registeredStudents[i];

            if (numOfStudents >= 150) creditHour[i] *= 3;
            else if (numOfStudents >= 100) creditHour[i] *= 2;
            else if (numOfStudents >= 50) creditHour[i] *= 1.5;
            else creditHour[i] *= 1;
        }
    }

    @Override
    public String toString() {
        String s = super.toString() + "\n";
        for (int i = 0; i < courseCode.length; i++) {
            s += "\nCourse name: " + courseName[i] +
                    "\nCourse code: " + courseCode[i] +
                    "\nSemester: " + semester[i] +
                    "\nSession: " + session[i] +
                    "\nCredit hour: " + creditHour[i] +
                    "\nRegistered students: " + registeredStudents[i] + "\n";
        }
        return s.substring(0, s.length() - 1); // remove the last newline character
    }
}

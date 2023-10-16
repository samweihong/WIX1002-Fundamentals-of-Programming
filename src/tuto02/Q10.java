package tuto2;

import java.util.Random;

public class Q10 {

    public static class Student {
        public char gender;

        public Student(char gender) {
            this.gender = gender;
        }
    }

    public static void main(String[] args) {

        Student[] list = new Student[100];
        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            if(random.nextInt(2) == 0)
                list[i] = new Student('M');
            else
                list[i] = new Student('F');
        }

        int num = 0;

        for(Student student : list)
            if(student.gender == 'F')
                num++;

        System.out.println("Number of female students: " + num);
    }
}

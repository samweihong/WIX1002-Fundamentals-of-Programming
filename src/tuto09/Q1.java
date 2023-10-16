package tuto9;

public class Q1 {

    public static void main(String[] args) {
        System.out.println(compare(new Student(), new Teacher()));
        System.out.println(isClass(new Student()));
    }

    // a.
    public static boolean compare(Student s, Teacher t) {
        return s.getClass().equals(t.getClass());
    }

    // b.
    public static boolean isClass(Student s) {
        return s instanceof People;
    }
}

class Student extends People {

}

class Teacher {

}

class People {

}
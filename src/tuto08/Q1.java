package tuto8;

public class Q1 {

    public static void main(String[] args) {
        // g.
        Student student = new Student();
        // h.
        student.setContactNumber("012-345 6789");

        // i.
        Animal animal = new Animal();
        Animal cat = new Animal();

        // j.
        Number number1 = new Number(20);
        Number number2 = new Number(40);
    }
}

// a.
class Student {
    // b.
    private String contactNumber;

    // c.
    public Student() {
        contactNumber = null;
    }

    // d.
    public Student(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // e.
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    // f.
    public void displayContactNumber() {
        System.out.println(contactNumber);
    }
}

class Animal {

}

class Number {
    private int number;

    public Number(int number) {
        this.number = number;
    }
}
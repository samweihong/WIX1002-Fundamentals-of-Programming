package tuto10;

public class Q3 {

    public static void main(String[] args) {

        Person[] people = new Person[8];
        people[0] = new Person("Arrows");
        people[1] = new Person("Minions");
        people[2] = new Person("Archers");
        people[3] = new Person("Knight");
        people[4] = new Person("Fireball");
        people[5] = new Person("Mini P.E.K.K.A");
        people[6] = new Person("Musketeer");
        people[7] = new Person("Giant");

        sort(people);
        for (Person p : people)
            System.out.println(p);
    }

    private static void sort(Person[] people) {
        int N = people.length;
        for (int pass = 1; pass < N; pass++)
            for (int i = 0; i < N-1; i++)
                if (people[i].compareTo(people[i+1]) > 0) {
                    Person temp = people[i];
                    people[i] = people[i+1];
                    people[i+1] = temp;
                }
    }
}

class Person implements Comparable<Person> {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person person) {
        return name.compareToIgnoreCase(person.getName());
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}

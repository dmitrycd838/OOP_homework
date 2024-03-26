package Task3;

public class Student {

    String firstName;
    String lastName;
    int age;

    public Student(String firstName, String lastName, int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", firstName, lastName, age); // метод toString для вывода в консоль 
    }
}

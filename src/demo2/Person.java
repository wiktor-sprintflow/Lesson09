package demo2;

public class Person {
    String firstName;
    int age;
    private static int personNumber;

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
        personNumber++;
    }

    public static int getPersonNumber() {
        return personNumber;
    }
}

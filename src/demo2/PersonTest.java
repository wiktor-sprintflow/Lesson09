package demo2;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Jan",20);
        Person person2 = new Person("Maria",25);

        System.out.println(person1.firstName + " " + person1.age);
        System.out.println(person2.firstName + " " + person2.age);

        person1.firstName = "Kazimierz";
        System.out.println(person1.firstName + " " + person1.age);
        System.out.println(person2.firstName + " " + person2.age);

        System.out.println(Person.getPersonNumber());

    }
}

package demo3;

public class DogTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Zwierzak");
        animal.setColor("Czerwony");

        Dog dog = new Dog();
        dog.setName("Pimpus");
        dog.setColor("Biały");
        dog.setTail(30);

        System.out.println(dog.getInfo());

    }
}

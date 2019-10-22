package zadanie4;

public class ShopApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setFirstName("Jan");
        customer.setLastName("Kowalski");
        customer.setAge(30);
        customer.setExpenses(250);

        System.out.println(customer.getInfo());
    }

}

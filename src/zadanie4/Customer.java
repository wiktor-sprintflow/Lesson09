package zadanie4;

public class Customer extends Person {
    private double expenses;

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }
    String getInfo(){
        return getFirstName() + " " + getLastName() + " " + getAge() + " " + getExpenses();
    }
}

package demo3;

public class Dog extends Animal {
    private double tail;

    public double getTail() {
        return tail;
    }

    public void setTail(double tail) {
        this.tail = tail;
    }

    String getInfo(){
        return "Imię: " + getName() + " kolor: " + getColor() + " dł ogona: " + tail;
    }
}

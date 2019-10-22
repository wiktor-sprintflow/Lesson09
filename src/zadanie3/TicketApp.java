package zadanie3;

public class TicketApp {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket("Koncert AAA", "A2", Ticket.ONLINE, 100, 0.1);
        Ticket ticket2 = new Ticket("Koncert BBB", "Alibi", Ticket.STANDARD, 200, 0.2);
        Ticket ticket3 = new Ticket("Koncert CCC", "Liverpool", Ticket.GIFT, 100, 0.1);

        System.out.println(ticket1.getInfo());
        System.out.println(ticket2.getInfo());
        System.out.println(ticket3.getInfo());

    }



}

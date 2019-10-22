package zadanie3;

class Ticket {
    static final String ONLINE = "bilet internetowy";
    static final String STANDARD = "bilet standardowy";
    static final String GIFT = "bilet prezentowy";
    private static int ticketNumber;

    private String eventName;
    private String place;
    private String type;
    private double basePrice;
    private double discount;

    public Ticket(String eventName, String place, String type, double basePrice, double discount) {
        this.eventName = eventName;
        this.place = place;
        this.type = type;
        this.basePrice = basePrice;
        this.discount = discount;
        ticketNumber++;
    }

    public static int getTicketNumber() {
        return ticketNumber;
    }

    public static void setTicketNumber(int ticketNumber) {
        Ticket.ticketNumber = ticketNumber;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    double getFinalPrice() {
        double price;
        switch (type) {
            case ONLINE:
                price = getOnlinePrice();
                break;
            case STANDARD:
                price = getStandardPrice();
                break;
            case GIFT:
                price = getGiftPrice();
                break;
            default:
                price=0;
        }
        return price;
    }

    double getOnlinePrice() {
        return basePrice * (1 - discount);
    }

    double getStandardPrice() {
        return (getOnlinePrice() + 5);
    }

    double getGiftPrice() {
        return (getStandardPrice() + basePrice * 0.05);
    }

    String getInfo(){
        return eventName +" "+ place + " " + type + " " + basePrice + " " + discount + " " + getFinalPrice();
    }
}

import java.util.HashMap;

public class Bartender {
    private final HashMap<Ticket,String> listOfOrders = new HashMap<>();

    public void newOrder(Ticket ticket, String setProducts){
        listOfOrders.put(ticket, setProducts);
    }
    public void issuedAnOrder(Ticket ticket){
        System.out.println(ticket.name() + " получил свой заказ: " + listOfOrders.get(ticket));
    }

}

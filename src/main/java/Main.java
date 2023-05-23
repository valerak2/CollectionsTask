/**
 * Была выбрана HashMap (listOfOrders в классе Bartender),
 * потому что можно построить однозначное отображение
 * между зрителем и тем, что он заказал.
 *
 * Т.к в качестве ключа используется класс record,
 * где хэш-функция реализована хорошо и дает мало коллизий,
 * но все таки коллизии могут быть,
 * то получение элемента по хэшу с возможными коллизиями в HashMap выполняется за O(n),
 * т.к идет перебор элементов, если их хэши совпали.
 * поэтому сложность алгоритма О(n).
 *
 */
public class Main {
    static Bartender bartender = new Bartender();

    public static void main(String[] args) {
        Ticket ticketOleg = new Ticket("Олег", 0x1);
        Ticket ticketStas = new Ticket("Стас", 0xA);
        Ticket ticketEgor = new Ticket("Егор", 0xB);
        Ticket ticketNastya = new Ticket("Настя", 0xC);

        bartender.newOrder(ticketOleg, "нет товаров");
        bartender.newOrder(ticketStas, "напитки");
        bartender.newOrder(ticketEgor, "еда и напитки");
        bartender.newOrder(ticketNastya, "еда");


        bartender.issuedAnOrder(ticketEgor);
        bartender.issuedAnOrder(ticketStas);
        bartender.issuedAnOrder(ticketNastya);
        bartender.issuedAnOrder(ticketEgor);
    }
}

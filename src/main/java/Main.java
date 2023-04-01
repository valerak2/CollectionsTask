/**
 * Была выбрана HashMap (listOfOrders в классе Bartender),
 * потому что можно построить однозначное отображение
 * между зрителем и тем, что он заказал.
 *
 * Из условия задачи можно предположить,
 * что ID билета у каждого зрителя уникальный и дубликатов возникнуть не может,
 * поэтому можно взять его в качестве hashcode
 * @see Ticket#hashCode()
 *
 * Получение значения по ключу в HashMap выполняется за О(1)
 * (если все-таки возникнут коллизии, то О(n))
 * ключ(hashcode) берется тоже за О(1),
 * поэтому сложность алгоритма О(1).
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

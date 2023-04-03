/**
 * Структура данных - ArrayList в классе Library,
 * потому что все остальные коллекции имеют неподходящую структуру
 * для хранения книг в библиотеке.
 *
 * Операции добавления, удаления, поиска выполняются за O(n)
 */
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book HarryPotter1 = new Book("Гарри Поттер и философский камень", "Джоан Роулинг", 1997);
        Book HarryPotter2 = new Book("Гарри Поттер и Тайная комната", "Джоан Роулинг", 1998);
        Book HarryPotter3 = new Book("Гарри Поттер и узник Азкабана", "Джоан Роулинг", 1999);
        Book HarryPotter4 = new Book("Гарри Поттер и Кубок огня", "Джоан Роулинг", 2000);
        Book HarryPotter5 = new Book("Гарри Поттер и Орден Феникса", "Джоан Роулинг", 2003);
        Book HarryPotter6 = new Book("Гарри Поттер и Принц-полукровка", "Джоан Роулинг", 2005);
        Book HarryPotter7 = new Book("Гарри Поттер и Дары Смерти", "Джоан Роулинг", 2007);

        library.add(HarryPotter1);
        library.add(HarryPotter2);
        library.add(HarryPotter3);
        library.add(HarryPotter4);
        library.add(HarryPotter5);
        library.add(HarryPotter6);
        library.add(HarryPotter7);

        System.out.println(library.findByYear(2000));
        System.out.println(library.findByAuthor("Джоан Роулинг"));
        System.out.println(library.findAllByYearPeriod(2001, 2010));
    }
}

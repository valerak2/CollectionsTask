/**
 * Структуры данных - HashMap в классе Library,
 * Для максимальной скорости создаем 3 словаря,
 * чтобы операции поиска по названию, автору и году издания выполнялись за O(1)
 * Т.к у одного автора может быть несколько книг или в один год написано множество книг,
 * то в этих случаях используем вложенные словари, где внешним ключом является
 * автор/год, а внутренним ключом является название книги
 *
 * Операции добавления/удаления выполняются за O(1),
 * т.к обращение к элементу по ключу во внешнем словаре выполняются за O(1)
 * а затем put/remove во внутреннем словаре выполняются за O(1)
 *
 * Операция поиска по временному интервалу выполняется за O(n),
 * где n - разность годов
 * проходимся по временному интервалу и получаем книги по годам, если есть такие.
 */
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.add(new Book("Гарри Поттер и философский камень", "Джоан Роулинг", 1997));
        library.add(new Book("Гарри Поттер и Тайная комната", "Джоан Роулинг", 1998));
        library.add(new Book("Гарри Поттер и узник Азкабана", "Джоан Роулинг", 1999));
        library.add(new Book("Гарри Поттер и Кубок огня", "Джоан Роулинг", 2000));
        library.add(new Book("Гарри Поттер и Орден Феникса", "Джоан Роулинг", 2003));
        library.add(new Book("Гарри Поттер и Принц-полукровка", "Джоан Роулинг", 2005));
        library.add(new Book("Гарри Поттер и Дары Смерти", "Джоан Роулинг", 2007));

        System.out.println(library.findByYear(2000));
        System.out.println(library.findByTitle("Гарри Поттер"));
        System.out.println(library.findByAuthor("Джоан Роулинг"));
        System.out.println(library.findAllByYearPeriod(2001, 2010));
    }
}

import java.util.*;

public class Library {
    private final Map<String, Set<Book>> authorOnBook = new HashMap<>();
    private final Map<String, Book> titleOnBook = new HashMap<>();
    private final Map<Integer, Set<Book>> yearOnBook = new HashMap<>();

    public void add(Book book) {
        if (!authorOnBook.containsKey(book.author())) {
            authorOnBook.put(book.author(), new HashSet<>());
        }
        authorOnBook.get(book.author()).add(book);
        if (!yearOnBook.containsKey(book.year())) {
            yearOnBook.put(book.year(), new  HashSet<>());
        }
        yearOnBook.get(book.year()).add(book);
        titleOnBook.put(book.title(), book);
    }

    public void remove(Book book) {
        authorOnBook.get(book.author()).remove(book);
        yearOnBook.get(book.year()).remove(book);
        titleOnBook.remove(book.title(), book);

    }

    public Collection<Book> findByAuthor(String author) {
        return authorOnBook.get(author);
    }

    public Book findByTitle(String title) {
        return titleOnBook.get(title);
    }


    public Collection<Book> findByYear(int year) {
        return yearOnBook.get(year);
    }

    public List<Book> findAllByYearPeriod(int fromYear, int toYear) {
        List<Book> bookList = new ArrayList<>();
        for (int year = fromYear; year <= toYear; year++) {
            if (yearOnBook.containsKey(year))
                bookList.addAll(yearOnBook.get(year));
        }
        return bookList;
    }
}


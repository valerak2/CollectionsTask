import java.util.*;

public class Library {
    private final Map<String, Map<String, Book>> authorOnBook = new HashMap<>();
    private final Map<String, Book> titleOnBook = new HashMap<>();
    private final Map<String, Map<String, Book>> yearOnBook = new HashMap<>();

    public void add(Book book) {
        addValue(authorOnBook, book.author(), book);
        addValue(yearOnBook, String.valueOf(book.year()), book);
        titleOnBook.put(book.title(), book);
    }

    private void addValue(Map<String, Map<String, Book>> map, String key, Book book) {
        Map<String, Book> internalMap = map.containsKey(key) ? map.get(key) : new HashMap<>();
        internalMap.put(book.title(), book);
        map.put(key, internalMap);

    }

    public void remove(Book book) {
        authorOnBook.get(book.author()).remove(book.author());
        authorOnBook.get(String.valueOf(book.year())).remove(book.author());
        titleOnBook.remove(book.title(), book);

    }

    public Collection<Book> findByAuthor(String author) {
        return authorOnBook.get(author).values();
    }

    public Book findByTitle(String title) {
        return titleOnBook.get(title);
    }


    public Collection<Book> findByYear(int year) {
        return yearOnBook.get(String.valueOf(year)).values();
    }

    public List<Book> findAllByYearPeriod(int fromYear, int toYear) {
        List<Book> bookList = new ArrayList<>();
        for (int year = fromYear; year <= toYear; year++) {
            if (yearOnBook.containsKey(String.valueOf(year)))
                bookList.addAll(yearOnBook.get(String.valueOf(year)).values());
        }
        return bookList;
    }
}


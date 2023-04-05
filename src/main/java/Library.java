import com.google.common.collect.HashMultimap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Library {
    private final HashMultimap<String, Book> authorOnBook = HashMultimap.create();
    private final HashMap<String, Book> titleOnBook = new HashMap<>();
    private final HashMultimap<Integer, Book> yearOnBook = HashMultimap.create();


    public void add(Book book) {
        authorOnBook.put(book.author(), book);
        titleOnBook.put(book.title(), book);
        yearOnBook.put(book.year(), book);
    }

    public void remove(Book book) {
        authorOnBook.remove(book.author(), book);
        titleOnBook.remove(book.title(), book);
        yearOnBook.remove(book.year(), book);

    }

    public Set<Book> findByAuthor(String author) {
        return authorOnBook.get(author);
    }

    public Book findByTitle(String title) {
        return titleOnBook.get(title);
    }


    public Set<Book> findByYear(int year) {
        return yearOnBook.get(year);
    }

    public List<Book> findAllByYearPeriod(int fromYear, int toYear) {
        List<Book> bookList = new ArrayList<>();
        for (Integer year : yearOnBook.asMap().keySet()) {
            if (fromYear <= year & year <= toYear)
                bookList.addAll(yearOnBook.get(year));
        }
        return bookList;
    }
}


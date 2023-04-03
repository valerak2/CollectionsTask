import java.util.ArrayList;
import java.util.List;

public class Library {
    private final ArrayList<Book> library = new ArrayList<>();

    public void add(Book book) {
        library.add(book);
    }

    public void remove(Book book) {
        library.remove(book);
    }

    public List<Book> findByAuthor(String author) {
        return library.stream()
                .filter(book -> book.author().equals(author))
                .toList();
    }

    public List<Book> findByTitle(String title) {
        return library.stream()
                .filter(book -> book.title().equals(title))
                .toList();
    }


    public List<Book> findByYear(int year) {
        return library.stream()
                .filter(book -> book.year() == year)
                .toList();
    }

    public List<Book> findAllByYearPeriod(int fromYear, int toYear) {
        return library.stream()
                .filter(book -> fromYear <= book.year() & book.year() <= toYear)
                .toList();
    }
}


import java.util.List;

import BookLibrary.Book;
public interface LibraryService {
    void addBook(Book book);
    void removeBook(String title);
    List<Book> listBooks();
}

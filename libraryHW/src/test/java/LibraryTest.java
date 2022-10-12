import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library(3);
        book = new Book("2001 A Space Odyssey", "Arthur C Clarke", "Sci Fi");
        book1 = new Book("The Lord Of The Rings", "JRR Tolkien", "Fantasy");
        book2 = new Book("Death On The Nile", "Agathe Christie", "Mystery");
        book3 = new Book("A Game Of Thrones", "George RR Martin", "Fantasy");


    }
    @Test
    public void LibraryEmpty(){
        assertEquals(0, library.getBookCount());
    }
    @Test
    public void AddBookToLibrary(){
        library.AddBook(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void OverStocked(){
        library.OverStockedLibrary(book, book1, book2, book3);

        assertEquals(3, library.getBookCount());
    }


}

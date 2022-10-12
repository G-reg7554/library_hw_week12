import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {


    public Borrower borrower;
    private Book books;
    private Library library;
    private Book book;
    private Book book1;
    private Book book2;
    private Book book3;
@Before
public void SetUp(){
    borrower = new Borrower();
    library = new Library(3);
    book = new Book("2001 A Space Odyssey", "Arthur C Clarke", "Sci Fi");
    book1 = new Book("The Lord Of The Rings", "JRR Tolkien", "Fantasy");
    book2 = new Book("Death On The Nile", "Agathe Christie", "Mystery");
    book3 = new Book("A Game Of Thrones", "George RR Martin", "Fantasy");
}
    @Test
    public void BorrowerCount(){
        assertEquals(0, borrower.getBorrowerCount());
    }

    @Test
    public void BorrowerAddBookFromLibrary(){
        library.AddBook(book);
        borrower.AddBorrowerBook(book);
        library.LibraryWithdrawl(book);

        assertEquals(0, library.getBookCount());
        assertEquals(1, borrower.getBorrowerCount());
    }
}

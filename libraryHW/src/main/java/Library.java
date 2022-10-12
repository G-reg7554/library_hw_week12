import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {

        this.books = new ArrayList<>();
        this.capacity = capacity;
    }


    public int getBookCount() {
        return this.books.size();
    }

    public void AddBook(Book book){
        books.add(book);
    }
    public void OverStockedLibrary(Book book, Book book1,Book book2, Book book3){

        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);

        if(this.books.size() > capacity) {
            books.remove(book);
        }

    }
    public void LibraryWithdrawl(Book book){
        this.books.remove(book);
    }



}

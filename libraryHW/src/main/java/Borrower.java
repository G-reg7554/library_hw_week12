import java.util.ArrayList;

public class Borrower {
    public ArrayList<Book> borrow;

    public Borrower() {

        this.borrow = new ArrayList<>();
    }

    public int getBorrowerCount() {
        return this.borrow.size();
    }

    public void AddBorrowerBook(Book book){
        this.borrow.add(book);
    }






}

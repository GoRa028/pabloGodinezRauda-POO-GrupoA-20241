import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class User {
    private int id;
    private String name;
    private List<Book> books = new ArrayList<>();

    Random ran = new Random();

    public User(String name) {
        this.id=ran.nextInt(1,1000);
        this.name=name;
    }

    public void rentBook(int id, String title, String author){
        books.add(new Book(id, title, author));
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getUserBooks(String userName) {
        String bookInfo = "";
        if(this.books.isEmpty()) {
            System.out.print("User without books rented.");
        } else {
            bookInfo += "\nUser's rented books: " + "\n";
            for (Book book : books) {
                if (this.name.equals(userName)) {
                    bookInfo += "\tBook's ID: " + (book.getId()) + ":\n";
                    bookInfo += "\tBook's title: " + book.getTitle() + "\n";
                    bookInfo += "\tBook's author: " + book.getAuthor();
                }
            }
        }
        return bookInfo;
    }
}

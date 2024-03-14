import java.util.Random;

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean rented;

    Random ran = new Random();

    public Book(String title, String author) {
        this.id=ran.nextInt(1,1000);
        this.title=title;
        this.author=author;
        this.rented=false;
    }
    public Book(int id, String title, String author) {
        this.id=id;
        this.title=title;
        this.author=author;
        this.rented=true;
    }

    public Book(String title, String author, boolean rented) {
        this.id=ran.nextInt(1,1000);
        this.title=title;
        this.author=author;
        this.rented=rented;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }
}

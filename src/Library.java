import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library(){
        this.books=new ArrayList<>();
        this.users=new ArrayList<>();
    }

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
        System.out.println("Book added with success.");
    }

    public void addUser(String name) {
        users.add(new User(name));
        System.out.println("User added with success.");
    }

    public void rentBook(String title, String author, String user) {
        boolean rented=false;
        boolean findUser=false;
        for(User user1 : users) {
            if(user.equals(user1.getName())) {
                findUser=true;
                for (Book book : books) {
                    if(title.equals(book.getTitle()) && !book.isRented()) {
                        book.setRented(true);
                        user1.rentBook(book.getId(), title, author);
                        rented=true;
                        System.out.println("Book rented.");
                    }
                }
                if(!rented)
                    System.out.println("Book wasn't found, or it has been rented.");
            }
        }
        if(!findUser)
            System.out.println("User wasn't found.");
    }

    public void printUsers() {
        String userInfo;
        for (User user : users) {
            System.out.println("------------------------------");
            userInfo = "";
            userInfo += "User ID: " + (user.getId()) + "\n";
            userInfo += "Name: " + user.getName() + "\n";
            System.out.println(userInfo);
            userInfo = "";
            userInfo += user.getUserBooks(user.getName());
            System.out.println(userInfo);
        }
        System.out.println("------------------------------");
    }

    public void printUserWithBooks() {
        String userInfo;
        for (User user : users) {
            if(!user.getBooks().isEmpty()) {
                userInfo = "";
                System.out.println("------------------------------");
                System.out.println("User ID: " + (user.getId()));
                userInfo += "Name: " + user.getName();
                userInfo += user.getUserBooks(user.getName());
                System.out.println(userInfo);
            }
        }
        System.out.println("------------------------------");
    }

    public void printBooks() {
        String bookInfo;
        for (Book book : books) {
            System.out.println("------------------------------");
            bookInfo = "";
            System.out.println("Book's ID: " + (book.getId()) + ":");
            bookInfo += "Book's title: " + book.getTitle() + "\n";
            bookInfo += "Book's author: " + book.getAuthor();
            System.out.println(bookInfo);
        }
        System.out.println("------------------------------");
    }

    public void printRentedBooks() {
        String bookInfo;
        if(books.isEmpty()) {
            System.out.println("There's no rented books.");
        } else {
            for (Book book : books) {
                if(book.isRented()) {
                    System.out.println("------------------------------");
                    bookInfo = "";
                    System.out.println("Book's ID: " + (book.getId()) + ":");
                    bookInfo += "Book's title: " + book.getTitle() + "\n";
                    bookInfo += "Book's author: " + book.getAuthor();
                    System.out.println(bookInfo);
                }
            }
            System.out.println("------------------------------");
        }
    }

    public void printUnrentedBooks() {
        String bookInfo;
        for (Book book : books) {
            if(!book.isRented()) {
                System.out.println("------------------------------");
                bookInfo = "";
                System.out.println("Book's ID: " + (book.getId()) + ":");
                bookInfo += "Book's title: " + book.getTitle() + "\n";
                bookInfo += "Book's author: " + book.getAuthor();
                System.out.println(bookInfo);
            }
        }
        System.out.println("------------------------------");
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Book> getBooks() {
        return books;
    }

}

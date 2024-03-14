import java.util.Scanner;

public class Main {
    static Scanner read = new Scanner(System.in);

    static Library library = new Library();

    public static void main(String[] args) {

        int opt;

        do {
            System.out.println( "\n╔═════════════════════════════╗" +
                                "\n║            MENU             ║" +
                                "\n╠═════════════════════════════╣" +
                                "\n║ 1. Add user                 ║" +
                                "\n║ 2. Add book                 ║" +
                                "\n║ 3. Rent book                ║" +
                                "\n║ 4. List users               ║" +
                                "\n║ 5. List books               ║" +
                                "\n║ 6. List users with books    ║" +
                                "\n║ 7. List unrented books      ║" +
                                "\n║ 8. List rented books        ║" +
                                "\n║ 9. Exit                     ║" +
                                "\n╚═════════════════════════════╝");
            System.out.print("Choose an option: ");
            opt=Integer.parseInt(read.nextLine());

            switch (opt) {
                case 1:
                    System.out.print("Enter user's name: ");
                    String name = read.nextLine();

                    library.addUser(name);
                    break;
                case 2:
                    System.out.print("Enter book's title: ");
                    String title = read.nextLine();

                    System.out.print("Enter book's author: ");
                    String author = read.nextLine();

                    library.addBook(title, author);
                    break;
                case 3:
                    if (library.getUsers().isEmpty()) {
                        System.out.println("There's no users added.");
                    } else {
                        System.out.print("Enter the name of the user to rent: ");
                        String userName = read.nextLine();

                        System.out.print("Enter book's title: ");
                        String bookTitle = read.nextLine();

                        System.out.print("Enter book's author: ");
                        String bookAuthor = read.nextLine();

                        library.rentBook(bookTitle, bookAuthor, userName);
                    }
                    break;
                case 4: library.printUsers();
                    break;
                case 5: library.printBooks();
                    break;
                case 6: library.printUserWithBooks();
                    break;
                case 7:
                    if(library.getBooks().isEmpty()) {
                        System.out.println("There's no books added.");
                    } else library.printUnrentedBooks();
                    break;
                case 8:
                    if(library.getBooks().isEmpty()) {
                        System.out.println("There's no rented books.");
                    } else library.printRentedBooks();
                    break;
                case 9:
                    System.out.println("Ending program...");
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        } while (opt!=9);
    }
}
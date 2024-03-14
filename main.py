from library import Library

if __name__ == "__main__":
        library = Library()
        opt=0

        while opt!=9:
            print("\n╔═════════════════════════════╗" +
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
                  "\n╚═════════════════════════════╝")
            opt = int(input("Choose an option: "))

            if opt == 1:
                name = input("Enter user's name: ")
                library.addUser(name)
            elif opt == 2:
                title = input("Enter book's title: ")
                author = input("Enter book's author: ")
                library.addBook(title, author)
            elif opt == 3:
                if library.getUsers():
                    userName = input("Enter the name of the user to rent: ")
                    bookTitle = input("Enter book's title: ")
                    bookAuthor = input("Enter book's author: ")
                    library.rentBook(bookTitle, bookAuthor, userName)
                else:
                    print("There's no users added.")
            elif opt == 4:
                library.printUsers()
            elif opt == 5:
                library.printBooks()
            elif opt == 6:
                library.printUserWithBooks()
            elif opt == 7:
                if library.getBooks():
                    library.printUnrentedBooks()
                else:
                    print("There's no books added.")
            elif opt == 8:
                if library.getBooks():
                    library.printRentedBooks()
                else:
                    print("There's no rented books.")
            elif opt == 9:
                print("Ending program...")
                break
            else:
                print("Invalid option.")

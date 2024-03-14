from book import Book
from user import User

class Library:
    def __init__(self):
        self.books = []
        self.users = []

    def addBook(self, title, author):
        self.books.append(Book(title, author))
        print("Book added with success.")

    def addUser(self, name):
        self.users.append(User(name))
        print("User added with success.")

    def rentBook(self, title, author, user):
        rented = False
        findUser = False
        for user_obj in self.users:
            if user == user_obj.getName():
                findUser = True
                for book in self.books:
                    if title == book.getTitle() and not book.isRented():
                        book.setRented(True)
                        user_obj.rentBook(book.getId(), title, author)
                        rented = True
                        print("Book rented.")
                if not rented:
                    print("Book wasn't found, or it has been rented.")
        if not findUser:
            print("User wasn't found.")

    def printUsers(self):
        for user in self.users:
            print("------------------------------")
            print(f"User ID: {user.getId()}")
            print(f"Name: {user.getName()}")
            user_books_info = user.getUserBooks(user.getName())
            if user_books_info:
                print(user_books_info)
        print("------------------------------")

    def printUserWithBooks(self):
        for user in self.users:
            if user.getBooks():
                print("------------------------------")
                print(f"User ID: {user.getId()}")
                print(f"Name: {user.getName()}")
                user_books_info = user.getUserBooks(user.getName())
                if user_books_info:
                    print(user_books_info)
        print("------------------------------")

    def printBooks(self):
        for book in self.books:
            print("------------------------------")
            print(f"Book's ID: {book.getId()}:")
            print(f"Book's title: {book.getTitle()}")
            print(f"Book's author: {book.getAuthor()}")
        print("------------------------------")

    def printRentedBooks(self):
        rented_books = [book for book in self.books if book.isRented()]
        if not rented_books:
            print("There's no rented books.")
        else:
            for book in rented_books:
                print("------------------------------")
                print(f"Book's ID: {book.getId()}:")
                print(f"Book's title: {book.getTitle()}")
                print(f"Book's author: {book.getAuthor()}")
            print("------------------------------")

    def printUnrentedBooks(self):
        unrented_books = [book for book in self.books if not book.isRented()]
        for book in unrented_books:
            print("------------------------------")
            print(f"Book's ID: {book.getId()}:")
            print(f"Book's title: {book.getTitle()}")
            print(f"Book's author: {book.getAuthor()}")
        print("------------------------------")

    def getUsers(self):
        return self.users

    def getBooks(self):
        return self.books

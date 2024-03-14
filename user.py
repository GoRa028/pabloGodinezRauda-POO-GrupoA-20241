import random
from book import Book

class User:
    def __init__(self, name):
        self.id = random.randint(1, 1000)
        self.name = name
        self.books = []

    def rentBook(self, book_id, title, author):
        self.books.append(Book(book_id, title, author))

    def getId(self):
        return self.id

    def getName(self):
        return self.name

    def getBooks(self):
        return self.books

    def getUserBooks(self, userName):
        bookInfo = ""
        if not self.books:
            bookInfo += "User without books rented."
        else:
            bookInfo += "\nUser's rented books: \n"
            for book in self.books:
                if self.name == userName:
                    bookInfo += "\n\ttBook's ID: " + str(book.getId()) + ":\n"
                    bookInfo += "\tBook's title: " + str(book.getTitle()) + "\n"
                    bookInfo += "\tBook's author: " + str(book.getAuthor())
        return bookInfo

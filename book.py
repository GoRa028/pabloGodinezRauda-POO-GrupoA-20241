import random

class Book:
    def __init__(self, title, author, rented=False):
        self.id = random.randint(1, 1000)
        self.title = title
        self.author = author
        self.rented = rented

    def getId(self):
        return self.id

    def getTitle(self):
        return self.title

    def getAuthor(self):
        return self.author

    def isRented(self):
        return self.rented

    def setRented(self, rented):
        self.rented = rented

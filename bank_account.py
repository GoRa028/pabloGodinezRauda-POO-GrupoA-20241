class BankAccount:
    __owner_name = ""
    __owner_last_name = ""
    __account_number = 0
    __account_type = ''
    __amount = 0

    def __init__(self, owner_name, owner_last_name, account_number, account_type, amount):
        self.__owner_name = owner_name
        self.__owner_last_name = owner_last_name
        self.__account_number = account_number
        self.__account_type = account_type
        self.__amount = amount

    def get_owner_name(self):
        return self.__owner_name

    def get_owner_last_name(self):
        return self.__owner_last_name

    def get_account_number(self):
        return self.__account_number

    def get_type(self):
        return self.__account_type

    def get_amount(self):
        return self.__amount

    def make_deposit(self, quant):
        if self.__account_type == 'A':
            if self.__amount + quant < 50000:
                self.__amount += quant
            else:
                print("You cannot have more than $50,000 in this account type.")
        elif self.__account_type == 'B':
            if self.__amount + quant < 100000:
                self.__amount += quant
            else:
                print("You cannot have more than $100,000 in this account type.")
        elif self.__account_type == 'C':
            self.__amount += quant

    def withdraw(self, quant):
        if self.__account_type == 'A':
            if self.__amount < 1000:
                self.__amount += quant
            else:
                print("You need to have at least $1,000 to withdraw money.")
        elif self.__account_type == 'B':
            if self.__amount < 5000:
                self.__amount += quant
            else:
                print("You need to have at least $5,000 to withdraw money.")
        elif self.__account_type == 'C':
            if self.__amount < 10000:
                self.__amount += quant
            else:
                print("You need to have at least $10,000 to withdraw money.")
from bank_account import BankAccount


class Employee:
    __name = ""
    __last_name = ""
    __accounts = []

    def __init__(self, name, last_name, account_number, account_type, amount):
        self.__name = name
        self.__lastName = last_name
        self.__accounts = [BankAccount(name, last_name, account_number, account_type, amount)]

    def add_account(self, account_number, account_type, amount):
        self.__accounts.append(BankAccount(self.__name, self.__lastName, account_number, account_type, amount))

    def get_accounts_size(self):
        return len(self.__accounts)

    def get_name(self):
        return self.__name

    def get_last_name(self):
        return self.__last_name

    def get_accounts(self, i):
        return self.__accounts

    def get_employee_accounts(self):
        account_info = "\nEmployee accounts: "
        for i in range(self.get_accounts_size()):
            if self.__name == self.__accounts[i].get_owner_name():
                account_info += "\nAccount {}: \n".format(i + 1)
                account_info += "\tAccount Number: {}\n".format(self.__accounts[i].get_account_number())
                account_info += "\tAccount Type: {}\n".format(self.__accounts[i].get_type())
                account_info += "\tAccount Amount: {}\n".format(self.__accounts[i].get_amount())
        return account_info
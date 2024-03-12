from bank_account import BankAccount
from employee import Employee


class Bank:
    __employees = []
    __bank_accounts = []

    def __init__(self):
        self.__employees = []
        self.__bank_accounts = []

    def get_employees(self):
        return self.__employees

    def get_bank_accounts(self):
        return self.__bank_accounts

    def add_employee(self, name, last_name, account_number, account_type, amount):
        self.__bank_accounts.append(BankAccount(name, last_name, account_number, account_type, amount))
        self.__employees.append(Employee(name, last_name, account_number, account_type, amount))

    def add_account(self, employee_id, account_number, account_type, amount):
        self.__employees[employee_id - 1].add_account(account_number, account_type, amount)
        self.__bank_accounts.append(BankAccount(self.__employees[employee_id - 1].get_name, self.__employees[employee_id - 1].get_last_name(), account_number, account_type, amount))

    def print_employees(self):
        for i, employee in enumerate(self.__employees, start=1):
            print("------------------------------")
            print(f"Employee {i}:")
            print(f"Name: {employee.get_name()}")
            print(f"Last name: {employee.get_last_name()}")
            print(employee.get_employee_accounts())
        print("------------------------------")

    def print_employee(self, i):
        print("\nEmployee {}:".format(i))
        print(f"Name: {self.__employees[i - 1].get_name()}")
        print(f"Last name: {self.__employees[i - 1].get_last_name()}")
        print(self.__employees[i - 1].get_employee_accounts())

    def print_accounts(self):
        for i, account in enumerate(self.__bank_accounts, start=1):
            print("------------------------------")
            print(f"\tAccount {i}:")
            print(f"\tAccount Owner Name: {account.get_owner_name()}")
            print(f"\tAccount Owner Last Name: {account.get_owner_last_name()}")
            print(f"\tAccount Number: {account.get_account_number()}")
            print(f"\tAccount Type: {account.get_type()}")
            print(f"\tAccount Amount: {account.get_amount()}")
        print("------------------------------")

    def print_account(self, account_id):
        print("Account {}:".format(account_id))
        print(f"\tAccount Owner Name: {self.__bank_accounts[account_id - 1].get_owner_name}")
        print(f"\tAccount Owner Last Name: {self.__bank_accounts[account_id - 1].get_owner_last_name()}")
        print(f"\tAccount Number: {self.__bank_accounts[account_id - 1].get_account_number()}")
        print(f"\tAccount Type: {self.__bank_accounts[account_id - 1].get_type()}")
        print(f"\tAccount Amount: {self.__bank_accounts[account_id - 1].get_amount()}")
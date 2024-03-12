from bank import Bank


def validate_account_type():
    account_type = ''
    while account_type not in ['A', 'B', 'C']:
        account_type = input("Enter account type: ").upper()
        if account_type not in ['A', 'B', 'C']:
            print("You need to choose between 'A', 'B' or 'C' account type.")
    return account_type


def validate_employee_id():
    employee_id = 0
    while employee_id > len(bank.get_employees()) or employee_id < 1:
        employee_id = int(input("Enter employee's ID: "))
        if employee_id > len(bank.get_employees()) or employee_id < 1:
            print("The ID you entered doesn't exist.\n")
    return employee_id


def validate_account_id():
    account_id = 0
    while account_id > len(bank.get_bank_accounts()) or account_id < 1:
        account_id = int(input("Enter account's ID: "))
        if account_id > len(bank.get_bank_accounts()) or account_id < 1:
            print("The ID you entered doesn't exist.\n")
    return account_id


if __name__ == "__main__":
    bank = Bank()

    opt=0

    while opt!=7:
        print("\n╔═════════════════════════════╗" +
              "\n║            MENU             ║" +
              "\n╠═════════════════════════════╣" +
              "\n║ 1. Add employee             ║" +
              "\n║ 2. Add account              ║" +
              "\n║ 3. Search employee          ║" +
              "\n║ 4. Search account           ║" +
              "\n║ 5. List employees           ║" +
              "\n║ 6. List accounts            ║" +
              "\n║ 7. Exit                     ║" +
              "\n╚═════════════════════════════╝")
        opt = int(input("Choose an option: "))

        if opt == 1:
            name = input("Enter employee's name: ")
            last_name = input("Enter employee's last name: ")
            account_number = int(input("Enter account number: "))
            account_type = validate_account_type()
            print("Would you like to make a deposit to the account? (1. Yes / 2. No)")
            option = int(input())
            if option == 1:
                print("How much money would you like to deposit?")
                amount = float(input())
                bank.add_employee(name, last_name, account_number, account_type, amount)
                print("Employee added with success.")
            else:
                amount = 0
                bank.add_employee(name, last_name, account_number, account_type, amount)
                print("Employee added with success.")
        elif opt == 2:
            if not bank.get_employees():
                print("There's no employees added yet.")
            else:
                employee_id = validate_employee_id()

                account_number = int(input("Enter account number: "))
                account_type = validate_account_type()

                print("Would you like to make a deposit to the account? (1. Yes / 2. No)")
                option_2 = int(input())
                if option_2 == 1:
                    print("How much money would you like to deposit?")
                    amount = float(input())
                    bank.add_account(employee_id, account_number, account_type, amount)
                    print("Account added with success.")
                else:
                    amount = 0
                    bank.add_account(employee_id, account_number, account_type, amount)
                    print("Account added with success.")

        elif opt == 3:
            if not bank.get_employees():
                print("There's no employees added yet.")
            else:
                employee_id = validate_employee_id()
                bank.print_employee(employee_id)

        elif opt == 4:
            if not bank.get_bank_accounts():
                print("There's no accounts added yet.")
            else:
                account_id = validate_account_id()
                bank.print_account(account_id)

        elif opt == 5:
            if not bank.get_employees():
                print("There's no employees added yet.")
            else:
                bank.print_employees()

        elif opt == 6:
            if not bank.get_bank_accounts():
                print("There's no accounts added yet.")
            else:
                bank.print_accounts()

        elif opt == 7:
            print("Ending program...")

        else:
            print("Invalid option.")

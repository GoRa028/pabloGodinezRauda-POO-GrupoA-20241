import java.util.Scanner;

public class Main {

    static Scanner read = new Scanner(System.in);
    static Bank bank = new Bank();

    public static void main(String[] args) {

        int opt;

        do {
            System.out.println("\n╔═════════════════════════════╗" +
                               "\n║            MENU             ║" +
                               "\n╠═════════════════════════════╣" +
                               "\n║ 1. Add employee             ║" +
                               "\n║ 2. Add account              ║" +
                               "\n║ 3. Search employee          ║" +
                               "\n║ 4. Search account           ║" +
                               "\n║ 5. List employees           ║" +
                               "\n║ 6. List accounts            ║" +
                               "\n║ 7. Exit                     ║" +
                               "\n╚═════════════════════════════╝");
            System.out.print("Choose an option: ");
            opt=read.nextInt();
            switch (opt) {
                case 1:
                    System.out.print("Enter employee's name: ");
                    String name = read.next();

                    System.out.print("Enter employee's last name: ");
                    String lastName = read.next();

                    System.out.print("Enter account number: ");
                    long accountNumber = read.nextLong();

                    char type = validateAccountType();

                    System.out.println("Would you like to make a deposit to the account? (1. Yes / 2. No)");
                    int option = read.nextInt();
                    if(option==1) {
                        System.out.println("How much money would you like to deposit?");
                        double amount = read.nextDouble();
                        bank.addEmployee(name, lastName, accountNumber, type, amount);
                        System.out.println("Employee added with success.");
                    } else{
                        bank.addEmployee(name, lastName, accountNumber, type);
                        System.out.println("Employee added with success.");
                    }
                    break;
                case 2:
                    if(bank.getEmployees().isEmpty()) {
                        System.out.println("There´s no employees added yet.");
                    } else {
                        int employeeID = validateEmployeeID();

                        System.out.print("Enter account number: ");
                        long accountNum = read.nextLong();

                        char accountType = validateAccountType();

                        System.out.println("Would you like to make a deposit to the account? (1. Yes / 2. No)");
                        int option2 = read.nextInt();
                        if(option2==1) {
                            System.out.println("How much money would you like to deposit?");
                            double amount = read.nextDouble();
                            bank.addAccount(employeeID, accountNum, accountType, amount);
                            System.out.println("Account added with success.");
                        } else{
                            bank.addAccount(employeeID, accountNum, accountType);
                            System.out.println("Account added with success.");
                        }
                    }
                    break;
                case 3:
                    int ID;
                    if(bank.getEmployees().isEmpty()) {
                        System.out.println("There's no employees added yet.");
                    } else {
                        ID = validateEmployeeID();
                        bank.printEmployee(ID);
                    }
                    break;
                case 4:
                    int accountID;

                    if(bank.getBankAccounts().isEmpty()) {
                        System.out.println("There's no accounts added yet.");
                    } else {
                        accountID = validateAccountID();
                        bank.printAccount(accountID);
                    }
                    break;
                case 5:
                    if(bank.getEmployees().isEmpty()) {
                        System.out.println("There's no employees added yet.");
                    } else bank.printEmployees();
                    break;
                case 6:
                    if(bank.getBankAccounts().isEmpty()) {
                        System.out.println("There's no accounts added yet.");
                    } else bank.printAccounts();
                    break;
                case 7:
                    System.out.println("Ending program...");
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        } while (opt!=7);

    }

    public static char validateAccountType() {
        char accountType;
        do {
            System.out.print("Enter account type: ");
            accountType = read.next().toUpperCase().charAt(0);
            if(accountType!='A' && accountType!='B' && accountType!='C'){
                System.out.println("You need to choose between 'A', 'B' or 'C' account type.");
            }
        } while (accountType!='A' && accountType!='B' && accountType!='C');

        return accountType;
    }

    public static int validateEmployeeID() {
        int ID;
        do {
            System.out.print("Enter employee's ID: ");
            ID=read.nextInt();
            if(ID>bank.getEmployees().size() || ID<1) {
                System.out.println("The ID you entered doesn't exist.\n");
            }
        } while (ID>bank.getEmployees().size() || ID<1);

        return ID;
    }

    public static int validateAccountID() {
        int ID;
        do {
            System.out.print("Enter account's ID: ");
            ID=read.nextInt();
            if(ID>bank.getBankAccounts().size() || ID<1) {
                System.out.println("The ID you entered doesn't exist.\n");
            }
        } while (ID>bank.getBankAccounts().size() || ID<1);

        return ID;
    }
}
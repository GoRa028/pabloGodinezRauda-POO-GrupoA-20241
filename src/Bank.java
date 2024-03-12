import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Employee> employees;
    private List<BankAccount> bankAccounts;

    public Bank() {
        employees = new ArrayList<>();
        bankAccounts = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void addEmployee(String name, String lastName, long accNumber, char accType) {
        employees.add(new Employee(name, lastName, accNumber, accType));
        bankAccounts.add(new BankAccount(name, lastName, accNumber, accType));
    }

    public void addEmployee(String name, String lastName, long accNumber, char accType, double amount) {
        employees.add(new Employee(name, lastName, accNumber, accType, amount));
        bankAccounts.add(new BankAccount(name, lastName, accNumber, accType, amount));
    }

    public void printEmployees() {
        String employee;
        for(int i=0; i<employees.size(); i++) {
            System.out.println("------------------------------");
            employee="";
            System.out.println("Employee " + (i+1) + ":");
            employee+="Name: " + employees.get(i).getName()+"\n";
            employee+="Last name: " + employees.get(i).getLastName()+"\n";
            employee+=employees.get(i).getEmployeeAccounts();
            System.out.println(employee);
        }
        System.out.println("------------------------------");
    }

    public void printEmployee(int i) {
        String employee = "";
            System.out.println("\nEmployee " + (i) + ":");
            employee+="Name: " + employees.get(i-1).getName()+"\n";
            employee+="Last name: " + employees.get(i-1).getLastName()+"\n";
            employee+=employees.get(i-1).getEmployeeAccounts();
            System.out.println(employee);
    }

    public void printAccounts() {
        String account;
        for (int i=0; i<bankAccounts.size(); i++) {
            System.out.println("------------------------------");
            account = "";
            account += "\tAccount " + (i + 1) + ":\n";
            account += "\tAccount Owner Name: " + bankAccounts.get(i).getOwnerName() + "\n";
            account += "\tAccount Owner Last Name: " + bankAccounts.get(i).getOwnerLastName() + "\n";
            account += "\tAccount Number: " + bankAccounts.get(i).getAccountNumber() + "\n";
            account += "\tAccount Type: " + bankAccounts.get(i).getType() + "\n";
            account += "\tAccount Amount: " + bankAccounts.get(i).getAmount() + "\n";
            System.out.println(account);
        }
        System.out.println("------------------------------");
    }

    public void printAccount(int accountID) {
        String account = "";
        System.out.print("Account " + (accountID) + ":\n");
        account += "\tAccount Owner Name: " + bankAccounts.get(accountID-1).getOwnerName() + "\n";
        account += "\tAccount Owner Last Name: " + bankAccounts.get(accountID-1).getOwnerLastName() + "\n";
        account += "\tAccount Number: " + bankAccounts.get(accountID-1).getAccountNumber() + "\n";
        account += "\tAccount Type: " + bankAccounts.get(accountID-1).getType() + "\n";
        account += "\tAccount Amount: " + bankAccounts.get(accountID-1).getAmount() + "\n";
        System.out.println(account);
    }

    public void addAccount (int employeeID, long accNumber, char accType) {
            employees.get(employeeID-1).addAccount(accNumber, accType);
            bankAccounts.add(new BankAccount(employees.get(employeeID-1).getName(), employees.get(employeeID-1).getLastName(), accNumber, accType));
    }

    public void addAccount (int employeeID, long accNumber, char accType, double amount) {
            employees.get(employeeID-1).addAccount(accNumber, accType, amount);
            bankAccounts.add(new BankAccount(employees.get(employeeID-1).getName(), employees.get(employeeID-1).getLastName(), accNumber, accType, amount));
    }

}

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String lastName;
    private List<BankAccount> accounts = new ArrayList<>();

    public Employee(String name, String lastName, long accNumber, char accType) {
            this.name = name;
            this.lastName = lastName;
            accounts.add(new BankAccount(name, lastName,accNumber, accType));
    }

    public Employee(String name, String lastName, long accNumber, char accType, double quantity) {
            this.name = name;
            this.lastName = lastName;
            accounts.add(new BankAccount(name,lastName, accNumber, accType, quantity));
    }

    public void addAccount(long accNumber, char accType) {
            accounts.add(new BankAccount(this.name,this.lastName,accNumber, accType));
    }

    public void addAccount(long accNumber, char accType, double quantity) {
            accounts.add(new BankAccount(this.name,this.lastName,accNumber, accType, quantity));
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public List<BankAccount> getBankAccounts() {
        return accounts;
    }
    public int getAccountsSize() {
        return accounts.size();
    }

    public String getEmployeeAccounts() {
        String account = "";
        account+="\nEmployee accounts: ";
        for (int i=0; i<getAccountsSize(); i++) {
            if(this.name.equals(accounts.get(i).getOwnerName())) {
                account+="\nAccount " + (i+1) + ":\n";
                account+="\tAccount Number: " + accounts.get(i).getAccountNumber() + "\n";
                account+="\tAccount Type: " + accounts.get(i).getType() + "\n";
                account+="\tAccount Amount: " + accounts.get(i).getAmount() + "\n";
            }
        }
        return account;
    }

}

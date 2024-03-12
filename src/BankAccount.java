public class BankAccount {

    private String ownerName;
    private String ownerLastName;
    private long accountNumber;
    private char accountType;
    private double amount=0;

    public BankAccount(String ownerName, String ownerLastName, long accountNumber, char accountType) {
        this.ownerName = ownerName;
        this.ownerLastName = ownerLastName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public BankAccount(String ownerName, String ownerLastName, long accountNumber, char accountType, double amount) {
        this.ownerName = ownerName;
        this.ownerLastName = ownerLastName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.amount = amount;
    }

    public String getOwnerName() {
        return ownerName;
    }
    public String getOwnerLastName() {
        return ownerLastName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public char getType() {
        return accountType;
    }

    public double getAmount() {
        return this.amount;
    }

    public void makeDeposit(double quant) {
        switch (this.accountType) {
            case 'A':
                if(this.amount+quant<50000)
                    this.amount+=quant;
                else
                    System.out.println("You cannot have more than $50,000 in this account type.");
                break;
            case 'B':
                if(this.amount+quant<100000)
                    this.amount+=quant;
                else
                    System.out.println("You cannot have more than $100,000 in this account type.");
                break;
            case 'C':
                this.amount+=quant;
                break;
        }
    }

    public void withdraw(double quant) {
        switch (this.accountType) {
            case 'A':
                if(this.amount<1000)
                    this.amount+=quant;
                else
                    System.out.println("You need to have at least $1,000 to withdraw money.");
                break;
            case 'B':
                if(this.amount<5000)
                    this.amount+=quant;
                else
                    System.out.println("You need to have at least $5,000 to withdraw money.");
                break;
            case 'C':
                if(this.amount<10000)
                    this.amount+=quant;
                else
                    System.out.println("You need to have at least $10,000 to withdraw money.");
        }
    }
}

// Base class Account — parent of SavingsAccount and LoanAccount
public class Account {

    // Data members
    public int accountNumber;     // Account number
    public double balance;        // Current balance
    public String accountType;    // Type of account

    // Constructor
    public Account(int accNum, double initialBalance, String type) {
        accountNumber = accNum;
        balance = initialBalance;
        accountType = type;
    }

    // deposit method — adds money to balance
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    // withdraw method — deducts money from balance
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
        }
    }

    // displayInfo method — shows account summary
    public void displayInfo() {
        System.out.printf("%-15s %-15d %-15.2f%n", accountType, accountNumber, balance);
    }
}

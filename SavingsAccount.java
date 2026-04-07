// SavingsAccount extends Account — child class
public class SavingsAccount extends Account {

    public double interestRate;   // Interest rate for savings

    // Constructor
    public SavingsAccount(int accNum, double initialBalance, double rate) {
        super(accNum, initialBalance, "Savings");  // Call parent constructor
        interestRate = rate;
    }

    // Override deposit — adds interest message
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("[Savings] Deposited: " + amount + " | Balance: " + balance + " | Interest Rate: " + interestRate + "%");
    }

    // Override withdraw — checks minimum balance
    @Override
    public void withdraw(double amount) {
        if (balance - amount < 500) {   // Minimum balance rule
            System.out.println("[Savings] Cannot withdraw! Minimum balance of 500 must be maintained.");
        } else {
            balance -= amount;
            System.out.println("[Savings] Withdrawn: " + amount + " | Balance: " + balance);
        }
    }
}

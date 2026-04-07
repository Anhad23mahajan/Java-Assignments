// LoanAccount extends Account — child class
public class LoanAccount extends Account {

    public double loanAmount;    // Total loan amount

    // Constructor
    public LoanAccount(int accNum, double loan) {
        super(accNum, loan, "Loan");   // Balance = loan amount (what is owed)
        loanAmount = loan;
    }

    // Override deposit — treated as loan repayment
    @Override
    public void deposit(double amount) {
        balance -= amount;    // Repayment reduces what is owed
        if (balance < 0) balance = 0;
        System.out.println("[Loan] Repayment of: " + amount + " | Remaining Loan: " + balance);
    }

    // Override withdraw — treated as loan disbursement
    @Override
    public void withdraw(double amount) {
        balance += amount;    // Taking more loan increases what is owed
        System.out.println("[Loan] Loan Disbursed: " + amount + " | Total Loan Owed: " + balance);
    }
}

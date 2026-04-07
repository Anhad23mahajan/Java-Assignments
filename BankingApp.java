import java.util.ArrayList;

// Main class — creates customers and accounts, displays consolidated info
public class BankingApp {

    public static void main(String[] args) {

        // Create account objects
        SavingsAccount acc1 = new SavingsAccount(1001, 10000, 4.5);
        LoanAccount acc2 = new LoanAccount(1002, 50000);
        SavingsAccount acc3 = new SavingsAccount(1003, 25000, 3.8);
        LoanAccount acc4 = new LoanAccount(1004, 30000);

        // Create customer objects and link accounts
        Customer c1 = new Customer(101, "Alice Johnson", acc1);
        Customer c2 = new Customer(102, "Bob Smith", acc2);
        Customer c3 = new Customer(103, "Carol White", acc3);
        Customer c4 = new Customer(104, "David Brown", acc4);

        // ArrayList of customers
        ArrayList<Customer> customerList = new ArrayList<>();
        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);
        customerList.add(c4);

        // --- Demo of deposit and withdraw ---
        System.out.println("=== TRANSACTION DEMO ===");
        acc1.deposit(5000);
        acc1.withdraw(200);    // Should work
        acc1.withdraw(14800);  // Should fail (min balance rule)

        acc2.deposit(10000);   // Loan repayment
        acc2.withdraw(5000);   // More loan disbursement

        System.out.println();

        // --- Consolidated Display Table ---
        System.out.println("=== CONSOLIDATED CUSTOMER ACCOUNT INFO ===");
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%-10s %-18s %-15s %-15s %-12s%n",
                "Cust ID", "Customer Name", "Account Type", "Account No.", "Balance");
        System.out.println("--------------------------------------------------------------------");

        // Loop through ArrayList and print each customer's info
        for (Customer c : customerList) {
            System.out.printf("%-10d %-18s %-15s %-15d %-12.2f%n",
                    c.customerId,
                    c.customerName,
                    c.account.accountType,
                    c.account.accountNumber,
                    c.account.balance);
        }

        System.out.println("--------------------------------------------------------------------");
    }
}

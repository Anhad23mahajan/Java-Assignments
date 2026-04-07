// Customer class to store customer details
public class Customer {

    // Customer data members
    public int customerId;        // Unique ID for each customer
    public String customerName;   // Name of the customer
    public Account account;       // Account linked to this customer

    // Constructor to initialize customer
    public Customer(int id, String name, Account acc) {
        customerId = id;
        customerName = name;
        account = acc;
    }
}

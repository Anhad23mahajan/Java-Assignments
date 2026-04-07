// ContractEmployee extends Employee — child class for contract-based staff
public class ContractEmployee extends Employee {

    // Additional data members for contract employees
    public int noOfHrs;        // Total number of hours worked
    public double hourlyRate;  // Pay per hour

    // Constructor to initialize contract employee
    public ContractEmployee(int empId, String name, String panNo,
                            java.time.LocalDate joiningDate,
                            String designation, int noOfHrs,
                            double hourlyRate) {
        super(empId, name, panNo, joiningDate, designation); // Call parent constructor
        this.noOfHrs = noOfHrs;       // Assign hours worked
        this.hourlyRate = hourlyRate; // Assign hourly rate
    }

    // Override calcCTC — contract CTC is hours worked multiplied by hourly rate
    @Override
    public double calcCTC() {
        return noOfHrs * hourlyRate; // CTC = noOfHrs * hourlyRate
    }
}
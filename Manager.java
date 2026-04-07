// Manager extends FullTimeEmployee — grandchild of Employee
public class Manager extends FullTimeEmployee {

    // Additional allowances exclusive to managers
    public double travelAllowance; // Travel allowance (TA)
    public double eduAllowance;    // Education allowance

    // Constructor to initialize manager
    public Manager(int empId, String name, String panNo,
                   java.time.LocalDate joiningDate,
                   String designation, double baseSalary,
                   double perfBonus, double travelAllowance,
                   double eduAllowance) {
        // Call FullTimeEmployee constructor — managers are SWE-type by default
        super(empId, name, panNo, joiningDate, designation,
              baseSalary, perfBonus, 0, "SWE");
        this.travelAllowance = travelAllowance; // Assign travel allowance
        this.eduAllowance = eduAllowance;       // Assign education allowance
    }

    // Override calcCTC — manager CTC includes TA and education allowance
    @Override
    public double calcCTC() {
        return baseSalary + perfBonus + travelAllowance + eduAllowance; // Full CTC formula
    }
}
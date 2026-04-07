// FullTimeEmployee extends Employee — child class for permanent staff
public class FullTimeEmployee extends Employee {

    // Additional data members for full-time employees
    public double baseSalary;       // Monthly base salary
    public double perfBonus;        // Performance bonus
    public double hiringCommission; // Commission applicable for HR role
    public String role;             // Role: "SWE" or "HR"

    // Constructor to initialize full-time employee
    public FullTimeEmployee(int empId, String name, String panNo,
                            java.time.LocalDate joiningDate,
                            String designation, double baseSalary,
                            double perfBonus, double hiringCommission,
                            String role) {
        super(empId, name, panNo, joiningDate, designation); // Call parent constructor
        this.baseSalary = baseSalary;             // Assign base salary
        this.perfBonus = perfBonus;               // Assign performance bonus
        this.hiringCommission = hiringCommission; // Assign hiring commission
        this.role = role;                         // Assign role
    }

    // Override calcCTC — formula depends on role
    @Override
    public double calcCTC() {
        if (role.equalsIgnoreCase("SWE")) {          // Check if role is SWE
            return baseSalary + perfBonus;           // SWE: base + performance bonus
        } else if (role.equalsIgnoreCase("HR")) {    // Check if role is HR
            return baseSalary + hiringCommission;    // HR: base + hiring commission
        } else {
            return baseSalary; // Default: return only base salary for other roles
        }
    }
}
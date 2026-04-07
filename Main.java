import java.util.ArrayList;  // Import ArrayList
import java.time.LocalDate;  // Import LocalDate for joining dates

// Main class — creates employee objects and displays consolidated info
public class Main {

    public static void main(String[] args) {

        // Create FullTimeEmployee objects
        FullTimeEmployee e1 = new FullTimeEmployee(
            101, "Riya Sharma", "ABCPS1234R",
            LocalDate.of(2021, 6, 15), "Software Engineer",
            80000, 15000, 0, "SWE"); // SWE role

        FullTimeEmployee e2 = new FullTimeEmployee(
            102, "Karan Mehta", "XYZPK5678Q",
            LocalDate.of(2020, 3, 10), "HR Executive",
            60000, 0, 20000, "HR"); // HR role

        // Create ContractEmployee objects
        ContractEmployee e3 = new ContractEmployee(
            103, "Sneha Joshi", "LMNPC9012T",
            LocalDate.of(2023, 1, 5), "Contract Developer",
            160, 500); // 160 hrs at 500/hr

        ContractEmployee e4 = new ContractEmployee(
            104, "Amit Tiwari", "PQRPA3456U",
            LocalDate.of(2023, 7, 20), "Contract Tester",
            120, 350); // 120 hrs at 350/hr

        // Create Manager object
        Manager m1 = new Manager(
            105, "Priya Nair", "DEFPM7890V",
            LocalDate.of(2018, 11, 1), "Engineering Manager",
            120000, 30000, 10000, 5000); // Base + bonus + TA + edu

        // Create ArrayList of Employee — stores all types using polymorphism
        ArrayList<Employee> employeeList = new ArrayList<>(); // Initialize list
        employeeList.add(e1); // Add SWE
        employeeList.add(e2); // Add HR
        employeeList.add(e3); // Add Contract Developer
        employeeList.add(e4); // Add Contract Tester
        employeeList.add(m1); // Add Manager

        // Print consolidated table header
        System.out.println("=== EMPLOYEE CTC REPORT ===");
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("%-6s %-20s %-22s %-15s %-12s%n",
            "EmpID", "Name", "Designation", "Joining Date", "CTC (INR)"); // Column headers
        System.out.println("-----------------------------------------------------------------------");

        // Loop through ArrayList and display each employee's details
        for (Employee emp : employeeList) {
            System.out.printf("%-6d %-20s %-22s %-15s %-12.2f%n",
                emp.empId,           // Print employee ID
                emp.name,            // Print name
                emp.designation,     // Print designation
                emp.joiningDate,     // Print joining date
                emp.calcCTC());      // Call overridden calcCTC() polymorphically
        }

        System.out.println("-----------------------------------------------------------------------");

        // --- TEST CASES ---
        System.out.println("\n=== TEST CASES ===");

        // Test Case 1 — SWE CTC
        System.out.println("\nTest Case 1 - SWE CTC:");
        System.out.println("Expected: 80000 + 15000 = 95000.0");
        System.out.println("Actual  : " + e1.calcCTC()); // Call SWE calcCTC

        // Test Case 2 — HR CTC
        System.out.println("\nTest Case 2 - HR CTC:");
        System.out.println("Expected: 60000 + 20000 = 80000.0");
        System.out.println("Actual  : " + e2.calcCTC()); // Call HR calcCTC

        // Test Case 3 — Contract CTC
        System.out.println("\nTest Case 3 - Contract CTC:");
        System.out.println("Expected: 160 * 500 = 80000.0");
        System.out.println("Actual  : " + e3.calcCTC()); // Call Contract calcCTC

        // Test Case 4 — Manager CTC
        System.out.println("\nTest Case 4 - Manager CTC:");
        System.out.println("Expected: 120000 + 30000 + 10000 + 5000 = 165000.0");
        System.out.println("Actual  : " + m1.calcCTC()); // Call Manager calcCTC

        // Test Case 5 — Zero hours contract employee
        ContractEmployee e5 = new ContractEmployee(
            106, "Ghost Worker", "ZZZZZ0000Z",
            LocalDate.of(2024, 1, 1), "Intern",
            0, 300); // 0 hours worked
        System.out.println("\nTest Case 5 - Zero Hours Contract:");
        System.out.println("Expected: 0 * 300 = 0.0");
        System.out.println("Actual  : " + e5.calcCTC()); // Should return 0
    }
}

import java.time.LocalDate; // Import LocalDate for joining date

// Abstract root class — parent of all employee types
public abstract class Employee {

    // Public data members
    public String name;           // Employee's full name
    public String panNo;          // PAN card number
    public LocalDate joiningDate; // Date of joining the company
    public String designation;    // Job title / designation
    public int empId;             // Unique employee ID

    // Constructor to initialize all common employee fields
    public Employee(int empId, String name, String panNo,
                    LocalDate joiningDate, String designation) {
        this.empId = empId;             // Assign employee ID
        this.name = name;               // Assign name
        this.panNo = panNo;             // Assign PAN number
        this.joiningDate = joiningDate; // Assign joining date
        this.designation = designation; // Assign designation
    }

    // Abstract method — must be overridden by all child classes
    public abstract double calcCTC();
}
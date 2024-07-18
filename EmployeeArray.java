package com.apjfsa;

public class EmployeeArray {
    // Variable to store employee ID
    int EmpID;

    // Variable to store employee name
    String EmpName;

    // Variable to store employee salary
    int EmpSalary;

    // Variable to store employee department
    String EmpDepartment;

    // Constructor to initialize employee details
    public EmployeeArray(int empID, String empName, int empSalary, String empDepartment) {
        // Calling the superclass constructor
        super();

        // Assigning the parameters to the class variables
        EmpID = empID;
        EmpName = empName;
        EmpSalary = empSalary;
        EmpDepartment = empDepartment;
    }

    // Method to return a string representation of the object
    @Override
    public String toString() {
        // Returning a string in the format "EmployeeArray [EmpID=<empID>, EmpName=<empName>, EmpSalary=<empSalary>, EmpDepartment=<empDepartment>]"
        return "EmployeeArray [EmpID=" + EmpID + ", EmpName=" + EmpName + ", EmpSalary=" + EmpSalary + ", EmpDepartment=" + EmpDepartment + "]";
    }
}

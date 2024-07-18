package com.apjfsa;

public class EmpArray {
    public static void main(String[] args) {
        // Creating an array of EmployeeArray objects
        EmployeeArray[] emp = new EmployeeArray[5];

        // Initializing the array with employee details
        emp[0] = new EmployeeArray(101, "Akshitha", 45000, "sales executive");
        emp[1] = new EmployeeArray(102, "Harika", 40000, "Accountant");
        emp[2] = new EmployeeArray(103, "Trisha", 50000, "Software Developer");
        emp[3] = new EmployeeArray(104, "Manasa", 55000, "Front-end Developer");
        emp[4] = new EmployeeArray(105, "Tejaswi", 42000, "sales executive");

        // Loop to print the employee details
        for (EmployeeArray e : emp) {
            // Printing the employee details using the toString method
            System.out.println(e);
        }
    }
}

package com.amazon.day3.Employee;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        Employee emp1  = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();


        emp1.setEmployeeID(3422);
        emp1.setEmployeeName("Steve Jobs");
        emp1.setSalary(878991);

        emp2.setEmployeeID(3423);
        emp2.setEmployeeName("Bill Gates");
        emp2.setSalary(87899001);

        emp3.setEmployeeID(3424);
        emp3.setEmployeeName("Warren Buffet");
        emp3.setSalary(87899144);


        System.out.println("Employee Details: ");
        System.out.println("EMPLOYEE 1");
        System.out.println("Employee ID: "+emp1.getEmployeeID());
        System.out.println("Employee Name: "+emp1.getEmployeeName());
        System.out.println("Employee Salary: "+emp1.getSalary());
        System.out.println("------------------------------------------------");

        System.out.println("EMPLOYEE 2");
        System.out.println("Employee ID: "+emp2.getEmployeeID());
        System.out.println("Employee Name: "+emp2.getEmployeeName());
        System.out.println("Employee Salary: "+emp2.getSalary());
        System.out.println("------------------------------------------------");

        System.out.println("EMPLOYEE 3");
        System.out.println("Employee ID: "+emp3.getEmployeeID());
        System.out.println("Employee Name: "+emp3.getEmployeeName());
        System.out.println("Employee Salary: "+emp3.getSalary());
        System.out.println("------------------------------------------------");

        System.out.println("THE END");

    }
}

package com.bridgelabz.employeepayrollservice;

public class EmployeePayrollService {
    public int id;
    public String name;
    public double salary;

    public EmployeePayrollService(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "[Employee id=" + id + ", name=" + name + ", salary=" + salary + "]";}
    

} 
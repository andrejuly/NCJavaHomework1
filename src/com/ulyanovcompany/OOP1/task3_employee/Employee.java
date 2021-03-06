package com.ulyanovcompany.OOP1.task3_employee;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        int finalSalary = salary + salary * percent / 100;
        return finalSalary;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", name='" + getName() + '\'' +
                ", salary=" + salary +
                ']';
    }
}

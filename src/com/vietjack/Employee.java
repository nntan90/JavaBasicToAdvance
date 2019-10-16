package com.vietjack;

public class Employee {
    private String name;
    private String salary;
    private Address address;

    public void display(){
        System.out.println("This is employee info: ");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        address.display();
    }

    public Employee(String name, String salary, Address address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

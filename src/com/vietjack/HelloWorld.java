package com.vietjack;

public class HelloWorld {
    public static void main(String[] args) {
        /*
        BankAccount tanAccount = new BankAccount("12345678", 100.0, "Nguyen Ngoc Tan", "086863883", "nguyenngoctan1990@gmail.com");
        tanAccount.deposit(200);
        tanAccount.withdrawn(250);
        */

        /*
        Dog dog = new Dog("5","20","black", "2", "4");
        dog.move();
         */
        Address addressEmployee = new Address("Huynh Thi Hai", "Ho Chi Minh","012355656334");
        Employee employee = new Employee("Tan", "10.000.000 vnd",addressEmployee);
        employee.display();

        int row = 'A' + 1;
        System.out.println("Test"+row);
    }
}

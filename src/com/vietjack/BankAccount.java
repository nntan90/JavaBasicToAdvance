package com.vietjack;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String phone;
    private String email;

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Ban vua thuc hien nap " + amount + " thanh cong");
        System.out.println("So du tai khoan hien tai: " + this.balance);
    }
    public void withdrawn(double amount){
        if(amount > balance){
            System.out.println("Thao tac khong thanh cong !");
            System.out.println("So du hien tai khong du");
        } else {
            this.balance -= amount;
            System.out.println("Rut tien thanh cong !");
            System.out.println("So du tai khoan hien tai: " + this.balance);

        }
    }

    public BankAccount(){
    this("00000000", 0.0, "Default", "00000000", "default");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String phone, String email) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.phone = phone;
        this.email = email;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

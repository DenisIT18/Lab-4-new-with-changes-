/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.account;

/**
 *
 * @author Денис
 */
import java.util.Date;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0.0;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public String toString() {
        return "Account ID: " + id + "\nBalance: $" + balance + "\nAnnual Interest Rate: " + annualInterestRate + "%\nDate Created: " + dateCreated;
    }
}

class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String toString() {
        return "Checking Account\n" + super.toString() + "\nOverdraft Limit: $" + overdraftLimit;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public String toString() {
        return "Savings Account\n" + super.toString();
    }
}

class Main {
    public static void main(String[] args) {
        Account account = new Account(1001, 10000.0);
        SavingsAccount savingsAccount = new SavingsAccount(2001, 5000.0);
        CheckingAccount checkingAccount = new CheckingAccount(3001, 3000.0, 1000.0);

        System.out.println(account);
        System.out.println("\n" + savingsAccount);
        System.out.println("\n" + checkingAccount);
    }
}

package com.will;

public class BankAccount {

    public int balance;
    public String firstName;
    public String lastName;
    public String accountType;
    public int ssn;

    public BankAccount(int balance, String firstName, String lastName, String accountType, int ssn) {
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountType = accountType;
        this.ssn = ssn;
    }


    public void withdraw(int num){
        int count = 0;
    if (balance >= num) {
        balance -= num;
        System.out.println("withdrew: " + num );
        count++;
        }
    }

    public void deposit(int num) {
        if (num > 0) {
        balance += num;
        System.out.println("Deposited: " + num);
        }
    }

    @Override
    public String toString() {
        return "type: " + accountType + "\tOwner: " + firstName + " " + lastName + "\tBalance:" + balance;
    }
}

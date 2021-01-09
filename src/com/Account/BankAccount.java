package com.Account;

public class BankAccount {

    protected int balance;
    private String firstName;
    private String lastName;
    private String accountType;
    private int ssn;

    public BankAccount(int balance, String firstName, String lastName, String accountType, int ssn) {
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountType = accountType;
        this.ssn = ssn;
    }

    public void withdrawCounter() {
        int count = 0;
    }


    public void withdraw(int num){
    if (balance >= num) {
            balance -= num;
            System.out.println("withdrew: " + num/100 );
        }
    }

    public void deposit(int num) {
        if (num > 0) {
        balance += num;
        System.out.println("Deposited: " + num/100);
        }
    }

    @Override
    public String toString() {
        int dollar = balance / 100;
        int cents = balance % 100;
        String balanceF = "$" + dollar + "." + cents;
        return "type: " + accountType + "\tOwner: " + firstName + " " + lastName + "\tBalance:" + balanceF;
    }

}

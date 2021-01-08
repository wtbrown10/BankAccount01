package com.will;

public class SavingsAccount extends BankAccount{
    private int minimumBalance = 10000;
    private int withdrawLimitPerMonth = 5;
    private int interest;

    public SavingsAccount(int balance, String firstName, String lastName, String accountType, int ssn, int interest) {
        super(balance, firstName, lastName, "Savings", ssn);
        this.interest = interest;

    }

    public void resetMinimumBalance(){
        minimumBalance = 10000;
    }

    public void calculateInterest(){
        System.out.println("debug interest: " + ((double)interest / 100));
        balance += (int)(balance * (interest / 100));
    }

}

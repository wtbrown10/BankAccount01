package com.Account;

public class InvestmentAccount extends BankAccount{
    protected int investment;
    private int period = 3;

    // constructor
    public InvestmentAccount(int balance, String firstName, String lastName, String accountType, int ssn, int investment) {
        super(balance, firstName, lastName, accountType, ssn);
        this.investment = investment;
    }

    public void applyInvestment() {
        System.out.println("Investment rate: " + (double)investment / 100);
        System.out.println("Investment earned: " + ((int)balance * ((double)investment / 100)) / 100);
        balance += (int)balance * ((double)investment / 100);

    }
}

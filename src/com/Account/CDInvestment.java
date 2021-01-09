package com.Account;

public class CDInvestment extends InvestmentAccount{
    private int timePeriod;

    public CDInvestment(int balance, String firstName, String lastName, String accountType, int ssn, int timePeriod) {
        super(balance, firstName, lastName, "CD", ssn, 5);
        this.timePeriod = timePeriod;
    }

    public void checkIfInterest(int time) {
        if (time <= timePeriod && balance > 0) {
            applyInvestment();
        }

    }

    @Override
    public void withdraw(int num) {
        System.out.println("Cannot withdraw from CD account!!");
        return;
    }

}

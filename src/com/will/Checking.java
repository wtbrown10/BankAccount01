package com.will;

public class Checking extends BankAccount{
    private int dailyLimit;
    private int dailyWithdrawn = 0;


    public Checking(int balance, String firstName, String lastName, String accountType, int ssn, int dailyLimit) {
        super(balance, firstName, lastName, "checking", ssn);
        this.dailyLimit = dailyLimit;

    }

    public void resetDailyWithdrawn(){
        dailyWithdrawn = 0;
    }

    @Override
    public void withdraw(int num) {
        if (dailyWithdrawn + num > dailyLimit) {
            System.out.println("Error over Limit");
            return;
        }
        super.withdraw(num);
        dailyWithdrawn += num;
    }
}
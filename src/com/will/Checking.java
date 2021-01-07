package com.will;

public class Checking {
    public int accountNumber;
    public int dailyLimit;
    public int debitCard;


    public Checking(int accountNumber, int checkingBalance, int dailyLimit, int debitCard) {
        this.accountNumber = accountNumber;
        this.dailyLimit = dailyLimit;
        this.debitCard = debitCard;
    }
}
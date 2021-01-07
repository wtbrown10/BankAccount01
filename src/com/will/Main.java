package com.will;

public class Main {

    public static void main(String[] args) {
	// write your code here
       BankAccount bankAccount = new BankAccount(100, "Will", "Brown", "Checking", 123456);
        System.out.println(bankAccount.firstName);
        bankAccount.deposit(500);
        System.out.println(bankAccount.balance);
        bankAccount.withdraw(50);
        System.out.println(bankAccount.balance);
    }

}

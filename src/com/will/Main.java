package com.will;

public class Main {

    public static void main(String[] args) {
	// write your code here
       BankAccount myAcct = new BankAccount(10000, "Will", "Brown", "Account", 123456);
       Checking checkingAccount = new Checking(700000, "Tom", "Bell", "Checking", 987656, 50000);
       SavingsAccount savings = new SavingsAccount(20000, "Alex", "Smith", "Savings", 12131, 50);
        System.out.println(checkingAccount.toString());
        checkingAccount.deposit(4000);
        System.out.println(checkingAccount.toString());
        checkingAccount.withdraw(40000);
        System.out.println(checkingAccount.toString());
        System.out.println(savings.toString());
        savings.calculateInterest();
        System.out.println(savings.toString());
//        System.out.println(myAcct.toString());
//        myAcct.deposit(50000);
//        System.out.println(myAcct.toString());
//        System.out.println(myAcct.balance);
//        myAcct.withdraw(5000);
//        System.out.println(myAcct.toString());
//        System.out.println(myAcct.balance);
    }

}

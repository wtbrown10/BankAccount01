package com.will;

import com.Account.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
       BankAccount myAcct = new BankAccount(10000, "Will", "Brown", "Account", 123456);
       Checking checkingAccount = new Checking(700000, "Tom", "Bell", "Checking", 987656, 50000);
       SavingsAccount savings = new SavingsAccount(20000, "Alex", "Smith", "Savings", 12131, 5);
        InvestmentAccount investment = new InvestmentAccount(50000, "David", "Strong", "Investment", 123456, 3);
        CDInvestment cd = new CDInvestment(400000, "Sam", "Long", "CD" ,123456, 4);
        System.out.println(checkingAccount.toString());
        checkingAccount.deposit(4000);
        System.out.println(checkingAccount.toString());
        checkingAccount.withdraw(40000);
        System.out.println(checkingAccount.toString());
        System.out.println(savings.toString());
        savings.calculateInterest();
        System.out.println(savings.toString());
        System.out.println(investment.toString());
        investment.applyInvestment();
        System.out.println(investment.toString());
        System.out.println(cd.toString());
        cd.checkIfInterest(3);
        System.out.println(cd.toString());
        cd.withdraw(2000);

//        System.out.println(myAcct.toString());
//        myAcct.deposit(50000);
//        System.out.println(myAcct.toString());
//        System.out.println(myAcct.balance);
//        myAcct.withdraw(5000);
//        System.out.println(myAcct.toString());
//        System.out.println(myAcct.balance);
    }

}
